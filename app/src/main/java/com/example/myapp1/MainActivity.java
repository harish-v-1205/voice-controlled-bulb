package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
private EditText password;
private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.etname);
        password=(EditText)findViewById(R.id.etpassword);
        Login=(Button)findViewById(R.id.btnlogin);
Login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        validate(Name.getText().toString(),password.getText().toString());

    }
});
    }
    private void validate(String userName,String userPassword)
    {
     if((userName.equals("sece"))&&(userPassword.equals("ece")))
     {
         Toast.makeText(getApplicationContext(),"Authentication success",Toast.LENGTH_SHORT).show();
         Intent intent=new Intent(MainActivity.this,SecondActivity.class);
         startActivity(intent);
     }
     else
     {
         Toast.makeText(getApplicationContext(),"Authentication failed",Toast.LENGTH_SHORT).show();
     }

    }
}