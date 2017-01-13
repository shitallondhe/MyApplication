package com.example.shitalbharatlondhe.navigationview_master;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class RandomNumberFragment extends Fragment {

    TextView mTxtResult,mTxtrdnum;
    Button mBtnResult;
    ArrayList<Integer> mylist = new ArrayList<Integer>();



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_random_number, container, false);

        mTxtResult = (TextView) v.findViewById(R.id.txtResult);
        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Random rn = new Random();

                for(int i =10; i < 100; i++)
                {
                    int answer = rn.nextInt(100) + 1;
                    mylist.add(answer);
                }
                mTxtResult.setText(String.valueOf(mylist));


            }
        });
  return v;

    }
}
