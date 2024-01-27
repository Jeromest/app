package com.example.app.viewmodel

import androidx.lifecycle.ViewModel
import com.example.app.model.entity.VideoEntity

class VideoViewModel : ViewModel() {
    //文章列表数据
    var list = listOf(
        VideoEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "视频课程",
            "00:03:00",
            "https://images.shobserver.com/news/690_390/2024/01/27/l_cb20240127051201566086.jpg"
        ),
        VideoEntity(
            "禁止金属精炼技术出口，美芯片禁令或将遭到中国科技的有力回击",
            "视频课程",
            "00:03:00",
            "https://pics3.baidu.com/feed/bf096b63f6246b60c8b1ede24d446e41500fa237.jpeg@f_auto?token=888a41ccfeb930746987b412d2ac4a5d"
        ),
        VideoEntity(
            "2023年亚洲城市经济总量前十排名，深圳的崛起并非偶然",
            "视频课程",
            "00:03:00",
            "https://pics3.baidu.com/feed/94cad1c8a786c9175eebe7476f8104c23ac75729.jpeg@f_auto?token=7d4a60e31774f37e3a2bb5e41a2a340d"
        ),
        VideoEntity(
            "腊月十七鞭炮响，是00后很难体会到的“爆竹声中的年味”了",
            "视频课程",
            "00:03:00",
            "https://pics3.baidu.com/feed/960a304e251f95ca45b6ad3e6fab0b33650952c4.jpeg@f_auto?token=d7d5f97f6f86520ba766a4a408c0e1bb"
        ),
        VideoEntity(
            "光伏市场大变局，关闭本土最大光伏组件厂引发行业震荡",
            "视频课程",
            "00:03:00",
            "https://pics3.baidu.com/feed/960a304e251f95ca45b6ad3e6fab0b33650952c4.jpeg@f_auto?token=d7d5f97f6f86520ba766a4a408c0e1bb"
        ),
        VideoEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "视频课程",
            "00:03:00",
            "https://pics3.baidu.com/feed/960a304e251f95ca45b6ad3e6fab0b33650952c4.jpeg@f_auto?token=d7d5f97f6f86520ba766a4a408c0e1bb"
        ),
        VideoEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "环球网",
            "00:03:00",
            "https://pics3.baidu.com/feed/960a304e251f95ca45b6ad3e6fab0b33650952c4.jpeg@f_auto?token=d7d5f97f6f86520ba766a4a408c0e1bb"
        ),
        VideoEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "环球网",
            "00:03:00",
            "https://pics3.baidu.com/feed/960a304e251f95ca45b6ad3e6fab0b33650952c4.jpeg@f_auto?token=d7d5f97f6f86520ba766a4a408c0e1bb"
        )
    )
        private set
}