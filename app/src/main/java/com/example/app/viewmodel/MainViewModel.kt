package com.example.app.viewmodel

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.app.model.entity.Category
import com.example.app.model.entity.DataType
import com.example.app.model.entity.SwiperEntity

class MainViewModel : ViewModel() {

    //分类数据
    val categories by mutableStateOf(
        listOf(
            Category("思想政治"),
            Category("法律法规"),
            Category("职业道德"),
            Category("诚信自律")
        )
    )

    //当前分类下标
    var categoryIndex by mutableIntStateOf(0)
        private set

    /**
     * 更新分类下标
     */
    fun updateCategoryIndex(index: Int) {
        categoryIndex = index
    }

    //类型数据
    val types by mutableStateOf(
        listOf(
            DataType("相关资讯", Icons.Default.Description),
            DataType("视频课程", Icons.Default.VideoLibrary)
        )
    )

    //当前类型下标
    var currentTypeIndex by mutableIntStateOf(0)
        private set

    val showArticleList: Boolean get() = currentTypeIndex == 0

    /**
     * 更新类型下标
     */
    fun updateTypeIndex(index: Int) {
        currentTypeIndex = index
    }

    //轮播图数据
    val swiperData = listOf(
        SwiperEntity("https://img1.maka.im/user/5220742/poster/T_VZYMWJIS/T_VZYMWJIS_v3.jpg"),
        SwiperEntity("https://img.zcool.cn/community/0121e65c3d83bda8012090dbb6566c.jpg@3000w_1l_0o_100sh.jpg"),
        SwiperEntity("https://img.zcool.cn/community/01ebc859b26078a801211d256e3419.jpg@1280w_1l_2o_100sh.jpg")
    )

    //通知数据
    val notifications = listOf(
        "通知测试1通知测试1",
        "通知测试2",
        "通知测试3ABCDEFG",
        "通知测试4通知测试4通知测试4",
        "通知测试5",
        "通知测试6"
    )

}