package com.neerajsingh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by neeraj.singh on 10/05/16.
 */
public class RecyclerChildViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public RecyclerChildViewHolder(View itemView) {
        super(itemView);
        this.textView = (TextView) itemView.findViewById(R.id.child_text);
    }
}
