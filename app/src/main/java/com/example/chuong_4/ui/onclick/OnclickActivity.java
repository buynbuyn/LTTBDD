package com.example.chuong_4.ui.onclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chuong_4.R;

public class OnclickActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onclick);

        Button btnxml = findViewById(R.id.btnxml);


        btnxml.setOnClickListener(v -> handleClick(v));
    }

    // Di chuyển phương thức ra ngoài onCreate()
    public void handleClick(View view) {
        Toast.makeText(this, "Bạn đã nhấn nút!", Toast.LENGTH_SHORT).show();
    }
}