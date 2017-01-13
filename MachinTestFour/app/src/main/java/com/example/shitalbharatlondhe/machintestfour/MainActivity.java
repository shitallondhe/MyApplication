package com.example.shitalbharatlondhe.machintestfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText mEdtProductListFirst, mEdtProductPrizeFirst, mEdtProductQty;
    Button mBtnSaveProduct;
    TextView mTxtProductListFirst, mTxtProductListSecond, mTxtProductPrizeFirst, mTxtProductPrizeSecond, mTxtProductQty, mTxtTotalAmount;
    TextView mTxtTotalAmountResult, mTxtProductPrizeSecondResult, mTxtPInfo;
/*
     String[] list = new String[5];
    int[] prize = new int[5];*/
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Integer> prize = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxtProductListFirst = (TextView) findViewById(R.id.txtPList);
        mTxtProductListSecond = (TextView) findViewById(R.id.txtPListTwo);
        mTxtProductPrizeFirst = (TextView) findViewById(R.id.txtPPrize);
        mTxtProductPrizeSecond = (TextView) findViewById(R.id.txtPPrizeTwo);
        mTxtProductQty = (TextView) findViewById(R.id.txtPQty);
        mTxtTotalAmount = (TextView) findViewById(R.id.txtTotal);
        mTxtTotalAmountResult = (TextView) findViewById(R.id.txtTResult);
        mTxtProductPrizeSecondResult = (TextView)findViewById(R.id.txtPPTResult);

        mBtnSaveProduct = (Button) findViewById(R.id.btnPSave);

        mEdtProductListFirst = (EditText) findViewById(R.id.edtPList);
        mEdtProductPrizeFirst = (EditText) findViewById(R.id.edtPPrize);
        mEdtProductQty = (EditText) findViewById(R.id.edtpQty);
        Spinner spinner = (Spinner) findViewById(R.id.product_spinner);

        mBtnSaveProduct.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if (mEdtProductListFirst.getText().length() > 0 && mEdtProductPrizeFirst.getText().length() > 0) {
                    if (list.size() >= 5 && prize.size() >= 5) {
                        Toast.makeText(MainActivity.this, "Array is Full", Toast.LENGTH_LONG).show();
                        mEdtProductListFirst.setText("");
                        mEdtProductPrizeFirst.setText("");

                    } else {
                        do {
                            String edtlist = mEdtProductListFirst.getText().toString();
                            list.add(edtlist);
                            mEdtProductListFirst.setText("");
                        } while (list.size() > 5);

                        do {
                            int edtprize = Integer.parseInt(mEdtProductPrizeFirst.getText().toString());
                            prize.add(edtprize);
                            mEdtProductPrizeFirst.setText("");
                        } while (prize.size() > 5);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Please enter both the product and Prize field", Toast.LENGTH_LONG).show();
                }
                mEdtProductListFirst.requestFocus();


            }

        });


        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, android.R.layout.simple_spinner_item,list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

      spinner.setSelection(0,true);

        spinner.setOnItemSelectedListener(onItemSelectedListener1);
        //Spinner spinner = (Spinner) findViewById(R.id.product_spinner);

        for(int i=0; i < adapter.getCount(); i++) {
            if(prize.equals(adapter.getItem(i).toString())){
                spinner.setSelection(i);
                break;
            }
        }
    }

 /*   String list1[]= (String []) list.toArray(new String[list.size()]);
    Integer prize1[]= (Integer[]) prize.toArray(new Integer[prize.size()]);*/

   AdapterView.OnItemSelectedListener onItemSelectedListener1 = new AdapterView.OnItemSelectedListener() {


       @Override
       public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


      /*     String selected = parent.getItemAtPosition(position).toString();
           mTxtProductPrizeSecondResult .setText(selected);*/
//        String myStr = spinner.getSelectedItem().toString();

           /*spinner.getItemAtPosition(spinner.getSelectedItemPosition()).toString();
           mTxtProductPrizeSecondResult.setText(myStr);
*/
          /* Integer s1 = Integer.valueOf(prize1[position]);
           mTxtProductPrizeSecondResult.setText(s1);*/

           /*spinner.setSelection(selected.getPosition(selected_value)+1);*/


           Product myproduct;


           //Spinner s = (Spinner) findViewById(R.id.spinner_id);

         /*  if(!(spinner.getSelectedItem() == null))
           {
               myproduct = (Product)spinner.getSelectedItem();
               mEdtProductQty .setText(Integer.valueOf(myproduct.getPrizeOfProduct()));


           }*/

       }


       @Override
       public void onNothingSelected(AdapterView<?> arg0) {

       }
   };
}


