package com.example.shitalbharatlondhe.navigationview_master;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class CAlculatorFragment extends Fragment {

    Button
            b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, clear, memory, sin, cos, tan, root, enter, dot,recall;
    EditText e1;
    Double val1, val2;
    double val3;
    boolean addi, subt, mult, divi, sine, cosine, tangent, sqroot, mem,rec;

    ArrayList arr = new ArrayList();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_calculator, container, false);





        b1 = (Button)v. findViewById(R.id.btn1);
        b2 = (Button) v.findViewById(R.id.btn2);
        b3 = (Button) v.findViewById(R.id.btn3);
        b4 = (Button)v. findViewById(R.id.btn4);
        b5 = (Button) v.findViewById(R.id.btn5);
        b6 = (Button) v.findViewById(R.id.btn6);
        b7 = (Button) v.findViewById(R.id.btn7);
        b8 = (Button) v.findViewById(R.id.btn8);
        b9 = (Button) v.findViewById(R.id.btn9);
        b0 = (Button) v.findViewById(R.id.btn0);
        add = (Button) v.findViewById(R.id.btnAdd);
        sub = (Button) v.findViewById(R.id.btnSub);
        mul = (Button) v.findViewById(R.id.btnMul);
        div = (Button) v.findViewById(R.id.btnDiv);
        clear = (Button) v.findViewById(R.id.btnCl);
        memory = (Button) v.findViewById(R.id.btnM);
        sin = (Button) v.findViewById(R.id.btnsin);
        cos = (Button) v.findViewById(R.id.btnCos);
        tan = (Button) v.findViewById(R.id.btnTan);
        root = (Button) v.findViewById(R.id.btnRoot);
        enter = (Button) v.findViewById(R.id.btnEnter);
        dot = (Button) v.findViewById(R.id.btnDot);
        recall = (Button)v.findViewById(R.id.btnrec);
        //square = (Button)findViewById(R.id.btnSq);


        e1 = (EditText) v.findViewById(R.id.edtRseult);
        e1.setText("");



        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"4");
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+"0");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (e1 == null) {
                    e1.setText("");
                }else {
                    val1 = Double.parseDouble(e1.getText() + "");
                    addi = true;
                    e1.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                val1=Double.parseDouble(e1.getText()+"");
                subt=true;
                e1.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                val1=Double.parseDouble(e1.getText()+"");
                mult=true;
                e1.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                val1=Double.parseDouble(e1.getText()+"");
                divi=true;
                e1.setText(null);
            }
        });

        root.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                val3=Double.parseDouble(e1.getText()+"");
                sqroot=true;
                e1.setText(null);
            }
        });

        sin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                val3=Double.parseDouble(e1.getText()+"");
                sine=true;
                e1.setText(null);
            }
        });

        cos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                val3=Double.parseDouble(e1.getText()+"");
                cosine=true;
                e1.setText(null);
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                val3=Double.parseDouble(e1.getText()+"");
                tangent=true;
                e1.setText(null);
            }
        });

        memory.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                val1=Double.parseDouble(e1.getText()+"");
                mem=true;
                e1.setText(null);


            }
        });

        dot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                e1.setText(e1.getText()+".");


            }
        });

        recall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText()+ " ");
                rec=true;
                e1.setText(null);


            }
        });




        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                e1.setText(null);

            }
        });


        enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (addi == true) {
                    val2 = Double.parseDouble(e1.getText() + " ");
                    e1.setText(val1 + val2 + " ");
                    addi = false;

                }
                if (subt == true) {
                    val2 = Double.parseDouble(e1.getText() + "");
                    e1.setText(val1 - val2 + " ");
                    subt = false;

                }

                if (mult == true) {

                    val2 = Double.parseDouble(e1.getText() + "");
                    e1.setText(val1 * val2 + " ");
                    mult = false;
                }
                if (divi == true) {

                    val2 = Double.parseDouble(e1.getText() + "");
                    e1.setText(val1 / val2 + " ");
                    divi = false;

                }
                if (sqroot == true) {
                    double d = Math.sqrt(val3);
                    String r = new Double(d).toString();

                    e1.setText(r);
                    sqroot = false;

                }

                if (sine == true) {


                    val3 = Math.toRadians(val3);
                    double d = Math.sin(val3);

                    String r = new Double(d).toString();
                    e1.setText(r);
                    sine = false;


                }

                if (cosine == true) {


                    val3 = Math.toRadians(val3);
                    double d = Math.cos(val3);
                    String r = new Double(d).toString();

                    e1.setText(r);
                    cosine = false;


                }

                if (tangent == true) {

                    val3 = Math.toRadians(val3);
                    double d = Math.tan(val3);
                    String r = new Double(d).toString();
                    //txtResult.setText(Double.toString(theResult));

                    e1.setText(r);
                    tangent = false;


                }


                if (mem == true) {


                    String result = new Double(val1).toString();
                    arr.add(result);
                    e1.setText("Saved");
                    mem = false;
                }


                if (rec == true) {

                    for (int i = 0; i != arr.size(); i++) {

                        e1.setText("" + arr);
                        rec = false;

                    }

                }
            }
        });


return v;


    }


    }
