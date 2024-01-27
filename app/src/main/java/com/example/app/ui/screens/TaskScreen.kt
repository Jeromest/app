package com.example.app.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.model.entity.ApiResponse
import com.example.app.model.entity.ApiService
import com.example.app.ui.components.TopAppBar
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//const val url = "https://publicobject.com/helloworld.txt"
//
//val retrofit: Retrofit = Retrofit.Builder()
//    .baseUrl(url)
//    .addConverterFactory(GsonConverterFactory.create()) // 使用Gson进行转换，您也可以选择其他转换器
//    .client(OkHttpClient()) // 可以配置自定义的OkHttpClient
//    .build()

@Composable
fun TaskScreen(statusBarHeight: Int) {
    Column(modifier = Modifier) {
        TopAppBar(modifier = Modifier, statusBarHeight) {
            Text(text = "任务", color = Color.White)
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp) // 外边距
                .clickable{ },

            // 设置点击波纹效果，注意如果 CardDemo() 函数不在 MaterialTheme 下调用
            // 将无法显示波纹效果

//        elevation = 10.dp // 设置阴影
        ) {
            Column(
                modifier = Modifier.padding(15.dp) // 内边距
            ) {
                Text(
                    buildAnnotatedString {
                        append("欢迎来到 ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(0xFF4552B8))
                        ) {
                            append("Jetpack Compose 博物馆")
                        }
                    }
                )
                Text(
                    buildAnnotatedString {
                        append("你现在观看的章节是 ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.W900)) {
                            append("Card")
                        }
                    }
                )
            }
//        Button(
//            onClick = {
//
//            },
//            modifier = Modifier.padding(100.dp, 0.dp)
//        ) {
//            Text(text = "hello")
//            NetworkExample()
//        }
        }
    }
}

//@Composable
//fun NetworkExample() {
//    val apiService = retrofit.create(ApiService::class.java)
//    val dataState = remember { mutableStateOf<ApiResponse?>(null) }
//
//    LaunchedEffect(true) {
//        try {
//            val response = apiService.fetchData()
//            dataState.value = response
//        } catch (e: Exception) {
//            // Handle error
//        }
//    }
//
//    // Render UI using dataState.value
//    dataState.value?.let { data ->
//        Text(text = "Fetched data: $data")
//    }
//}

@Preview
@Composable
fun TaskScreenPreview() {
    TaskScreen(20)
}