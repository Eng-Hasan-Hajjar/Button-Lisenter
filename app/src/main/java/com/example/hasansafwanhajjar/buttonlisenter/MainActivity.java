package com.example.hasansafwanhajjar.buttonlisenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> list=new ArrayList<String>();
        list.add("firstItem");
        list.add("2Item");
        list.add("3Item");
        ListView listview =(ListView) findViewById(R.id.listview) ;
final ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,R.layout.listview);
        listview.setAdapter(adapter)
        ;
        listview.setOnItemClickListener();





    }

}
