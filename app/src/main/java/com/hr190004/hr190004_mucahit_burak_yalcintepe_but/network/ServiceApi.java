package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.network;


import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.model.ChatModel;

import java.util.List;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServiceApi {

    @GET("butProje.json")
    Observable<List<ChatModel>> mesajlariGetir();
}
