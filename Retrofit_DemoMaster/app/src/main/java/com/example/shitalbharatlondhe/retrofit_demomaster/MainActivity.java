package com.example.shitalbharatlondhe.retrofit_demomaster;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends ListActivity
{

    List<Flower> flowerList;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://services.hanselandpetal.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        FlowerAPI flowerAPI = retrofit.create(FlowerAPI.class);


        Call<List<Flower>> finallist = flowerAPI.getData();

        finallist.enqueue(new Callback<List<Flower>>() {
            @Override
            public void onResponse(Call<List<Flower>> call, Response<List<Flower>> response) {

                int StatusCode = response.code();

                Log.d("Flower code",""+StatusCode);

                flowerList = response.body();


                setListAdapter(new adapter(MainActivity.this,R.layout.item_file,R.id.name,flowerList));


            }

            @Override
            public void onFailure(Call<List<Flower>> call, Throwable t) {

            }
        });





//        flowerAPI.getData(new Callback<List<Flower>>()
//        {
//            @Override
//            public void onResponse(Call<List<Flower>> call, Response<List<Flower>> response)
//            {
//
//                flowerList = (List<Flower>) call;
//                adapter adapt = new adapter(getApplicationContext(),R.layout.item_file,flowerList);
//                //ListView listView = (ListView) findViewById(R.id.list);
//                setListAdapter(adapt);
//
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Flower>> call, Throwable t)
//            {
//                Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
//            }
//        });



    }
}
