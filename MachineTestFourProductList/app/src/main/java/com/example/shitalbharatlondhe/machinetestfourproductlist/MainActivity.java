package com.example.shitalbharatlondhe.machinetestfourproductlist;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{

    EditText mEdtProductListFirst, mEdtProductPrizeFirst, mEdtProductQty;
    Button mBtnSaveProduct,mBtnTotal;
    TextView mTxtProductListFirst, mTxtProductListSecond, mTxtProductPrizeFirst, mTxtProductPrizeSecond, mTxtProductQty, mTxtTotalAmount;
    TextView mTxtTotalAmountResult, mEdtProductPrizeSecondResult, mTxtPInfo;
    Spinner spinner;
    TextView tv,final_result;

    String[] list = new String[5];
    Integer[] prize = new Integer[5];
    int counter = 0;int quantity;
    int total=0;
    Integer[] list1 = new Integer[5];
    ArrayList<Integer>total_array = new ArrayList<Integer>();
    String selected;
    ArrayList<String>numbers = new ArrayList<String>();


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
        mTxtTotalAmountResult  = (TextView) findViewById(R.id.txtTResult);
        mEdtProductPrizeSecondResult = (EditText) findViewById(R.id.edtPPTResult);

        mBtnSaveProduct = (Button) findViewById(R.id.btnPSave);
        mBtnTotal = (Button) findViewById(R.id.btnTotal);

        mEdtProductListFirst = (EditText) findViewById(R.id.edtPList);
        mEdtProductPrizeFirst = (EditText) findViewById(R.id.edtPPrize);
        mEdtProductQty = (EditText) findViewById(R.id.edtpQty);
        spinner = (Spinner) findViewById(R.id.product_spinner);
        tv = (TextView) findViewById(R.id.txtAppend);
        final_result = (TextView)findViewById(R.id.txtFinalallResult);
        mBtnSaveProduct.setOnClickListener(this);
        final TextView tv1 = new TextView(this);

        mEdtProductListFirst.requestFocus();
        mBtnTotal.setVisibility(View.GONE);
        mEdtProductQty.setVisibility(View.GONE);
        mEdtProductPrizeSecondResult.setVisibility(View.GONE);
        spinner.setVisibility(View.GONE);






       mBtnTotal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if( mEdtProductQty.getText().length()>0) {

                  quantity = Integer.valueOf(mEdtProductQty.getText().toString());

                   int pos = spinner.getSelectedItemPosition();
                   selected = String.valueOf(spinner.getItemAtPosition(pos));

                   if (pos <= 5) {
                       total = (quantity * (prize[pos]));
                       tv.append(String.valueOf(selected) + " " + prize[pos] + "   " + String.valueOf(quantity) + "\n");

                       pos++;
                   }

                   mTxtTotalAmountResult.setText(String.valueOf((total)));



                   int total1 = 0;
                   String m ;



                        m = ((mTxtTotalAmountResult.getText().toString()));
                       numbers.add(m);
                       /*final_result.setText(String.valueOf(numbers));*/


                       for(int i = 0; i < numbers.size(); i++)
                       {
                           total1 += Integer.valueOf(numbers.get(i));
                       }

                       final_result.setText(("Rs."+total1));


                 /*  for(int i=0; i<numberlist.size(); i++){
                       sum += Integer.parseInt(numberlist.get(i));
                   }
                   Output.setText("The Sum of all the numbers is " + sum);*/
                      /* for(String s : numbers) {
                           total1 +=Integer.parseInt(s) ;
                           final_result.setText(String.valueOf(total1));
                       }*/

                   /* String toParse =mTxtTotalAmountResult.getText().toString() ; //get the text from the source textview
                   String[] numbers = toParse.split("\\r?\\n");
                   for (String s : numbers) {
                       total1 += Integer.valueOf(s);
                   }*/
                   //final_result.setText(Integer.valueOf("Rs." + total1));

               }
               else
               {
                   Toast.makeText(getApplication(),"Plz Enter the Product Quantity",Toast.LENGTH_LONG).show();
               }

           }

       });

    }

    @Override
    public void onClick(View v) {

        if(mEdtProductListFirst.getText().length()>0 && mEdtProductPrizeFirst.getText().length()>0) {


            if (counter != 5) {
                list[counter] = mEdtProductListFirst.getText().toString();
                prize[counter] = Integer.parseInt(mEdtProductPrizeFirst.getText().toString());
                mEdtProductListFirst.setText("");
                mEdtProductPrizeFirst.setText("");
                counter++;
            } else {
                mEdtProductListFirst.setText("");
                mEdtProductPrizeFirst.setText("");

                Toast.makeText(MainActivity.this, "Array is full", Toast.LENGTH_LONG).show();
                mEdtProductPrizeFirst.setEnabled(false);
                mEdtProductListFirst.setEnabled(false);
                mBtnSaveProduct.setEnabled(false);

                mBtnTotal.setVisibility(View.VISIBLE);
                mEdtProductQty.setVisibility(View.VISIBLE);
                mEdtProductPrizeSecondResult.setVisibility(View.VISIBLE);
                spinner.setVisibility(View.VISIBLE);

            }

            ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_dropdown_item, list);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(this);
        }
        else
        {
            Toast.makeText(getApplication(),"Plz Enter the ProductName And Prize",Toast.LENGTH_LONG).show();
        }
       mEdtProductListFirst.requestFocus();

    }


     @Override
       public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

         mEdtProductPrizeSecondResult.setText(String.valueOf(prize[position]));


     }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}