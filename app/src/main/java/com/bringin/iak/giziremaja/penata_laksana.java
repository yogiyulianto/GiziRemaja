package com.bringin.iak.giziremaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class penata_laksana extends AppCompatActivity {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penata_laksana);

        btnNext = findViewById(R.id.btn_next_penata_laksana);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahActivity = new Intent(getApplicationContext(), dampak.class);
                startActivity(pindahActivity);
            }
        });
    }
}
