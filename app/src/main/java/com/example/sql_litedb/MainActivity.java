package com.example.sql_litedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText editRollno,editNAme,editMarks;
Button btnAdd,btnDelete,btnModify,btnVieAll,btnView,btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //*****************FindView id**************

        editMarks=findViewById(R.id.editMarks);
        editNAme=findViewById(R.id.editName);
        editRollno=findViewById(R.id.editRollno);
      btnAdd=findViewById(R.id.btnAdd);
      btnDelete=findViewById(R.id.btnDelete);
      btnModify=findViewById(R.id.btnModify);
      btnVieAll=findViewById(R.id.btnViewAll);
      btnView=findViewById(R.id.btnView);
      btnShow=findViewById(R.id.btnShow);

//setOnClickListener   by this method************
      btnAdd.setOnClickListener(this);
      btnDelete.setOnClickListener(this);
      btnModify.setOnClickListener(this);
      btnVieAll.setOnClickListener(this);
      btnView.setOnClickListener(this);
      btnShow.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.btnAdd:
            Toast.makeText(this, "btnAdd  Clicked", Toast.LENGTH_SHORT).show();
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
}
