package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.R;
import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.model.ChatModel;
import com.hr190004.hr190004_mucahit_burak_yalcintepe_but.util.GlideUtil;

import java.util.List;

public class ChatAdaptor extends RecyclerView.Adapter<ChatViewHolder> {


    List<ChatModel> mesajlar;
    Context context;
    OnItemClickListener listener;

    public interface OnItemClickListener{
        void onClik(int position);
    }


    public ChatAdaptor(List<ChatModel> mesajlar, Context context, OnItemClickListener listener) {
        this.mesajlar = mesajlar;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_chat,parent,false);
        return new ChatViewHolder(itemView,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder viewHolder, int position) {

        viewHolder.txtkullaniciMesaj.setText(mesajlar.get(position).getKullaniciAdi());
        viewHolder.txtkullaniciAdi.setText(mesajlar.get(position).getKullaniciMesaj());
        GlideUtil.resmiIndiripGoster(context,mesajlar.get(position).getKullaniciResmi(),viewHolder.kullaniciLogo);

    }

    @Override
    public int getItemCount() {
        return mesajlar.size();
    }
}
