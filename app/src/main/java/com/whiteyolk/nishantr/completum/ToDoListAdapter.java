package com.whiteyolk.nishantr.completum;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;

/**
 * Created by nishantr on 1/18/16.
 */
public class ToDoListAdapter extends BaseAdapter {

    ArrayList<ToDoItem> items = new ArrayList<ToDoItem>();
    Context context;
    public ToDoListAdapter(Context context1) {
        context = context1;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
