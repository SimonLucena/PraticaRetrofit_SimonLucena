package com.example.pratica_retrofit_simonlucena

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pratica_retrofit_simonlucena.ui.tela.TelaDetalhe
import com.example.pratica_retrofit_simonlucena.ui.theme.PraticaRetrofit_SimonLucenaTheme
import com.example.pratica_retrofit_simonlucena.ui.tela.TelaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PraticaRetrofit_SimonLucenaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ){ innerPadding ->
//                    TelaPrincipal()
                    TelaDetalhe(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PraticaRetrofit_SimonLucenaTheme {
//        Greeting("Android")
    }
}