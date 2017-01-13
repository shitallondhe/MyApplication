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
 * Created by Shital Bharat Londhe on 24-Nov-16.
 */

public class SimpleInterestFragment extends Fragment {


    EditText mEdtAmount, mEdtRate, mEdtTime, mEdtFinalResult;
    TextView mTxtAmount, mTxtRate, mTxtTime, mTxtFinalResult;
    Button mBtnResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_simple_interest, container, false);

        mEdtAmount = (EditText) v.findViewById(R.id.edtAmout);
        mEdtRate = (EditText) v.findViewById(R.id.edtRate);
        mEdtTime = (EditText) v.findViewById(R.id.edtTime);
        mEdtFinalResult = (EditText) v.findViewById(R.id.edtFinalResult);

        mTxtAmount = (TextView) v.findViewById(R.id.txtAmout);
        mTxtRate = (TextView) v.findViewById(R.id.txtRate);
        mTxtTime = (TextView) v.findViewById(R.id.txtTime);
        mTxtFinalResult = (TextView) v.findViewById(R.id.txtFinalResult);

        mBtnResult = (Button) v.findViewById(R.id.btnResult);


        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEdtAmount.getText().length() > 0 && mEdtRate.getText().length() > 0 && mEdtTime.getText().length() > 0) {
                    Float amount, rate;
                    int time;
                    float result;

                    amount = Float.parseFloat(mEdtAmount.getText().toString());
                    rate = Float.parseFloat(mEdtRate.getText().toString());
                    time = Integer.parseInt(mEdtTime.getText().toString());


                    result = amount * rate * time / 100;


                    mEdtFinalResult.setText(String.valueOf(result));

                } else {
                    Toast.makeText(getActivity(), "Please Enter All fields", Toast.LENGTH_LONG).show();
                }


            }
        });

        return v;
    }

}