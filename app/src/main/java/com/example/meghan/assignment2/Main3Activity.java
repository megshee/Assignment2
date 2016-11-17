package com.example.meghan.assignment2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends Activity implements View.OnClickListener{

    private Button buttonGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttonGo = (Button) findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);

        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to logout?")
                .setPositiveButton("Yes, Logout", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("No, Stay Here", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Main3Activity.this, "Staying here", Toast.LENGTH_SHORT).show();
                    }
                }).show();

    }

}