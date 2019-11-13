package com.kumsam.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  ButtonsonClick(View view){
        switch (view.getId()){
            case R.id.EdittextButton :
                Intent intent =new Intent(this, EdittextActivity.class);
                startActivity(intent);

        }
    }

}
