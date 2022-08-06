package com.example.list_view_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends BaseAdapter {

    List<MessageModel> list;
    Context context;

    public MessageAdapter(List<MessageModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View layout = LayoutInflater.from(context).inflate(R.layout.main_layout, viewGroup, false);

        ImageView img = (ImageView) layout.findViewById(R.id.avatar);
        TextView personName = (TextView) layout.findViewById(R.id.personName);
        TextView message = (TextView) layout.findViewById(R.id.msg);

        img.setImageResource(list.get(i).getPictureId());
        personName.setText(list.get(i).getPerson());
        message.setText(list.get(i).getMessageContent());

        return layout;
    }
}
