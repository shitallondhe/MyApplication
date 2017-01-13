package com.example.shitalbharatlondhe.retrofit_demomaster;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Felix-ITS012 on 12/05/16.
 */
public class adapter extends ArrayAdapter<Flower>
{

    String photoUrl ="http://services.hanselandpetal.com/photos/";
    private Context context;
    private List<Flower> flowerList;

    public adapter(Context context, int resource, int textViewResourceId, List<Flower> objects)
    {
        super(context, resource, textViewResourceId, objects);
        this.context = context;
        this.flowerList = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
         super.getView(position, convertView, parent);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_file,parent,false);
        Flower flower = flowerList.get(position);
        TextView tv = (TextView) view.findViewById(R.id.name);
        tv.setText(flower.getName());
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Picasso.with(getContext()).load(photoUrl+flower.getPhoto()).resize(100,100).into(img);
        return view;

    }



}
