package com.example.sql_litedb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText editRollno,editNAme,editMarks;
Button btnAdd,btnDelete,btnModify,btnVieAll,btnView,btnShow;
SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //*****************FindView id**************

        editMarks = findViewById(R.id.editMarks);
        editNAme = findViewById(R.id.editName);
        editRollno = findViewById(R.id.editRollno);
        btnAdd = findViewById(R.id.btnAdd);
        btnDelete = findViewById(R.id.btnDelete);
        btnModify = findViewById(R.id.btnModify);
        btnVieAll = findViewById(R.id.btnViewAll);
        btnView = findViewById(R.id.btnView);
        btnShow = findViewById(R.id.btnShow);

//setOnClickListener   by this method************
        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnVieAll.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnShow.setOnClickListener(this);
        db = openOrCreateDatabase("StudentDB", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.btnAdd:
            if (editRollno.getText().toString().trim().length()==0||
            editMarks.getText().toString()
            .trim().length()==0||editNAme.getText().toString().trim().length()==0) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
                showMessage("Errore","Invalid input");
                return;
            }
            db.execSQL("INSERT INTO student VALUES('"+editRollno.getText()+"','"+editNAme.getText()+
                    "','"+editMarks.getText()+"');");
            showMessage("Success", "Record added");
            clearText();
            Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnDelete:
            Toast.makeText(this, "btnDelete  Clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnModify:
            Toast.makeText(this, "btnModify Clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnShow:
            Toast.makeText(this, "btnShow  Clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnView:
            Toast.makeText(this, "btnView Clicked", Toast.LENGTH_SHORT).show();
            break;
        case R.id.btnViewAll:
            Toast.makeText(this, "btnViewAll Clicked", Toast.LENGTH_SHORT).show();
            break;

    }
    }

    private void clearText() {
        editMarks.setText("");
        editNAme.setText("");
        editRollno.setText("");
    }

    private void showMessage(String errore, String invalid_input) {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        alertDialog.setCancelable(true);
        alertDialog.setTitle(errore);
        alertDialog.setMessage(invalid_input);
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.show();
    }


}
