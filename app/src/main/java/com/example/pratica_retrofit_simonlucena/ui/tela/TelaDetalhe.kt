package com.example.pratica_retrofit_simonlucena.ui.tela

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.pratica_retrofit_simonlucena.model.dados.Endereco
import kotlinx.coroutines.launch
import com.example.pratica_retrofit_simonlucena.model.dados.EnderecoServiceIF
import com.example.pratica_retrofit_simonlucena.model.dados.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Composable
fun TelaDetalhe(modifier: Modifier = Modifier){
    var scope = rememberCoroutineScope()

    Column(modifier = modifier) {
        Text(text = "Detalhes")
        var endereco by remember { mutableStateOf<Endereco>(Endereco()) }
        var busca by remember { mutableStateOf<String?>(null) }

        Button(onClick = {
            scope.launch {
                endereco = getEndereco("58040530")
            }
            busca = "Foi!"
            Log.d("busca", endereco.cep)
        }) {
            Text(text = "Calcular")
        }

//        LaunchedEffect(Unit) {
//            scope.launch {
//                endereco = getEndereco()
////                Log.d("principal", getEndereco().logradouro)
//            }
//        }
        busca.let {
            Log.d("principal", endereco.logradouro)
            Text(endereco.logradouro)
            busca = null
        }
    }
}

suspend fun getEndereco(cep:String): Endereco {
    return withContext(Dispatchers.IO) {
        RetrofitClient.enderecoService.getEndereco(cep)
    }
}