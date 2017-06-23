package com.uac.johnfontalvoperez.formativataller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by Sol Mayra on 11/03/2017.
 */

public class AdaptadorImagen extends BaseAdapter {
    private Context mContext;

    public AdaptadorImagen(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(6, 6, 6, 6);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public Integer[] mThumbIds = {
            R.drawable.imagen1,
            R.drawable.imagen2,
            R.drawable.imagen3,
             R.drawable.imagen4,
             R.drawable.imagen5,
            R.drawable.imagen6,
            R.drawable.imagen7,
             R.drawable.imagen8,
            R.drawable.imagen9,
    };

}
