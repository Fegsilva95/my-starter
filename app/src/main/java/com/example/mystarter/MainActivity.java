package com.example.mystarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    List<String> names = new ArrayList<>();
    EditText editTextName;
    EditText editTextSorted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addNameList(View origin) {
        editTextName = findViewById(R.id.NameInput);
        String name = editTextName.getText().toString();
        names.add(name);
        editTextName.setText("");
    }

    public void sortNames(View origin) {
        Random random = new Random();
        int listSize = names.size();
        if (listSize >= 1) {
            String nameSorted = names.get(random.nextInt(listSize));
            editTextSorted = findViewById(R.id.sortedInput);
            editTextSorted.setText(nameSorted);
        }
    }

    public void clearNames(View origin) {
        names.clear();
        editTextSorted.setText("");
    }
}