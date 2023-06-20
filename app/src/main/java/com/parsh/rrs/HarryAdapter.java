package com.parsh.rrs;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HarryAdapter extends ArrayAdapter<String> {
private Context context;
private String [] arr;
private  double latitude;
private  double longitude;
    public HarryAdapter(@NonNull Context context, int resource, @NonNull String[] arr,double latitude,double longitude) {
        super(context, resource, arr);
        this.arr=arr;
        this.context=context;
        this.latitude = latitude;
        this.longitude=longitude;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    } // kausne position per kaunsa item hai wo batata hai getItem

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_harry_layout,parent,false);
       TextView t = convertView.findViewById(R.id.textView);
       t.setText(getItem(position));
      convertView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
//              Toast.makeText(context, "You click on listview "+position,Toast.LENGTH_SHORT).show();
              Toast.makeText(context,"Latitude:"+latitude+" longitude"+longitude,Toast.LENGTH_SHORT).show();
          }
      });
        return convertView;
    }


}
