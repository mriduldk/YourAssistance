package com.citlife.yourassistant;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    Call<MsgModal> getMessage(@Url String url);

    @GET
    Call<MsgModal2> getMessage2(@Url String url);
}
