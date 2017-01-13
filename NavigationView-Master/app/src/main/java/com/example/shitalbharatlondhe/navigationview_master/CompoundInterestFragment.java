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

public class CompoundInterestFragment extends Fragment {



    EditText mEdtPrincipalAmount,mEdtRate,mEdtTime,mEdtYear,mEdtCompoundInterest;
    TextView mTxtPrincipalAmount,mTxtRate,mTxtTime,mTxtYear,mTxtCompoundInterest;
    Button mBtnResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_compound_interest, container, false);


        mEdtPrincipalAmount =(EditText)v.findViewById(R.id.edtPrincipalAmount);
        mEdtRate =(EditText)v.findViewById(R.id.edtRate);
        mEdtTime =(EditText)v.findViewById(R.id.edtTime);
        mEdtYear =(EditText)v.findViewById(R.id.edtYear);
        mEdtCompoundInterest =(EditText)v.findViewById(R.id.edtCompoundInterest);

        mTxtPrincipalAmount =(TextView)v.findViewById(R.id.txtPrincipalAmount);
        mTxtRate =(TextView)v.findViewById(R.id.txtRate);
        mTxtTime =(TextView)v.findViewById(R.id.txtTime);
        mTxtYear =(TextView)v.findViewById(R.id.txtYear);
        mTxtCompoundInterest =(TextView)v.findViewById(R.id.txtCompoundInterest);

        mEdtCompoundInterest.setVisibility(View.GONE);

        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( mEdtPrincipalAmount.getText().length()>0 && mEdtRate.getText().length()>0&& mEdtTime.getText().length()>0  &&mEdtYear.getText().length()>0) {

                    double principal = 0;
                    double rate = 0;
                   double time = 0;
                    double years = 0;
                    double amount = 0;

                    double compoundInterest = 0;
                    mEdtCompoundInterest.setVisibility(View.VISIBLE);

                    principal = Double.parseDouble(mEdtPrincipalAmount.getText().toString());
                    rate = Double.parseDouble(mEdtRate.getText().toString());
                    time = Double.parseDouble(mEdtTime.getText().toString());
                    years = Double.parseDouble(mEdtYear.getText().toString());

                    for (int i = 1; i < years; i++) {
                        amount = principal * Math.pow((1.0 + (rate / 100) / 4), 4 * years);

                    }

                    mEdtCompoundInterest.setText(String.valueOf(amount));
                }
                else
                {
                    Toast.makeText(getActivity(),"Plz Enter All Fields",Toast.LENGTH_LONG).show();
                }

            }
        });
   return  v;


    }

}
