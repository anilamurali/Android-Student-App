package com.androapp.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    AppCompatButton b1,b2;
    String getname,getrollno,getaddress,getuname,getpass,getcpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.rollno);
        ed3=(EditText) findViewById(R.id.add);
        ed4=(EditText) findViewById(R.id.uname);
        ed5=(EditText) findViewById(R.id.pwd);
        ed6=(EditText) findViewById(R.id.cpwd);
        b1=(AppCompatButton) findViewById(R.id.regbtn);
        b2=(AppCompatButton) findViewById(R.id.gtlogin);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getrollno=ed2.getText().toString();
                getaddress=ed3.getText().toString();
                getuname=ed4.getText().toString();
                getpass=ed5.getText().toString();
                getcpass=ed6.getText().toString();
                if(getpass.equals(getcpass))
                {
                    Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getrollno, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getaddress, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getuname, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getpass, Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), getcpass, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Password and confirm password  does not match"
                            , Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}