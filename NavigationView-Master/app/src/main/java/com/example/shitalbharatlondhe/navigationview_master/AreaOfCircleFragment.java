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
 * Created by Admin on 04-06-2015.
 */
public class AreaOfCircleFragment extends Fragment {

    TextView mTxtEnterRadius,mtxtAreaCircle, mTxtFinalResult;
    EditText mEdtEnterRadius;
    Button mBtnAreaOfCircle;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_circle_area,container,false);



        mTxtEnterRadius = (TextView)v.findViewById(R.id.txtEnterRadius);
        mEdtEnterRadius = (EditText) v.findViewById(R.id.edtEnterRadius);
        mTxtFinalResult = (TextView) v.findViewById(R.id.txtFinalResult);


        mBtnAreaOfCircle = (Button)v.findViewById(R.id.btnAreaCircle);

        mBtnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mEdtEnterRadius.getText().toString().length()>0){
                    float radius;
                    double Area;
                    radius = Float.parseFloat(mEdtEnterRadius.getText().toString());

                    Area = 3.14 * radius * radius;


                    mTxtFinalResult.setText(String.valueOf(Area));
                }
                else
                {
                    Toast.makeText(getActivity(), "Please Enter Radius", Toast.LENGTH_LONG).show();
                }



            }
        });






        return v;
    }
}
