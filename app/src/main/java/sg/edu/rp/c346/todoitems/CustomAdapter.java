package sg.edu.rp.c346.todoitems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<todo> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<todo> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;

    }
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        todo currentVersion = toDoList.get(position);

        tvTitle.setText(currentVersion.getTitle());
        tvDate.setText(currentVersion.getDate());
        return rowView;

    }
}
