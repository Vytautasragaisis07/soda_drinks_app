package com.example.soda_drinks_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);

        Button newEntryButton = findViewById(R.id.new_entry_button);
        newEntryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoOrderActivity = new Intent(NewEntryActivity.this, SodaActivity.class);
                startActivity(gotoOrderActivity);
            }
        });
    }
}
