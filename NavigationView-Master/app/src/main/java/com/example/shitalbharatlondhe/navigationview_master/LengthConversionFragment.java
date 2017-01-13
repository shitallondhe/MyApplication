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
 * Created by Shital Bharat Londhe on 22-Nov-16.
 */

public class LengthConversionFragment extends Fragment {




    EditText mEdtLengthinFoot,mEdtLengthinInches,mEdtLengthinCentimeter;
    TextView mTxtLengthinFoot,mTxtLengthinInches,mtxtLengthinCentimeter;
    Button mBtnResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);


        View v = inflater.inflate(R.layout.fragment_length_conversion,container,false);


        mEdtLengthinFoot =(EditText)v.findViewById(R.id.edtLengthinFoot);
        mEdtLengthinInches =(EditText)v.findViewById(R.id.edtLengthinInches);
        mEdtLengthinCentimeter = (EditText)v.findViewById(R.id.edtLengthinCentimeter);

        mTxtLengthinFoot =(TextView)v. findViewById(R.id.txtLengthinFoot);
        mTxtLengthinInches =(TextView) v.findViewById(R.id.txtLengthinInches);
        mtxtLengthinCentimeter =(TextView)v.findViewById(R.id.edtLengthinCentimeter);

        mBtnResult =(Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtLengthinFoot.getText().length()>0 && mEdtLengthinInches.getText().length()>0) {
                    final int INCHES_PER_FOOT = 12;
                    final double CENTIMETERS_PER_INCH = 2.54;

                    int inches, foot = 0;
                    double totalInches;
                    double centimeter;

                    foot = Integer.parseInt(mEdtLengthinFoot.getText().toString());
                    inches = Integer.parseInt(mEdtLengthinInches.getText().toString());

                    totalInches = INCHES_PER_FOOT * foot + inches;
                    centimeter = CENTIMETERS_PER_INCH * totalInches;

                    mEdtLengthinCentimeter.setText(String.valueOf(centimeter));
                    mEdtLengthinFoot.requestFocus();
                }
                else
                {
                    Toast.makeText(getActivity(),"Plz Enter All The Fields", Toast.LENGTH_LONG).show();
                }



            }
        });

        return v;



    }
}
