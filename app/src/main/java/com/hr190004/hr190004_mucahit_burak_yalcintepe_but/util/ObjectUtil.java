package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.util;

import com.google.gson.Gson;
import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.model.ChatModel;

public class ObjectUtil {

    public  static String chatToJsonString(ChatModel chatModel)
    {
        Gson gson = new Gson();
        return gson.toJson(chatModel);
    }

    public  static ChatModel jsonStringToChat(String jsonString)
    {
        Gson gson = new Gson();
        return  gson.fromJson(jsonString,ChatModel.class);
    }
}
