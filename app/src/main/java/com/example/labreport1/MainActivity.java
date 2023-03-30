package com.example.labreport1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    //assigning button
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencing
        login = findViewById(R.id.login);
        //set the activity of this button
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here a simple toast for extra
                Toast.makeText(getApplicationContext(),"Welcome to form page",Toast.LENGTH_SHORT).show();
                //intent start from here
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}