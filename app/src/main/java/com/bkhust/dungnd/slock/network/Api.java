package com.bkhust.dungnd.slock.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("api")
    Call<Response> fetchUser(@Query("results") int result,
                                 @Query("page") int page);
}
