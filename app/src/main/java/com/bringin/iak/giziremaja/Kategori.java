package com.bringin.iak.giziremaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kategori extends AppCompatActivity {
    Button btnNexti;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

    btnNexti = findViewById(R.id.btn_next_faktor);

    btnNexti.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent pindahActivity = new Intent(getApplicationContext(), indeks.class);
            startActivity(pindahActivity);
        }
    });
    }
}
