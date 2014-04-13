package com.ul.newmarket;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ul.newmarket.model.Shirt;

public class ShirtsAdapter extends ArrayAdapter<Shirt> {
	public ShirtsAdapter(Context context, List<Shirt> shirts) {
		super(context, 0, shirts);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		if (view == null) {
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.shirt_item, null);
		}
		
		Shirt shirt = getItem(position);
		TextView nameView = (TextView) view.findViewById(R.id.tvShirtName);
		nameView.setText(shirt.getName());
		
		return view;
	}
}