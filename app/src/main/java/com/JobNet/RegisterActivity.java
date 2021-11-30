package com.JobNet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
EditText nom, pas, us, ape;
Button res, can;
daoUsuario dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nom=(EditText)findViewById(R.id.et_reg_name);
        pas=(EditText)findViewById(R.id.et_reg_pass);
        us=(EditText)findViewById(R.id.et_reg_email);
        ape=(EditText)findViewById(R.id.et_reg_ape);
        res=(Button)findViewById(R.id.btnregister_r);
        can=(Button)findViewById(R.id.btncancel_reg);
        res.setOnClickListener(this);
        can.setOnClickListener(this);
        dao= new daoUsuario(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnregister_r:
                Usuario user=new Usuario();
                user.setNombre(nom.getText().toString());
                user.setApellido(ape.getText().toString());
                user.setUsuario(us.getText().toString());
                user.setPassword(pas.getText().toString());
                if(!user.isNull()){
                    Toast toast1 = Toast.makeText(this, "ERROR:campos vacíos", Toast.LENGTH_LONG);
                    toast1.show();
                }else if (dao.insertUsuario(user)){
                    Toast toast2 = Toast.makeText(this, "¡Registro exitoso!", Toast.LENGTH_LONG);
                    toast2.show();
                    Intent i2=new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(i2);
                    finish();
                }else{
                    Toast toast3 = Toast.makeText(this, "Usuario ya resgitrado", Toast.LENGTH_LONG);
                    toast3.show();
                }

                break;
            case R.id.btncancel_reg:
                Intent i=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
                break;
        }
    }
}