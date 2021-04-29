package com.example.sajib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,pass,eml,age;
    Button get,twit,fb,wp;
    String username,useremail,userpass,userage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.usernameid);
        pass=findViewById(R.id.createpasswordid);
        eml=findViewById(R.id.emailid);
        age=findViewById(R.id.ageid);
        get=findViewById(R.id.getstartedid);
        twit=findViewById(R.id.twitterid);
        fb=findViewById(R.id.facebookid);
        wp=findViewById(R.id.whatsappid);



        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=name.getText().toString();
                useremail=eml.getText().toString();
                userpass=pass.getText().toString();
                userage=age.getText().toString();

                if(username.isEmpty())
                {
                    name.setError("Please Enter the user name at  first");
                }
                else if(useremail.isEmpty())
                {
                    eml.setError("Enter your Email");
                }
                else if(userpass.isEmpty()||userpass.length()!=8)
                {
                    pass.setError("please enter the 8 digit password first");
                }
                else if(userage.isEmpty())
                {
                    age.setError("enter your age");
                }
                else {


                    Toast.makeText(MainActivity.this, "User name: " + username + "\n" +
                            "Email: " + useremail + "\n" + "Password: " + userpass + "\n" + "age: \n" + userage, Toast.LENGTH_LONG).show();
                }
            }
        });


        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "https://twitter.com/", Toast.LENGTH_LONG).show();

            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "https://facebook.com/", Toast.LENGTH_LONG).show();
            }
        });

        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "https://whatsapp.com/", Toast.LENGTH_LONG).show();
            }
        });
    }
}