package com.example.rtc27.radiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        radioButton.setText("123");
        radioButton2.setText("456");
        radioButton3.setText("789");
        radioButton4.setText("123");
        radioButton5.setText("456");

        radioGroup.setOnCheckedChangeListener(listner);

    }

    private RadioGroup.OnCheckedChangeListener listner = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch (i){
                case R.id.radioButton:
                    Toast.makeText(MainActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton2:
                    Toast.makeText(MainActivity.this,radioButton2.getText(),Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton3:
                    Toast.makeText(MainActivity.this,radioButton3.getText(),Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioButton4:
                    Toast.makeText(MainActivity.this,radioButton4.getText(),Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(MainActivity.this,radioButton5.getText(),Toast.LENGTH_SHORT).show();
                    break;
            }


        }
    };
}
