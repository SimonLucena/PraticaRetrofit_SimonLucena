package com.example.pratica_retrofit_simonlucena.model.dados

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val BASE_URL = "https://viacep.com.br/ws/"

    val enderecoService: EnderecoServiceIF by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EnderecoServiceIF::class.java)
    }
}