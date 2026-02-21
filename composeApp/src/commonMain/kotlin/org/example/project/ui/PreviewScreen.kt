package org.example.project.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.compose.*
import mobile_hw2.composeapp.generated.resources.Res
import mobile_hw2.composeapp.generated.resources.preview_img_uri
import mobile_hw2.composeapp.generated.resources.preview_text
import mobile_hw2.composeapp.generated.resources.zaglushka_2
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun PreviewScreen(onBeginButtonClicked: () -> Unit) {
    MaterialTheme(
        colorScheme = (if (isSystemInDarkTheme()) darkScheme else lightScheme)
    ) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .fillMaxSize(),
            contentAlignment = Alignment.TopStart
        ) {
            AsyncImage(
                model = stringResource(Res.string.preview_img_uri),
                contentDescription = null,
                error = painterResource(Res.drawable.zaglushka_2),
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxHeight()
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 0.dp, vertical = 40.dp)
            ) {
                Text(
                    text = stringResource(Res.string.preview_text),
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(20.dp),
                    fontSize = 30.sp,
                    color = Color.White,
                )

                Button(
                    modifier = Modifier.fillMaxWidth().padding(40.dp),
                    shape = RoundedCornerShape(10.dp),
                    onClick = onBeginButtonClicked) {
                    Text("Начать")
                }
            }
        }
    }
}