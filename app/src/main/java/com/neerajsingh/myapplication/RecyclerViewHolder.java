package com.neerajsingh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by neeraj.singh on 10/05/16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    final ArrayList<String> data;
    RecyclerView childRecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter ;
    public RecyclerViewHolder(View itemView, ArrayList<String> data) {
        super(itemView);
        this.childRecyclerView = (RecyclerView) itemView;
        this.data = data;
    }
}
