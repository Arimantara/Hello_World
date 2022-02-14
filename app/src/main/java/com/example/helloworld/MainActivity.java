package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nama;
    TextView HasilNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = findViewById(R.id.nama);
        HasilNama = findViewById(R.id.hasilNama);
    }

    public void TampilNama (View v) {
        HasilNama.setText ("Hello " + Nama.getText() + "!");
    }
}