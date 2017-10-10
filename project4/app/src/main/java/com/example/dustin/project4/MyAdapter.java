package com.example.dustin.project4;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dustin on 10/9/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<String> myList;
    private int rowLayout;
    private Context context;
    final static String TAG = "HEY LISTEN_ADAPTER";


    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView myName;
        public ViewHolder(View item){
            super(item);
            myName = (TextView) item.findViewById(R.id.Name);
        }
    }

    //TODO: update data
    public MyAdapter(List<String> myList, int rowLayout, Context context)
    {
        this.myList = myList;
        this.rowLayout = rowLayout;
        this.context = context;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //TODO UNDERSTAND THIS
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        //This is where we would do padding margins and layout paramaters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //Update holder's information
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String entry = myList.get(position);
        holder.myName.setText(entry);
    }

    //How many items in dataset?
    @Override
    public int getItemCount() {
        return myList == null ? 0 : myList.size();
    }


}
