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

public class TempConversionFragment extends Fragment {

    EditText mEdtTemperatureConversion,mEdtTempInFarade,mEdtTempInCentigrade;
    TextView mTxtTempInFarade,mTxtTempInCentigrade;
    Button mBtnResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v= inflater.inflate(R.layout.fragment_temp_conversion,container,false);


        mEdtTempInFarade = (EditText)v.findViewById(R.id.edtTempInFarade);
        mEdtTempInCentigrade =(EditText)v.findViewById(R.id.edtTempInCentigrade);

        mTxtTempInFarade =(TextView)v.findViewById(R.id.txtEnterTempInFarade);
        mTxtTempInCentigrade = (TextView)v.findViewById(R.id.txtTempInCentigrade);

        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtTempInFarade.getText().length()>0) {
                    double farade, centigrade;
                    farade = Double.parseDouble(mEdtTempInFarade.getText().toString());

                    centigrade = (farade - 32) * 5 / 9;

                    mEdtTempInCentigrade.setText(String.valueOf(centigrade));

                }
                else
                {
                    Toast.makeText(getActivity(),"Plz Enter Temp in Farade",Toast.LENGTH_LONG).show();
                }

            }

        });
        return v;

    }
}
