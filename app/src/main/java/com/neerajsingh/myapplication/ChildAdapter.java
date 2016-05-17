package com.neerajsingh.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by neeraj.singh on 10/05/16.
 */
public class ChildAdapter extends RecyclerView.Adapter<RecyclerChildViewHolder> {
    private static final String TAG = ChildAdapter.class.getCanonicalName();
    ArrayList<String> data;
    Context context;

    public ChildAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        this.data = data;

    }

    @Override
    public RecyclerChildViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_row,parent,false);
        RecyclerChildViewHolder holder = new RecyclerChildViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerChildViewHolder holder, int position) {
        Log.d(TAG,"onBindViewHolder at position : "+position);
        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
