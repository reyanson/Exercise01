package com.example.exercise01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText name, indexno,department,faculty;
    Button ok;
    Intent intent;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (EditText) findViewById(R.id.nameEditText);
        indexno = (EditText) findViewById(R.id.iNoEditText);
        department =(EditText) findViewById(R.id.departmentEditText);
        faculty = (EditText) findViewById(R.id.facultyEditText);
        ok = (Button) findViewById(R.id.okButton);
        intent = new Intent(this, ThirdActivity.class);
        bundle = new Bundle();

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("NAME",name.getText().toString());
                bundle.putString("INO",indexno.getText().toString());
                bundle.putString("DEPARTMENT",department.getText().toString());
                bundle.putString("FACULTY",faculty.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });



    }
}