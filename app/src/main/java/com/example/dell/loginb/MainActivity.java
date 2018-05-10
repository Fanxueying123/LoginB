package com.example.dell.loginb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etUser,etPassword;
    private Button btnLogin,btnRegister;
    private TextView tvFindpassword;
    private ImageButton mbtnWeixin,mbtnQq,mbtnWeibo,mbtnTengxu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
//        mbtnWeixin.setImageDrawable(getResources().getDrawable(R.drawable.weixin));

    }

    private void init() {
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.baidu.com");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        tvFindpassword.setOnClickListener(this);
        tvFindpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("http://www.baidu.com");
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        mbtnWeixin.setOnClickListener(this);
        mbtnQq.setOnClickListener(this);
        mbtnWeibo.setOnClickListener(this);
        mbtnTengxu.setOnClickListener(this);
    }

    private void initView() {
        etUser=(EditText)findViewById(R.id.et_user_name);
        etPassword=(EditText)findViewById(R.id.et_psw);
        btnLogin=(Button)findViewById(R.id.btn_login);
        btnRegister=(Button)findViewById(R.id.btn_register);
        tvFindpassword=(TextView)findViewById(R.id.tv_find_psw);
        mbtnWeixin=(ImageButton)findViewById(R.id.Imagebtn_weixin);
        mbtnQq=(ImageButton)findViewById(R.id.Imagebtn_qq);
        mbtnWeibo=(ImageButton)findViewById(R.id.Imagebtn_weibo);
        mbtnTengxu=(ImageButton)findViewById(R.id.Imagebtn_tengxu);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_register:

                break;
            case R.id.Imagebtn_weixin:
                break;
            case R.id.Imagebtn_qq:
                break;
            case R.id.Imagebtn_weibo:
                break;
            case R.id.Imagebtn_tengxu:
                break;

        }
    }

    private void login() {
        String stra=etUser.getText().toString();
        String strb=etPassword.getText().toString();
        try {
            FileOutputStream fos=openFileOutput("data.txt",MODE_PRIVATE);
            fos.write(stra.getBytes());
            fos.write(strb.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
