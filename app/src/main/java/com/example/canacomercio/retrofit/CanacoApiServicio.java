package com.example.canacomercio.retrofit;

import com.example.canacomercio.retrofit.responder.ResponderLogin;
import com.example.canacomercio.retrofit.solicitar.SolicitarLogin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CanacoApiServicio {

    @POST("auth/login/comercios")
    Call<ResponderLogin> doLogin(@Body SolicitarLogin solicitarLogin);

}
