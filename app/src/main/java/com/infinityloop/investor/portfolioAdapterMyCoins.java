package com.infinityloop.investor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class portfolioAdapterMyCoins extends RecyclerView.Adapter<portfolioAdapterMyCoins.ViewHolder>{

    private List<myCoinModel> myCoinList;

    public portfolioAdapterMyCoins(List <myCoinModel> myCoinList)
    {
        this.myCoinList = myCoinList;
    }

    @NonNull
    @Override
    public portfolioAdapterMyCoins.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.portfolioholder, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull portfolioAdapterMyCoins.ViewHolder holder, int position)
    {
        holder.apyTv.setText(String.valueOf(myCoinList.get(position).getApy()));
        holder.nameTv.setText(myCoinList.get(position).getName().toString());
        holder.amountTv.setText(String.valueOf(myCoinList.get(position).getAmount()));
    }

    @Override
    public int getItemCount() {
        return myCoinList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTv, apyTv, amountTv;
        ImageView iconIv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.nameTv = (TextView) itemView.findViewById(R.id.name);
            this.apyTv = (TextView) itemView.findViewById(R.id.apy);
            this.amountTv = (TextView) itemView.findViewById(R.id.amount);
            this.iconIv = (ImageView)  itemView.findViewById(R.id.image);

        }
    }
}
