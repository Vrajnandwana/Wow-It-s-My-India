package com.example.rajnikant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity2 extends AppCompatActivity {

    private Button btn;
    private Spinner sourceSpinner;
    private Spinner destinationSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(view -> {
            Intent intent =new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);});

            sourceSpinner = findViewById(R.id.source_spinner);
            destinationSpinner = findViewById(R.id.destination_spinner);

            String[] statesAndUTs = {"State","Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar",
                    "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa",
                    "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand",
                    "Karnataka", "Kerala", "Ladakh", "Lakshadweep", "Madhya Pradesh", "Maharashtra",
                    "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Puducherry", "Punjab",
                    "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh",
                    "Uttarakhand", "West Bengal"};

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, statesAndUTs);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            sourceSpinner.setAdapter(adapter);
            destinationSpinner.setAdapter(adapter);

            sourceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String selectedState = parent.getItemAtPosition(position).toString();

                    // Create a new list for the destination spinner which doesn't include the selected state
                    List<String> destinationStates = new ArrayList<>(Arrays.asList(statesAndUTs));


                    ArrayAdapter<String> destinationAdapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_item, destinationStates);
                    destinationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    destinationSpinner.setAdapter(destinationAdapter);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Do nothing
                }
            });

        };
    }
;