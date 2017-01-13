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

public class TelephoneBillsFragment extends Fragment {

    EditText mEdtCalls,mEdtBill;
    TextView mTxtcalls,mTxtBill;
    Button mBtnGenerateBill;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_telephone_bill, container, false);


        mEdtCalls =(EditText)v.findViewById(R.id.edtcalls);
        mEdtBill = (EditText)v.findViewById(R.id.edtBill);

        mTxtcalls =(TextView)v.findViewById(R.id.txtCalls);
        mTxtBill =(TextView)v.findViewById(R.id.txtBill);

        mBtnGenerateBill =(Button)v.findViewById(R.id.btnGnerateBill);


        mBtnGenerateBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mEdtCalls.getText().length()>0) {
                    int calls;
                    double bill;

                    calls = Integer.parseInt(mEdtCalls.getText().toString());

                    if (calls <= 100) {
                        bill = 200;
                    } else if (calls > 100 && calls <= 150) {
                        calls = calls - 100;
                        bill = (200 + (0.60 * calls));
                    } else if (calls > 150 && calls <= 200) {
                        calls = calls - 150;
                        bill = 200 + (0.60 * 50) + (0.50 * calls);
                    } else {
                        calls = calls - 200;
                        bill = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * calls);
                    }

                    mEdtBill.setText(String.valueOf(bill));

                }
                else
                {
                    Toast.makeText(getActivity(),"Plz Enter the calls",Toast.LENGTH_LONG).show();
                }

            }
        });




        return v;
    }


    }
