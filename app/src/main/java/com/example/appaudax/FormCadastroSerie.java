package com.example.appaudax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastroSerie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro_serie);
        getSupportActionBar().hide();
    }
}