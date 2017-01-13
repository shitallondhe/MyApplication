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

public class DriverInsurnceFragment extends Fragment {


    EditText mEdtAge, mEdtSex, mEdtmartial_status;
    TextView mTxtAge, mTxtSex, mTxtmartial_status, mTxtResult;
    Button mBtnResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_driver_insurance, container, false);

        mEdtAge = (EditText) v.findViewById(R.id.edtAge);
        mEdtSex = (EditText) v.findViewById(R.id.edtSex);
        mEdtmartial_status = (EditText) v.findViewById(R.id.edtmartialStatus);

        mTxtAge = (TextView) v.findViewById(R.id.txtAge);
        mTxtSex = (TextView) v.findViewById(R.id.txtSex);
        mTxtmartial_status = (TextView) v.findViewById(R.id.txtMaterialSatus);
        mTxtResult = (TextView) v.findViewById(R.id.txtResult);


        mBtnResult = (Button) v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEdtAge.getText().length() > 0 && mEdtSex.getText().length() > 0 && mEdtmartial_status.getText().length() > 0) {
                    int age;

                    age = Integer.parseInt(mEdtAge.getText().toString());
                    char sex = (mEdtSex.getText().charAt(0));
                    char ms = (mEdtmartial_status.getText().charAt(0));


                    if (ms == 'M') {
                        mTxtResult.setText("The driver is insured");
                    } else {
                        if (sex == 'M')

                        {
                            if (age > 30) {
                                mTxtResult.setText("Driver is insured");
                            } else {
                                mTxtResult.setText("Driver is not insured");
                            }
                        } else {
                            if (age > 25) {
                                mTxtResult.setText("Driver is insured");
                            } else {
                                mTxtResult.setText("Driver is not insured");
                            }
                        }
                    }
                } else {
                    Toast.makeText(getActivity(), "Please Enter All fields", Toast.LENGTH_LONG).show();
                }


            }
        });
        return v;


    }
}