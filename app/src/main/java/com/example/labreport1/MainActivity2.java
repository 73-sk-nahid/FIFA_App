package com.example.labreport1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity2 extends AppCompatActivity {
    Button back,reset,add;
    ListView lv;
    EditText et;
    ArrayList<String> list;
    ArrayAdapter<String> ArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        add = findViewById(R.id.add);
        back = findViewById(R.id.back);
        reset = findViewById(R.id.clearall);
        lv = findViewById(R.id.lv);
        et = findViewById(R.id.et);
        list = new ArrayList<String>();
        ArrayAdapter= new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1,list);
        //add button for add edittext to the list items
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et.getText().toString();
                list.add(name);
                lv.setAdapter(ArrayAdapter);
                Toast.makeText(getApplicationContext(),"Added",Toast.LENGTH_SHORT).show();
                et.setText(null);
            }
        });
        //reset button for clear the list items
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv.setAdapter(null);
                Toast.makeText(getApplicationContext(),"Deleted All",Toast.LENGTH_SHORT).show();
            }
        });
        //back button intent for going back to the home/login page
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Back to Home Page",Toast.LENGTH_SHORT).show();
                Intent back = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
            }
        });
    }}