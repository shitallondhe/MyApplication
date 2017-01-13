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

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class SwappingElementsFragment extends Fragment {

    EditText mEdtFirstNo,mEdtSeconNo;
    TextView mTxtFirstNo,mTxtSecondNo;
    Button mBtnResult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate
                (R.layout.fragment_swapping_elements, container, false);

        mEdtFirstNo = (EditText)view.findViewById(R.id.edtFirst);
        mEdtSeconNo = (EditText)view.findViewById(R.id.edtSecond);



        mTxtFirstNo = (TextView)view.findViewById(R.id.txtFirst);
        mTxtSecondNo = (TextView)view.findViewById(R.id.txtSecond);


        mBtnResult = (Button)view.findViewById(R.id.btnResult);



        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ArrayList<Integer> al = new ArrayList<Integer>();

                al.add(23);
                al.add(21);
                al.add(5);
                al.add(8);
                al.add(12);
                al.add(16);


                mEdtFirstNo.setText(String.valueOf(al));



                Collections.swap(al, 0, 5);


                mEdtSeconNo.setText(String.valueOf(al));




            }
        });

        return view;
    }

}
