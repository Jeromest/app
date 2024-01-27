package com.example.app.viewmodel

import androidx.lifecycle.ViewModel
import com.example.app.model.entity.ArticleEntity

class ArticleViewModel : ViewModel() {
    //文章列表数据
    var list = listOf(
        ArticleEntity(
            "腊月十七鞭炮响，是00后很难体会到的“爆竹声中的年味”了",
            "百度新闻",
            "2024-01-27 12:25"
        ),
        ArticleEntity(
            "光伏市场大变局，关闭本土最大光伏组件厂引发行业震荡",
            "新能源速递",
            "2024-01-19 23:30"
        ),
        ArticleEntity(
            "2023年亚洲城市经济总量前十排名，深圳的崛起并非偶然",
            "温财经",
            "2024-01-22 02:13"
        ),
        ArticleEntity(
            "禁止金属精炼技术出口，美芯片禁令或将遭到中国科技的有力回击",
            "自Ran木根艺",
            "2024-01-24 09:40"
        ),
        ArticleEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "环球网",
            "2024-01-22 07:34"
        ),
        ArticleEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "环球网",
            "2024-01-22 07:34"
        ),
        ArticleEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "环球网",
            "2024-01-22 07:34"
        ),
        ArticleEntity(
            "美媒：红海危机表明中国的“一带一路”倡议对所有国家都至关重要",
            "环球网",
            "2024-01-22 07:34"
        )
    )
        private set
}