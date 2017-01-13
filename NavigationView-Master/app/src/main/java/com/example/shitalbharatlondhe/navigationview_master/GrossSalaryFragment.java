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

public class GrossSalaryFragment extends Fragment {


    EditText mEdtBasicSalary,mEdtHRA,mEdtDA,mEdtPF,mEdtTAX,mEdtGrossSalary;
    TextView mTxtBasicSalary,mTxtHRA,mTxtDA,mTxtPF,mTxtTAX,mTxtGrossSalary;
    Button mBtnResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_gross_salary, container, false);



        mEdtBasicSalary = (EditText)v.findViewById(R.id.edtEnterBasicSalary);
        mEdtHRA = (EditText)v.findViewById(R.id.edtEnterHRA);
        mEdtDA = (EditText)v.findViewById(R.id.edtEntertheDA);
        mEdtPF = (EditText)v.findViewById(R.id.edtEnterthePF);
        mEdtTAX = (EditText)v.findViewById(R.id.edtEntertheTax);
        mEdtGrossSalary = (EditText)v.findViewById(R.id.edtGrossSalary);

        mTxtBasicSalary =(TextView)v.findViewById(R.id.txtEnterBasicSalary);
        mTxtHRA =(TextView)v.findViewById(R.id.txtEnterHRA);
        mTxtDA = (TextView)v.findViewById(R.id.txtEntertheDA);
        mTxtPF = (TextView)v.findViewById(R.id.txtEnterthePF);
        mTxtTAX = (TextView)v.findViewById(R.id.txtEntertheTax);
        mTxtGrossSalary =(TextView)v.findViewById(R.id.txtEnterBasicSalary);

        mBtnResult = (Button)v.findViewById(R.id.btnResult);
        mEdtGrossSalary.setVisibility(View.GONE);
        mEdtBasicSalary.requestFocus();

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtBasicSalary.getText().length()>0 && mEdtHRA.getText().length()>0 && mEdtDA.getText().length()>0 &&mEdtPF.getText().length()>0
                        && mEdtTAX.getText().length()>0) {
                    float basic, hra, da, pf, tax, gross;

                    basic = Float.parseFloat(mEdtBasicSalary.getText().toString());
                    hra = Float.parseFloat(mEdtHRA.getText().toString());
                    da = Float.parseFloat(mEdtDA.getText().toString());
                    pf = Float.parseFloat(mEdtPF.getText().toString());
                    tax = Float.parseFloat(mEdtTAX.getText().toString());
                    mEdtGrossSalary.setVisibility(View.VISIBLE);

                    hra = basic * (hra / 100);
                    da = basic * (da / 100);
                    pf = basic * (pf / 100);
                    tax = basic * (tax / 100);

                    gross = (basic + hra + da) - (pf + tax);

                    mEdtGrossSalary.setText(String.valueOf(gross));

                }
                else
                {
                    Toast.makeText(getActivity(),"Plz Enter All Fields",Toast.LENGTH_LONG).show();
                }
                mEdtBasicSalary.requestFocus();
            }
        });
        return v;



    }


}
