package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.adaptor;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.R;


public class ChatViewHolder extends RecyclerView.ViewHolder {

    ImageView kullaniciLogo;
    TextView txtkullaniciAdi;
    TextView txtkullaniciMesaj;
    public ChatViewHolder(@NonNull View cardView, final ChatAdaptor.OnItemClickListener listener) {
        super(cardView);

        kullaniciLogo =cardView.findViewById(R.id.kullaniciLogo);
        txtkullaniciAdi =cardView.findViewById(R.id.kullaniciAdi);
        txtkullaniciMesaj =cardView.findViewById(R.id.kullaniciMesaj);

        cardView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                listener.onClik(getAdapterPosition());
            }
        });
    }
}
