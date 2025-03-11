package com.example.myapplication.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    val emailState = remember {
        mutableStateOf("")
    }
    val passwordState = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Логин",
                modifier = Modifier
                    .padding(start = 16.dp, bottom = 8.dp),
                fontSize = 18.sp,
                color = Color.Blue
            )
            TextField(
                value = emailState.value,
                onValueChange =  {emailState.value = it},
                label = { Text("Введите почту")})
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Пароль",
            modifier = Modifier
                .padding(start = 16.dp, bottom = 8.dp),
            fontSize = 18.sp,
            color = Color.Blue
        )
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

        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {

            Text(
                text = "Нет аккаунта? ",
                color = Color.Black
            )

            Text(
                text = "Зарегестрируйтесь! ",
                color = Color.Black,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable {
                    navController.navigate("registration")
                }
            )
        }

    }
}