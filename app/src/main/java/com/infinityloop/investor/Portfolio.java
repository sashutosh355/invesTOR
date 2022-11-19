package com.infinityloop.investor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Portfolio extends AppCompatActivity {

    RecyclerView recyclerView;
    List<myCoinModel> myCoinList;
    TextView userNameTV, totalInvestmentTV, totalReturnTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        userNameTV = (TextView) findViewById(R.id.userName) ;
        totalInvestmentTV = (TextView) findViewById(R.id.totalInvestment);
        totalReturnTV = (TextView) findViewById(R.id.totalReturn);
//
        List<myCoinModel> list2;
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://investormy.herokuapp.com/userDetail";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response)
                    {
                        Log.d("response", response);

                        try {
                            JSONObject obj = new JSONObject(response);
                            userNameTV.setText(String.valueOf(obj.getString("user_name")));
                            totalInvestmentTV.setText( "$ " + String.valueOf(obj.getString("total_investment")));
                            totalReturnTV.setText("$" + String.valueOf(obj.get("total_return")));

                            JSONArray arr = new JSONArray(response);
                            myCoinModel model = new myCoinModel();
                            for(int i = 0; i < arr.length(); i++)
                            {
                                JSONObject tutorialsObject = arr.getJSONObject(i);
                                String name = tutorialsObject.getString("name");
                                String url = tutorialsObject.getString("icon");
                                double apy = tutorialsObject.getDouble("apy");
                                double amount = tutorialsObject.getDouble("amount");
                                model.setName(name);
                                model.setUrl(url);
                                model.setApy(apy);
                                model.setAmount(amount);
                            }

                            myCoinList.add(model);
                            portfolioAdapterMyCoins adapter = new portfolioAdapterMyCoins(myCoinList);
                            recyclerView.setHasFixedSize(true);
                            recyclerView.setLayoutManager(new LinearLayoutManager(Portfolio.this));
                            recyclerView.setAdapter(adapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("ErrorGettingData", error.toString());
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}