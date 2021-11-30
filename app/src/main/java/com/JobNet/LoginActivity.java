package com.JobNet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText user, pass;
    Button Btn_login, Btn_registrar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=(EditText)findViewById(R.id.etUserName);
        pass=(EditText)findViewById(R.id.etPassword);
        Btn_login=(Button)findViewById(R.id.btnlogin);
        Btn_registrar=(Button)findViewById(R.id.btnregister);
        Btn_login.setOnClickListener(this);
        Btn_registrar.setOnClickListener(this);
        daoUsuario dao = new daoUsuario(this);

    }

    public void goToMain(View view) {
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnlogin:
                String u=user.getText().toString();
                String p=pass.getText().toString();
                if (u.equals("")&&p.equals("")){
                    Toast toast1 = Toast.makeText(this, "ERROR:campos vacíos", Toast.LENGTH_LONG);
                    toast1.show();
                }else if(dao.login(u,p)==1){
                    Usuario ux = dao.getUsuario(u,p);
                    Toast toast1 = Toast.makeText(this, "Datos correctos", Toast.LENGTH_LONG);
                    toast1.show();
                    Intent i=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);
                    i.putExtra("Id",ux.getId());
                }
            break;

            case R.id.btnregister:
                Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            break;
        }
    }
}