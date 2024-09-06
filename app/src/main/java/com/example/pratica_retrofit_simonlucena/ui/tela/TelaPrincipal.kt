package com.example.pratica_retrofit_simonlucena.ui.tela

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TelaPrincipal(modifier: Modifier){
    var cep by remember { mutableStateOf("") }
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text = "Analisador de CEP")
        OutlinedTextField(value = cep, onValueChange = {cep = it}, label = { Text(text = "CEP") })
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Analisar")
        }
    }
}