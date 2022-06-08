package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private boolean buttonTap = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンを設定
        // testMessage
        Button button = findViewById(R.id.button);

        // TextView の設定
        // messe_age☆彡
        textView = findViewById(R.id.text_view);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // flagがtrueの時
//                if (buttonTap) {
//                    textView.setText("Hello");
//                    buttonTap = false;
//                }
//                // flagがfalseの時
//                else {
//                    textView.setText("World");
//                    buttonTap = true;
//                }
//            }
//        });

        // lambda式で簡略化
        button.setOnClickListener( v -> {
            // flagがtrueの時
            if (buttonTap) {
                textView.setText("Hello");
                buttonTap = false;
            }
            // flagがfalseの時
            else {
                textView.setText("World");
                buttonTap = true;
            }
        });
    }
}