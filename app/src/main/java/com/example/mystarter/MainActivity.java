package com.example.mystarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClickMessage(View origin) {
        TextView viewMessage = findViewById(R.id.viewMessage);

        EditText editTextName = findViewById(R.id.NameInput);
        EditText editTextStarter = findViewById(R.id.starterInput);

        String name = editTextName.getText().toString();
        String starter = editTextStarter.getText().toString();
        String message = String.format("Hi %s! Your starter is %s!", name, starter);

        viewMessage.setText(message);
    }
}