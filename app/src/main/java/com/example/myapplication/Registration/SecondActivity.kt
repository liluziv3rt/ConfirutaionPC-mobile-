import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SecondActivity(navController: NavHostController)
{
    val Email = remember {
        mutableStateOf("")
    }
    val Password = remember {
        mutableStateOf("")
    }
    val PasswordAgain = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Введите почту")
        TextField(
            value = Email.value,
            onValueChange =  {Email.value = it},
            label = { Text("Введите почту") })
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Пароль")
        TextField(
            value = Password.value,
            onValueChange = {Password.value = it},
            label = { Text("Введите пароль") })

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Подтвердите пароль")
        TextField(
            value = PasswordAgain.value,
            onValueChange = {PasswordAgain.value = it},
            label = { Text("Подтвердите пароль") })

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {

        }) {
            Text(text = "Зарегестрироваться")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {

            Text(
                text = "Есть аккаунт? ",
                color = Color.Black
            )

            Text(
                text = "Войдите! ",
                color = Color.Black,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable {
                    navController.navigate("login")
                }
            )
        }
    }
}