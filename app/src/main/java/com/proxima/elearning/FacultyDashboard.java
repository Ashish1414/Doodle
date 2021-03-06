package com.proxima.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacultyDashboard extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_dashboard);
        findViewById(R.id.logout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferences = getSharedPreferences("Login",0);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(FacultyDashboard.this,Login.class);
                startActivityForResult(intent, 0);
                overridePendingTransition(0, 0);
                finish();
            }
        });

        findViewById(R.id.btnAddStudent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyDashboard.this,AddStudent.class);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });

        findViewById(R.id.btnMarkAttendance).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyDashboard.this , MarkAttendance.class);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });

        findViewById(R.id.btnDiscussion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyDashboard.this,Discussion_forum.class);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });
        findViewById(R.id.AddTMarks).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyDashboard.this,PostingTotalMarks.class);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });
        findViewById(R.id.AddStuMarks).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyDashboard.this,PostingMarks.class);
                startActivityForResult(intent,0);
                overridePendingTransition(0,0);
            }
        });
    }
}
