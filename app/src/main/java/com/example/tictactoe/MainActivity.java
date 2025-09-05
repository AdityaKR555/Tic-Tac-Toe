package com.example.tictactoe;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    int flag = 0, count = 0;
    String s1, s2, s3, s4, s5, s6, s7, s8, s9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

    }
    public void game(View view){
        Button button = (Button) view;
        if(button.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                button.setText("X");
                flag = 1;
            } else {
                button.setText("O");
                flag = 0;
            }
            if (count > 4) {

                s1 = button1.getText().toString();
                s2 = button2.getText().toString();
                s3 = button3.getText().toString();
                s4 = button4.getText().toString();
                s5 = button5.getText().toString();
                s6 = button6.getText().toString();
                s7 = button7.getText().toString();
                s8 = button8.getText().toString();
                s9 = button9.getText().toString();

                if (s1.equals(s2) && s2.equals(s3) && !s1.equals("")) {
                    button1.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button2.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button3.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s4.equals(s5) && s5.equals(s6) && !s4.equals("")) {
                    button4.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button5.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button6.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s4, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s7.equals(s8) && s8.equals(s9) && !s7.equals("")) {
                    button7.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button8.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button9.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s1.equals(s4) && s4.equals(s7) && !s1.equals("")) {
                    button4.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button1.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button7.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s4, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s2.equals(s5) && s5.equals(s8) && !s2.equals("")) {
                    button2.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button5.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button8.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s2, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s3.equals(s6) && s6.equals(s9) && !s3.equals("")) {
                    button3.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button6.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button9.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s1.equals(s5) && s5.equals(s9) && !s1.equals("")) {
                    button1.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button5.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button9.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s3.equals(s5) && s5.equals(s7) && !s3.equals("")) {
                    button3.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button5.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    button7.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
                    Toast.makeText(this, "Winner is " + s3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if(count == 9){
                    Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
                    restart();
                }

            }

        }
    }

    public void restart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Code to run after delay
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                count = 0;
                flag = 0;
                button1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button5.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button6.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button7.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button8.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
                button9.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));

            }
        }, 2000); // 2000 ms = 2 seconds


    }
    public void restartWithView(View view){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        count = 0;
        flag = 0;
        button1.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button2.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button3.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button4.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button5.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button6.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button7.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button8.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        button9.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));

    }
}