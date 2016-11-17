package com.example.meghan.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    //Declare all widgets
    private Button buttonGo;
    private EditText editTextLogin;
    private EditText editTextPassword;
    private RadioButton radioButtonSettings;
    private RadioButton radioButtonProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link Java Objects to Widgets in the UI

        buttonGo = (Button) findViewById(R.id.buttonGo);
        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        radioButtonSettings = (RadioButton) findViewById(R.id.radioButtonSettings);
        radioButtonProfile = (RadioButton) findViewById(R.id.radioButtonProfile);

        buttonGo.setOnClickListener(this);
        //radioButtonSettings.setOnClickListener(this);
        //radioButtonProfile.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(this, Main3Activity.class);
        Intent intent2 = new Intent(this, Main2Activity.class);

        //Event Handler Settings
        if (v == findViewById(R.id.buttonGo) & editTextLogin.getText().toString().equals("User")
                & editTextPassword.getText().toString().equals("1234"))

            //Do if true
            {
                if (radioButtonProfile.isChecked()) {
                    startActivity(intent1);
                } else if (radioButtonSettings.isChecked()){
                    startActivity(intent2);
                } else {
                    Toast.makeText(this, "Select At Least One Radio Button", Toast.LENGTH_SHORT).show();
                }


        } else {
            //Do if false
            Toast.makeText(this, "Login Denied", Toast.LENGTH_SHORT).show();
            editTextLogin.getText().clear();
            editTextPassword.getText().clear();
        }

    }


}