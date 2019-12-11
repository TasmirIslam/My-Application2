package com.example.playwithnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText userET;
    Button submitBtn;
    TextView resultTV;
    int ramdomNum,userNumInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userET = findViewById(R.id.userET);
        submitBtn = findViewById(R.id.submitBtn);
        resultTV = findViewById(R.id.resultTV);

        Random rand = new Random();
// Obtain a number between [0 - 10].
        ramdomNum = rand.nextInt(9);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userNumString = userET.getText().toString();
                userNumInt = Integer.parseInt(userNumString);

                if(userNumInt<ramdomNum){
                    Toast.makeText(MainActivity.this, "Sorry,Enter a higher number", Toast.LENGTH_SHORT).show();
                }
                else if(userNumInt>ramdomNum){
                    Toast.makeText(MainActivity.this, "Sorry,Enter a lower number", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Congrats!Your number is corrrect", Toast.LENGTH_SHORT).show();

                    userET.setText("");

                    Random rand = new Random();
// Obtain a number between [0 - 10].
                    ramdomNum = rand.nextInt(9);

                }
            }
        });
    }
}
