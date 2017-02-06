package com.example.android.travel_isfahan;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EzraYang on 2/6/17.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

//    private int mColorResourceId;

    public AttractionAdapter(Activity context, ArrayList<Attraction> attactions){
        super(context, 0, attactions);
        // mColorResourceId = ColorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Attraction currentAttr = getItem(position);

        TextView nameField = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameField.setText(currentAttr.getmName());

        TextView locationField = (TextView) listItemView.findViewById(R.id.list_item_loc);
        locationField.setText(currentAttr.getmLocation());

        ImageView imageField = (ImageView) listItemView.findViewById(R.id.list_item_image);
        imageField.setImageResource(currentAttr.getmImageId());


        // Set background color of the textView "text_container"
//        View textContainer = listItemView.findViewById(R.id.text_container);
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        textContainer.setBackgroundColor(color);
//
//        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
//
//        if (currentWord.hasImage()){
//            image.setImageResource(currentWord.getImageId());
//        }
//        else{
//            image.setVisibility(View.GONE);
//        }

        return listItemView;

    }
}
