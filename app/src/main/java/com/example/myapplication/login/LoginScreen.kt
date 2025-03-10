package com.example.myapplication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    val emailState = remember {
        mutableStateOf("")
    }
    val passwordState = remember {
        mutableStateOf("")
    }
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Логин")
            TextField(
                value = emailState.value,
                onValueChange =  {emailState.value = it},
                label = { Text("Введите почту")})
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Пароль")
        TextField(
            value = passwordState.value,
            onValueChange = {passwordState.value = it},
            label = { Text("Введите пароль") })

        Spacer(modifier = Modifier.height(10.dp))
        
        Button(onClick = {

        }) {
            Text(text = "Войти")
        }

       Spacer(modifier = Modifier.height(10.dp))

       Text(
           text = buildAnnotatedString {
               append("Нет аккаунта? ")
               withStyle(style = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
                   append("Создать аккаунт")
               }
           },
//           modifier = Modifier
//               .padding((16.dp))
//               .clickable {
//                   context.startActivity(Intent(context, SecondActivity()::class.java))
//               }
       )
    }
}