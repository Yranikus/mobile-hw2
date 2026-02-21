package org.example.project.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.*
import mobile_hw2.composeapp.generated.resources.Homenaje_Regular
import mobile_hw2.composeapp.generated.resources.Res
import mobile_hw2.composeapp.generated.resources.email
import mobile_hw2.composeapp.generated.resources.login
import mobile_hw2.composeapp.generated.resources.logo_text
import mobile_hw2.composeapp.generated.resources.password
import mobile_hw2.composeapp.generated.resources.placeholder_email
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource

@Composable
fun LoginScreen(onLoginButtonClicked: () -> Unit) {
    MaterialTheme(
        colorScheme = (if (isSystemInDarkTheme()) darkScheme else lightScheme)
    ) {
        var login by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(horizontal = 30.dp, vertical = 60.dp)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = stringResource(Res.string.logo_text),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(Res.font.Homenaje_Regular)),
                color = Color.White,
                fontSize = 90.sp,
                modifier = Modifier.fillMaxWidth().padding(bottom = 40.dp)
            )
            Text(text = stringResource(Res.string.email), textAlign = TextAlign.Left, color = Color.White,)
            TextField(
                value = login,
                onValueChange = {login = it},
                placeholder = { Text(stringResource(Res.string.placeholder_email), fontSize = 20.sp) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, bottom = 30.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                textStyle = TextStyle(fontSize = 20.sp),
            )
            Text(
                text = stringResource(Res.string.password),
                textAlign = TextAlign.Left,
                color = Color.White)
            TextField(
                value = password,
                onValueChange = {password = it},
                placeholder = { Text(stringResource(Res.string.password), fontSize = 20.sp) },
                textStyle = TextStyle(fontSize = 20.sp),
                colors = TextFieldDefaults.colors(
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp, bottom = 60.dp)
            )
            Button(
                onClick = onLoginButtonClicked,
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(5.dp),
            ) {
                Text(stringResource(Res.string.login), fontSize = 20.sp)
            }
        }
    }
}