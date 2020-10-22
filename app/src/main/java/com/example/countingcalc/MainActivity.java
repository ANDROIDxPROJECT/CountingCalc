package com.example.countingcalc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button B0, B1, B2, B3, B4, B5, B6, B7, B8, B9, BEQ, BPT, BADD, BSUB, BMUL, BDIV, BCC;
    EditText SET;
    float VAL1, VAL2;
    boolean SETADD, SETSUB, SETMUL, SETDIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B0 = (Button) findViewById(R.id.BT0);
        B1 = (Button) findViewById(R.id.BT1);
        B2 = (Button) findViewById(R.id.BT2);
        B3 = (Button) findViewById(R.id.BT3);
        B4 = (Button) findViewById(R.id.BT4);
        B5 = (Button) findViewById(R.id.BT5);
        B6 = (Button) findViewById(R.id.BT6);
        B7 = (Button) findViewById(R.id.BT7);
        B8 = (Button) findViewById(R.id.BT8);
        B9 = (Button) findViewById(R.id.BT9);

        BEQ = (Button) findViewById(R.id.EQ);
        BPT = (Button) findViewById(R.id.PT);
        BADD = (Button) findViewById(R.id.ADD);
        BSUB = (Button) findViewById(R.id.SUB);
        BMUL = (Button) findViewById(R.id.MUL);
        BDIV = (Button) findViewById(R.id.DIV);
        BCC = (Button) findViewById(R.id.CC);

        SET = (EditText) findViewById(R.id.ET);

        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "0");
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "1");
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "2");
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "3");
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "4");
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "5");
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "6");
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "7");
            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "8");
            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText() + "9");
            }
        });

        BADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SET == null) {
                    SET.setText("");
                } else {
                    VAL1 = Float.parseFloat(SET.getText() + "");
                    SETADD = true;
                    SET.setText(null);
                }
            }
        });

        BSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    VAL1 = Float.parseFloat(SET.getText() + "");
                    SETSUB = true;
                    SET.setText(null);
                }
        });

        BMUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    VAL1 = Float.parseFloat(SET.getText() + "");
                    SETMUL = true;
                    SET.setText(null);
                }
        });

        BDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    VAL1 = Float.parseFloat(SET.getText() + "");
                    SETDIV = true;
                    SET.setText(null);
                }
        });

        BEQ.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                VAL2=Float.parseFloat(SET.getText()+"");
                if(SETADD==true){
                    SET.setText(VAL1+VAL2+"");
                    SETADD=false;
                }
                if(SETSUB==true){
                    SET.setText(VAL1-VAL2+"");
                    SETSUB=false;
                }
                if(SETMUL==true){
                    SET.setText(VAL1*VAL2+"");
                    SETMUL=false;
                }
                if(SETDIV==true){
                    SET.setText(VAL1/VAL2+"");
                    SETDIV=false;
                }
            }
        });

        BCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText("");
            }
        });

        BPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SET.setText(SET.getText()+".");
            }
        });
    }
}