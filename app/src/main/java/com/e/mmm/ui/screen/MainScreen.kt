package com.e.mmm.ui.screen

import android.annotation.SuppressLint
import android.webkit.WebView
import androidx.activity.compose.BackHandler
import androidx.compose.material3.*
import androidx.compose.runtime.*

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val url = "https://dayoon07.github.io/shortform-client/"
    var webView: WebView? by remember { mutableStateOf(null) }

    BackHandler(enabled = webView?.canGoBack() == true) {
        webView?.goBack()
    }

    Scaffold {
        WebViewScreen(url = url)
    }
}
