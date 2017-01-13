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
 * Created by Shital Bharat Londhe on 18-Nov-16.
 */

public class OddEvenNumbersFragment extends Fragment {



    TextView mTxtEnterNo,mTxtOddEven;
    EditText mEdtOddEven,mEdtEnterNo;
    Button mBtnResult;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_odd_even,container,false);



        mTxtEnterNo = (TextView)v.findViewById(R.id.txtEnterNumber);
        mEdtEnterNo = (EditText)v.findViewById(R.id.edtEnterNo);
        mEdtOddEven = (EditText)v.findViewById(R.id.edtResult);
        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtEnterNo.getText().length()>0) {
                    int number;
                    number = Integer.parseInt(mEdtEnterNo.getText().toString());
                    if (number % 2 == 0) {
                        mEdtOddEven.setText("Even Number");
                    } else {
                        mEdtOddEven.setText("Odd Number");
                    }
                }
                else
                {
                    Toast.makeText(getActivity(), "Please Enter the Number", Toast.LENGTH_LONG).show();
                }
            }
        });

        return v;
    }
}
