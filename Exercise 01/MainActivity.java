



package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.list_view);

        //create an arrayAdapter that contain a list of string

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                new String []{"ITEM 1", "iTEM 2", "ITEM 3"});

        //Listen for adapter to the list view
        listview.setAdapter(adapter);

        //Listen for clicks on then list item

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Do something when an item is clicked

                String item = (String) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,"You clicked" +item,Toast.LENGTH_SHORT).show();
            }
        });


    }
}