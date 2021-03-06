package com.exmo.exmo_test1.Adapters;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.exmo.exmo_test1.Entities.DepartmentEvents;
import com.exmo.exmo_test1.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HorizontalListAdapter  extends ArrayAdapter<DepartmentEvents> {

    private final Activity context;
    private final ArrayList<DepartmentEvents> departmentEvents;
    //private final ArrayList<String> stallPic;

    public HorizontalListAdapter(Activity context, ArrayList<DepartmentEvents> departmentEvents) {
        super(context, R.layout.row_horizontal_list, departmentEvents);
        this.context = context;
        this.departmentEvents = departmentEvents;
        //this.stallPic = stallPic;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.row_horizontal_list, null, true);
        TextView timeTXT = (TextView) rowView.findViewById(R.id.textViewStallName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageViewStall) ;

        Log.e("Horizontal",departmentEvents.get(position).getName() );
        timeTXT.setText(departmentEvents.get(position).getName());
        Picasso.with(context).load(departmentEvents.get(position).getImageUrl()).into(imageView);

        return rowView;
    }
}