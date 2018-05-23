package com.example.aditya123666.go_api.api;

//import io.github.adamnain.gowarkop.model.Pesan;
//import io.github.adamnain.gowarkop.model.ResponseMenu;
import com.example.aditya123666.go_api.model.ResponsePesan;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface BaseApiService {
    @GET("pesan/lihat")
    Call<ResponsePesan> getAllPesanan(@Query("key")String key);

    //list semua bangunan berdasarkan provinsi
//    @GET("allmenu/")
//    Call<ResponseMenu> getAllMenu(@Query("key") String key);
//
//    @POST("pesan/")
//    Call<Pesan> pesan(@Body Pesan pesan, @Query("key") String key);


}
