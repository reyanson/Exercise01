package com.example.exercise01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView name,idno,department,faculty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        name = (TextView) findViewById(R.id.nameTextView);
        idno = (TextView) findViewById(R.id.inoTextView);
        department = (TextView) findViewById(R.id.departmentTextView);
        faculty = (TextView) findViewById(R.id.facultyTextView);

        Intent content = getIntent();
        Bundle get = content.getExtras();
        String name2 =get.getString("NAME");
        String idno2 =get.getString("INO");
        String department2 = get.getString("DEPARTMENT");
        String faculty2 = get.getString("FACULTY");

        name.setText(name2);
        idno.setText(idno2);
        department.setText(department2);
        faculty.setText(faculty2);
    }
}