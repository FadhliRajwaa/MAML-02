package com.example.maml_02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_tiga extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tiga);

        TextView tv1 = findViewById(R.id.textView3);
        Button bt1 = findViewById(R.id.button7);
        Button bt2 = findViewById(R.id.button8);
        Button bt3 = findViewById(R.id.button9);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah1 = new Intent(Activity_tiga.this, Activity_dua.class);
                startActivity(pindah1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(Activity_tiga.this, Activity_satu.class);
                startActivity(pindah2);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_tiga.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish(); // Optional: menutup Activity_tiga agar tidak tetap ada di tumpukan aktivitas
            }
        });
    }
}
