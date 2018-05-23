package com.example.aditya123666.go_api.api;

public class UtilsApi {

    public static final String BASE_URL_API = "http://10.0.2.2/apigowarkop/public/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }

}
