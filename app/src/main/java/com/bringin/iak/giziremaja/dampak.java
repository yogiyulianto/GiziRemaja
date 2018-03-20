package com.bringin.iak.giziremaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dampak extends AppCompatActivity {

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dampak);

        btnNext = findViewById(R.id.btn_next_dampak);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahActivity = new Intent(getApplicationContext(), penutup.class);
                startActivity(pindahActivity);
            }
        });
    }
}
