package com.example.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.LeadingIconTab
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.app.ui.components.ArticleItem
import com.example.app.ui.components.NotificationContent
import com.example.app.ui.components.SwiperContent
import com.example.app.ui.components.TopAppBar
import com.example.app.ui.components.VideoItem
import com.example.app.viewmodel.ArticleViewModel
import com.example.app.viewmodel.MainViewModel
import com.example.app.viewmodel.VideoViewModel


@Composable
fun StudyScreen(
    statusBarHeight: Int,
    vm: MainViewModel = viewModel(),
    articleViewModel: ArticleViewModel = viewModel(),
    videoViewModel: VideoViewModel = viewModel(),
) {
    Column(modifier = Modifier) {
        //标题栏
        TopAppBar(modifier = Modifier.padding(horizontal = 8.dp), statusBarHeight) {

            //搜索
            Surface(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .weight(1f),
                color = Color(0x33FFFFFF)
            ) {
                Row(
                    modifier = Modifier.padding(
                        horizontal = 8.dp,
                        vertical = 4.dp,
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(13.dp)
                    )
                    Text(
                        "搜索感兴趣的资讯或课程",
                        color = Color.White,
                        fontSize = 12.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))
            //学习进度
            Text(text = "学习\n进度", fontSize = 10.sp, color = Color.White)

            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "26%", fontSize = 12.sp, color = Color.White)

            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                tint = Color.White
            )

        }

        //分类标签
        TabRow(
            selectedTabIndex = vm.categoryIndex,
            Modifier.background(Color(0x22149EE7)),
            contentColor = Color(0xFF149EE7)
        ) {
            vm.categories.forEachIndexed { index, category ->
                Tab(
                    selected = vm.categoryIndex == index,
                    onClick = {
                        vm.updateCategoryIndex(index)
                    },
                    selectedContentColor = Color(0xFF149EE7),
                    unselectedContentColor = Color(0xFF666666),
                ) {
                    Text(
                        text = category.title,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }
        }

        //类型
        TabRow(
            selectedTabIndex = vm.currentTypeIndex,
            Modifier.background(Color.Transparent),
            contentColor = Color(0xFF149EE7),
            indicator = {},
            divider = {}
        ) {
            vm.types.forEachIndexed { index, item ->
                LeadingIconTab(
                    selected = vm.currentTypeIndex == index,
                    onClick = {
                        vm.updateTypeIndex(index)
                    },
                    selectedContentColor = Color(0xFF149EE7),
                    unselectedContentColor = Color(0xFF666666),
                    icon = {
                        Icon(imageVector = item.icon, contentDescription = null)
                    },
                    text = {
                        Text(
                            text = item.title,
                            modifier = Modifier.padding(vertical = 8.dp),
                            fontSize = 16.sp
                        )
                    }
                )
            }
        }

        LazyColumn() {
            //轮播图
            item { SwiperContent(vm) }

            //通知公告
            item { NotificationContent(vm) }

            if (vm.showArticleList) {
                //文章列表
                items(articleViewModel.list) { article ->
                    ArticleItem(article)
                }
            } else {
                //视频列表
                items(videoViewModel.list) { video ->
                    VideoItem(video)
                }
            }

        }
    }
}

@Preview
@Composable
fun StudyScreenPreview() {
    StudyScreen(20)
}
