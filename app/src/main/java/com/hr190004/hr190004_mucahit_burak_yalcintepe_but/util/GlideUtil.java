package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.R;


public class GlideUtil {

    public  static  void resmiIndiripGoster(Context context, String url, ImageView img)
    {
        Glide.with(context)
                .load(url)
                .error(R.drawable.logo)
                .centerCrop()
                .into(img);
    }
}
