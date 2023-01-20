package com.pmadcode5.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button B2;
TextView txtUserName,txtage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       B2=findViewById(R.id.buttonTwo);
       txtUserName=findViewById(R.id.textView2);
       txtage=findViewById(R.id.age);

       Intent i=getIntent();

        Intent intent=new Intent(getApplicationContext(),MainActivity.class);

       String name=i.getStringExtra("USER_NAME");
       int age=i.getIntExtra("AGE",0);
        Bundle extras=intent.getExtras();





       txtage.setText(String.valueOf(age));

       txtUserName.setText(name);

        String wel="WELCOME TO ";
        intent.putExtra("Wlmsg",wel);

       B2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               startActivity(intent);
           }


       });

    }
}