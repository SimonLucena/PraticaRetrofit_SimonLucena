package com.example.pratica_retrofit_simonlucena.model.dados
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoServiceIF {

//    @GET("58040530/json/")
//    suspend fun listar(): Endereco

    @GET("{cep}/json/")
    suspend fun getEndereco(@Path("cep") cep:String): Endereco
}