package com.example.twoactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {
    private TextView usern;
    private TextView passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void btn2_click(View view){
        usern=findViewById(R.id.un);
        passw=findViewById(R.id.pw);
        String st1=usern.getText().toString().trim();
        String st2=passw.getText().toString().trim();
        Toast.makeText(this,"usersname:"+st1+" password:"+st2,Toast.LENGTH_LONG).show();
    }
}
