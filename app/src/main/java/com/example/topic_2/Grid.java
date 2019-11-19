package com.example.topic_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Grid extends AppCompatActivity {

    Button btnOne,btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnSum,btnSub,btnMulti,btnDiv,btnDot,btnEqual;
    EditText etResult;
    boolean Sum,Sub,Multi,Div;
    Float res1,res2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);
        btnZero=findViewById(R.id.btnZero);
        btnDot=findViewById(R.id.btnDot);
        btnSum=findViewById(R.id.btnSum);
        btnSub=findViewById(R.id.btnSub);
        btnMulti=findViewById(R.id.btnMulti);
        btnDiv=findViewById(R.id.btnDiv);
        btnEqual=findViewById(R.id.btnEqual);
        etResult=findViewById(R.id.etResult);



        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etResult.setText(etResult.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etResult.getText().toString().contains("."))
                {
                    etResult.setText(etResult.getText()+"");
                }
                else
                {
                    etResult.setText(etResult.getText()+".");
                }

            }
        });

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(TextUtils.isEmpty(etResult.getText()))
               {
                   etResult.setText("");
               }
               else
               {
                   res1=Float.parseFloat(etResult.getText().toString());
                   Sum=true;
                   etResult.setText("");
               }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etResult.getText()))
                {
                    etResult.setText(etResult.getText()+"-");
                }
                else
                {
                    res1=Float.parseFloat(etResult.getText().toString());
                    Sub=true;
                    etResult.setText("");
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etResult.getText()))
                {
                    etResult.setText("");
                }
                else
                {
                    res1=Float.parseFloat(etResult.getText().toString());
                    Multi=true;
                    etResult.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etResult.getText()))
                {
                    etResult.setText("");
                }
                else
                {
                    res1=Float.parseFloat(etResult.getText().toString());
                    Div=true;
                    etResult.setText("");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                res2=Float.parseFloat(etResult.getText().toString());

                if(Sum==true)
                {
                    result=res1+res2;
                    etResult.setText(""+result);
                    Sum=false;

                }
                if(Sub==true)
                {
                    result=res1-res2;
                    etResult.setText(""+result);
                    Sub=false;

                }
                if(Multi==true)
                {
                    result=res1*res2;
                    etResult.setText(""+result);
                    Multi=false;

                }

                if(Div==true)
                {
                    result=res1/res2;
                    etResult.setText(""+result);
                    Div=false;

                }
            }
        });













    }
}
