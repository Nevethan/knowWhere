package com.example.bruger.knowwhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends AppCompatActivity {


    EditText mEditUsermane, mEditPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEditUsermane = (EditText)findViewById(R.id.editUsernameRegister);
        mEditPassword = (EditText)findViewById(R.id.editPasswordRegister);
    }

    public void registerNewUser(View view){
        validateUsername(mEditUsermane.getText().toString());
    }

    private void validateUsername(String email){
        if(isEmailValid(email)){
            //Email is valid. Check if it is in the system.
            //Firebase
                //if true;
                    //Create a new user with the given email and password
                    //and make the user log in.
        }else {
            Toast.makeText(Register.this, "Email is already being used", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
