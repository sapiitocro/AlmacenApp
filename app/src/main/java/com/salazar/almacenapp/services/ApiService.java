package com.salazar.almacenapp.services;

import com.salazar.almacenapp.models.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Alumno on 30/10/2017.
 */

public interface ApiService {

    String API_BASE_URL = "https://almacen-api-mrpapita.c9users.io";

    @GET("api/v1/productos")
    Call<List<Producto>> getProductos();

}
