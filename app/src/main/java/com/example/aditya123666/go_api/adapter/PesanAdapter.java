package com.example.aditya123666.go_api.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.aditya123666.go_api.R;
import com.example.aditya123666.go_api.model.Pesan;

import java.util.List;

/**
 * Created by Aditya123666 on 24/05/2018.
 */

public class PesanAdapter extends RecyclerView.Adapter<PesanAdapter.ViewHolder> {
    //deklarasi global variabel
    private Context context;
    private final List<Pesan> listMenu;

    //konstruktor untuk menerima data adapter
    public PesanAdapter(Context context, List<Pesan> listMenu) {
        this.context = context;
        this.listMenu = listMenu;
    }

    //view holder berfungsi untuk setting list item yang digunakan
    @Override
    public PesanAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listmenu, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ViewHolder(mItemView,this);
    }

    //bind view holder berfungsi untuk set data ke view yang ditampilkan pada list item
    @Override
    public void onBindViewHolder(PesanAdapter.ViewHolder holder, int position) {
        final Pesan mCurrent = listMenu.get(position);

        Glide.with(context)
                .load("https://upload.wikimedia.org/wikipedia/commons/6/64/Foods_%28cropped%29.jpg")
                .into(holder.imgMenu);

        holder.tvNamaCustomer.setText(mCurrent.getNama());
        holder.tvNoHp.setText(mCurrent.getNoHp());
        holder.tvNamaMenu.setText(mCurrent.getNamaMenu());
        holder.tvJumlahPesanan.setText(mCurrent.getJumlah());
        holder.tvTotalHarga.setText("Rp."+mCurrent.getTotalHarga());

    }

    //untuk menghitung jumlah data yang ada pada list
    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        private TextView tvNamaMenu, tvTotalHarga,tvNamaCustomer,tvNoHp,tvJumlahPesanan;
        private ImageView imgMenu;

        final PesanAdapter mAdapter;

        //untuk casting view yang digunakan pada list item
        public ViewHolder(View itemView, PesanAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            tvNamaCustomer = itemView.findViewById(R.id.tv_nama_konfirmasi);
            tvNoHp = itemView.findViewById(R.id.tv_nohp_konfirmasi);
            tvNamaMenu = itemView.findViewById(R.id.tv_nama_menu_konfirmasi);
            tvJumlahPesanan = itemView.findViewById(R.id.tv_jumlah_pesanan_konfirmasi);
            tvTotalHarga = itemView.findViewById(R.id.tv_total_harga_konfirmasi);
                        imgMenu = itemView.findViewById(R.id.iv_pesanan);

            this.mAdapter = adapter;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            Pesan element = listMenu.get(mPosition);

            //intent ke main activity dengan passing data
//            Intent i = new Intent(context, DetailMenuActivity.class);
//            i.putExtra("namamenu", element.getNama());
//            i.putExtra("harga", element.getHarga());
//            context.startActivity(i);
//            mAdapter.notifyDataSetChanged();

        }
    }
}
