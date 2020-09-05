package com.example.customlistviewjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String ourAppsList[];
    int imagesList[];
    LayoutInflater inflater;

    // Create CustomAdapter constructor
    public CustomAdapter(Context applicationContext, String[] ourAppsList,
                         int[] imagesList) {
        this.context = applicationContext;
        this.ourAppsList = ourAppsList;
        this.imagesList = imagesList;
        inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return ourAppsList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.listview_item, null);
        TextView ourAppsView = convertView.findViewById(R.id.textView);
        ImageView iconsView = convertView.findViewById(R.id.icon);
        ourAppsView.setText(ourAppsList[position]);
        iconsView.setImageResource(imagesList[position]);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Clicked on item:\n"
                                + ourAppsList[position],
                        Toast.LENGTH_LONG).show();
            }
        });
        return convertView;
    }
}
