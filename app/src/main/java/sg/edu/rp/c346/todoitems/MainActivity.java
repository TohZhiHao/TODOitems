package sg.edu.rp.c346.todoitems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvList;
    ArrayList<todo> alToDoList;
    CustomAdapter aaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.lvList);

        alToDoList = new ArrayList<>();

        alToDoList.add(new todo("MSA", "1/7/2019"));
        alToDoList.add(new todo("Go for haircut", "22/9/2019"));

        aaList = new CustomAdapter(this, R.layout.row, alToDoList);
        lvList.setAdapter(aaList);
    }
}
