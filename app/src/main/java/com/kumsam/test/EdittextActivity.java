package com.kumsam.test;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.ETC1;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EdittextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);
    }

    public void  ET1_click(View view){
        EditText editText=(EditText) findViewById(R.id.ET1);
        editText.setText("Samat");
        //Toast.makeText(getApplicationContext(),"ET1_click",Toast.LENGTH_SHORT).show();
    }
}
