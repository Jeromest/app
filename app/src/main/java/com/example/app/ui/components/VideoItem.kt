package com.example.app.ui.components


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import coil.compose.AsyncImage
import com.example.app.model.entity.VideoEntity

@Composable
fun VideoItem(video: VideoEntity) {

    val constraintSet = ConstraintSet {
        val cover = createRefFor("cover")
        val title = createRefFor("title")
        val type = createRefFor("type")
        val duration = createRefFor("duration")
        val divider = createRefFor("divider")

        constrain(cover) {
            start.linkTo(parent.start)
            centerVerticallyTo(parent)
            width = Dimension.value(115.5.dp)
        }

        constrain(title) {
            start.linkTo(cover.end, margin = 8.dp)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
        }

        constrain(type) {
            start.linkTo(title.start)
            bottom.linkTo(parent.bottom)
        }

        constrain(duration) {
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        }

        constrain(divider) {
            bottom.linkTo(cover.bottom)
        }
    }

    ConstraintLayout(
        constraintSet,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        AsyncImage(
            model = video.imageUrl,
            contentDescription = null,
            modifier = Modifier
                .layoutId("cover")
                .fillMaxWidth()
                .aspectRatio(16 / 9f)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )

        Text(
            text = video.title,
            color = Color(0xFF333333),
            fontSize = 16.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.layoutId("title")
        )

        Text(
            text = "类型：${video.type}",
            color = Color(0xFFB6B6B6),
            fontSize = 10.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.layoutId("type")
        )

        Text(
            text = "时长：${video.duration}",
            color = Color(0xFFB6B6B6),
            fontSize = 10.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.layoutId("duration")
        )
    }

    Divider(
        modifier = Modifier
            .layoutId("divider")
            .padding(8.dp),
        color = Color(0xFFF1F1F1)
    )

}

@Preview
@Composable
fun VideoItemPreview() {
//    VideoItem()
}