package com.example.livecapture.harmony

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { LiveCaptureApp() }
    }
}

@Composable
fun LiveCaptureApp() {
    val tabs = listOf("Home", "Gallery", "Mine")
    var selected by remember { mutableStateOf(0) }
    val primary = PrimaryColor
    MaterialTheme(colorScheme = lightColorScheme(primary = primary)) {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    tabs.forEachIndexed { index, label ->
                        NavigationBarItem(
                            selected = selected == index,
                            onClick = { selected = index },
                            label = { Text(label) },
                            icon = {}
                        )
                    }
                }
            }
        ) { _ ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = tabs[selected], color = primary, style = MaterialTheme.typography.headlineMedium)
            }
        }
    }
}

private val PrimaryColor = Color(0xFF6200EE)

