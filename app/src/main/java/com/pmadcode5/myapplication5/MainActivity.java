package com.pmadcode5.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button B1;
    TextView wlcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();

        B1=findViewById(R.id.buttonOne);
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        String name="Sachin Mudannayaka";
        int age=23;
        i.putExtra("USER_NAME",name);
        i.putExtra("AGE",age);


         wlcome=findViewById(R.id.welcome);
         String w=intent.getStringExtra("Wlmsg");
         wlcome.setText(w);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(i);
            }
        });
    }
}