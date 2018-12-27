package com.example.bruger.knowwhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //FirebaseManager firebaseManager = new FirebaseManager();
    DataManager dataManager = DataManager.getInstance();

    EditText mEditUsername, mEditPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mEditUsername = (EditText) findViewById(R.id.editUsername);
        mEditPassword = (EditText) findViewById(R.id.editPassword);

        initiateData();
    }

    public void logIn(View view){

        String tempUsername = mEditUsername.getText().toString();
        String tempPassword = mEditPassword.getText().toString();

        boolean checkUser = dataManager.checkUserCredentials(tempUsername, tempPassword);

        if(!tempUsername.isEmpty() && !tempPassword.isEmpty()){
            if(checkUser){
                Intent intent = new Intent(this,Board.class);

                startActivity(intent);
            }else{
                Toast.makeText(this,"The user credentials are wrong. Please try again", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this,"Please enter an username and a password", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view){
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

    private void initiateData(){
        dataManager.getEstablishments();
        dataManager.getPosts();
    }

}
