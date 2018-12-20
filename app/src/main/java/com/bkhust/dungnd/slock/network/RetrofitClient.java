package com.bkhust.dungnd.slock.network;

import retrofit2.Retrofit;

public class RetrofitClient {
    private Api api;
    private static RetrofitClient sInstance;
//
//    private RetrofitClient() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://randomuser.me/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        api = retrofit.create(Api.class);
//    }
//
//    public static RetrofitClient getInstance() {
//        if (null == sInstance) {
//            sInstance = new RetrofitClient();
//        }
//        return sInstance;
//    }
//
//    public Api getUserApi() {
//        return sInstance.userApi;
//    }
}
