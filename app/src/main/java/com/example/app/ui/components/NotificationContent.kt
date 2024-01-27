package com.example.app.ui.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.viewmodel.MainViewModel
import com.google.accompanist.pager.VerticalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import java.util.Timer
import java.util.TimerTask

@Composable
fun NotificationContent(vm: MainViewModel) {

    //虚拟页数
    val virtualCount = Int.MAX_VALUE

    //实际页数
    val actualCount = vm.notifications.size

    //初始图片下标
    val initialIndex = virtualCount / 2

    val pagerState = rememberPagerState(initialPage = initialIndex)

    val coroutineScope = rememberCoroutineScope()

    DisposableEffect(Unit) {
        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                coroutineScope.launch {
                    pagerState.animateScrollToPage(pagerState.currentPage + 1)
                }
            }
        }, 2000, 3000)
        onDispose {
            timer.cancel()
        }
    }

    Row(
        modifier = Modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFE7F2F8))
            .height(45.dp)
            .padding(horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "最新活动", color = Color(0xFF17B0F5), fontSize = 14.sp
        )

        Spacer(modifier = Modifier.width(8.dp))

        VerticalPager(
            count = virtualCount,
            state = pagerState,
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.Start
        ) { index ->
            val actualIndex = (index - initialIndex).floorMod(actualCount)
            Text(
                text = vm.notifications[actualIndex],
                color = Color(0xFF333333),
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = "更多",
            color = Color(0xFF666666),
            fontSize = 14.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview
@Composable
fun NotificationContentPreview() {
//    NotificationContent()
}

