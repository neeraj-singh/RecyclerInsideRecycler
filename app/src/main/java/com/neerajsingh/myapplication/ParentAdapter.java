package com.neerajsingh.myapplication;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by neeraj.singh on 10/05/16.
 */
public class ParentAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private static final String TAG = ParentAdapter.class.getSimpleName();
    private int listSize;
    Context context ;

    public ParentAdapter(Context context, int listSize) {
        this.listSize = listSize;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(parent.getContext()).inflate(R.layout.row_recycler,parent,false);
        ArrayList<String> data = new ArrayList<String>();
        for(int i=1;i<6;i++){
            data.add("Player "+i);
        }
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(recyclerView,data);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Log.e(TAG,"onBindViewHolder at position : "+position);
        if(holder.layoutManager==null) {
            holder.layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            holder.layoutManager.onSaveInstanceState();
        }

        holder.childRecyclerView.setLayoutManager(holder.layoutManager);
        holder.childRecyclerView.setNestedScrollingEnabled(true);
        holder.adapter = new ChildAdapter(context,holder.data);
        holder.childRecyclerView.setAdapter(holder.adapter);
        holder.adapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return listSize;
    }
}
