package com.example.shitalbharatlondhe.navigationview_master;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class NoteDemoFragment extends Fragment {



    EditText mEdt500,mEdt100,mEdt50,mEdt20,mEdt10,mEdt5,mEdt2,mEdt1 ,mEdtAmount;
    TextView mTxt500,mTxt100,mTxt50,mTxt20,mTxt10,mTxt5,mTxt2,mTxt1,mTxtAmount;
    Button mBtnResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_note_demo, container, false);





        mEdt500 = (EditText)v.findViewById(R.id.edt500);
        mEdt100 = (EditText)v.findViewById(R.id.edt100);
        mEdt50 = (EditText)v.findViewById(R.id.edt50);
        mEdt100 = (EditText)v.findViewById(R.id.edt100);
        mEdt20 = (EditText)v.findViewById(R.id.edt20);
        mEdt10 = (EditText)v.findViewById(R.id.edt10);
        mEdt5 = (EditText)v.findViewById(R.id.edt5);
        mEdt2 = (EditText)v.findViewById(R.id.edt2);
        mEdt1 = (EditText)v.findViewById(R.id.edt1);
        mEdtAmount = (EditText)v.findViewById(R.id.edtAmount);

        mTxt500 = (TextView)v.findViewById(R.id.txt500);
        mTxt100 = (TextView)v.findViewById(R.id.txt100);
        mTxt50 = (TextView)v.findViewById(R.id.txt50);
        mTxt20 = (TextView)v.findViewById(R.id.txt20);
        mTxt10 = (TextView)v.findViewById(R.id.txt10);
        mTxt5 = (TextView)v.findViewById(R.id.txt5);
        mTxt2 = (TextView)v.findViewById(R.id.txt2);
        mTxt1 = (TextView)v.findViewById(R.id.txt1);
        mTxtAmount = (TextView)v.findViewById(R.id.txtAmount);
        mTxt500 = (TextView)v.findViewById(R.id.txt500);


        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mEdtAmount.getText().length()>0)

                {
                    int amount;
                    int note500, note100, note50, note20, note10, note5, note2, note1;
                    note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;

                    amount = Integer.parseInt(mEdtAmount.getText().toString());

                    if (amount >= 500) {
                        note500 = amount / 500;
                        amount = amount - note500 * 500;

                    }
                    mEdt500.setText(String.valueOf(note500));
                    if (amount >= 100) {
                        note100 = amount / 100;
                        amount = amount - note100 * 100;
                    }
                    mEdt100.setText(String.valueOf(note100));
                    if (amount >= 50) {
                        note50 = amount / 50;
                        amount = amount - note50 * 50;

                    }
                    mEdt50.setText(String.valueOf(note50));

                    if (amount >= 20) {
                        note20 = amount / 20;
                        amount = amount - note20 * 20;

                    }
                    mEdt20.setText(String.valueOf(note20));
                    if (amount >= 10) {
                        note10 = amount / 10;
                        amount = amount - note10 * 10;


                    }
                    mEdt10.setText(String.valueOf(note10));

                    if (amount >= 5) {
                        note5 = amount / 5;
                        amount = amount - note5 * 5;

                    }
                    mEdt5.setText(String.valueOf(note5));

                    if (amount >= 2) {
                        note2 = amount / 2;
                        amount = amount - note2 * 2;

                    }
                    mEdt2.setText(String.valueOf(note2));

                    if (amount >= 1) {
                        note1 = amount;


                    }
                    mEdt1.setText(String.valueOf(note1));
                }
                else
                {
                    Toast.makeText(getActivity(),"Please Enter the amount",Toast.LENGTH_LONG).show();
                }

            }
        });

   return v;

    }

    }
