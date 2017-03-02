package com.duphungcong.lab3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by udcun on 3/2/2017.
 */

public class ListAdapter extends ArrayAdapter<User> {
    List<User> users;
    public ListAdapter(Context context, List<User> objects) {
        super(context, 0, objects);
        users = objects;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        User user = users.get(position);

        if(convertView != null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.chat_item, parent, false);
        }

        TextView tvMessage = (TextView) convertView.findViewById(R.id.tvMessage);

        tvMessage.setText(user.getMessage());

        return convertView;
    }
}
