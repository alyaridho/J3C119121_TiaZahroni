package com.example.j3c119121_tiazahroni.authadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.j3c119121_tiazahroni.MainActivity;
import com.example.j3c119121_tiazahroni.R;
import com.example.j3c119121_tiazahroni.authUser.loginUser;
import com.example.j3c119121_tiazahroni.authUser.userHelperclass;
import com.example.j3c119121_tiazahroni.authUser.Prevalent;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class loginAdmin extends AppCompatActivity {

    private EditText InputEmailAdmin, InputPasswordAdmin;
    private Button LoginButtonAdmin;
    private ProgressDialog loadingBarAdmin;
    private TextView AdminLink;

    private String parentDbName = "Admins";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        LoginButtonAdmin = (Button) findViewById(R.id.login_btn);
        InputPasswordAdmin = (EditText) findViewById(R.id.login_password_input);
        InputEmailAdmin = (EditText) findViewById(R.id.login_phone_number);
        AdminLink = (TextView) findViewById(R.id.admin_panel_link);


        loadingBarAdmin = new ProgressDialog(this);


        LoginButtonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginAdmin();
            }
        });


        AdminLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginButtonAdmin.setText("Login Admin");
                AdminLink.setVisibility(View.INVISIBLE);
                parentDbName = "Admins";
            }
        });


    }

    private void LoginAdmin() {
        String email = InputEmailAdmin.getText().toString();
        String password = InputPasswordAdmin.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please write your email...",Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please write your password...",Toast.LENGTH_SHORT).show();
        }
        else {
            loadingBarAdmin.setTitle("Login Account");
            loadingBarAdmin.setMessage("Please wait, wait we are checking the credentials");
            loadingBarAdmin.setCanceledOnTouchOutside(false);
            loadingBarAdmin.show();


            AllowAccessToAccount(email, password);
        }
    }

    private void AllowAccessToAccount(final String email, final String password) {

        final DatabaseReference RootRef;
        RootRef = FirebaseDatabase.getInstance().getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(parentDbName).child(email).exists()){
                    userHelperclass usersData = dataSnapshot.child(parentDbName).child(email).getValue(userHelperclass.class);

                    if(usersData.getEmail().equals(email)){
                        if(usersData.getPassword().equals(password)){
                            if (parentDbName.equals("Users"))
                            {
                                Toast.makeText(loginAdmin.this, "Log in Sucessfully...", Toast.LENGTH_SHORT).show();
                                loadingBarAdmin.dismiss();

                                Intent intent = new Intent(loginAdmin.this, MainActivity.class);
                                startActivity(intent);
                            }
                            else if(parentDbName.equals("Admins"))
                            {
                                Toast.makeText(loginAdmin.this, "Welcome Admin, you are logged in Sucessfully...", Toast.LENGTH_SHORT).show();
                                loadingBarAdmin.dismiss();

                                Intent intent = new Intent(loginAdmin.this, MainActivity.class);
                                Prevalent.currentOnlineUser = usersData;
                                startActivity(intent);
                            }
                        }else {
                            loadingBarAdmin.dismiss();
                            Toast.makeText(loginAdmin.this, "Password is incorrect...",Toast.LENGTH_SHORT).show();
                        }
                    }
                }else {
                    Toast.makeText(loginAdmin.this, "Account with this "+ email + " number do not exists",Toast.LENGTH_SHORT).show();
                    loadingBarAdmin.dismiss();
                    Toast.makeText(loginAdmin.this, "You need to create new Account",Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}