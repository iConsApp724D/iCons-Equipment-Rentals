package com.example.icons724dv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class StudentCart2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Button confirmOrder;
    private ImageView icons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_cart2);

        recyclerView=findViewById(R.id.cartList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        confirmOrder = (Button) findViewById(R.id.requestEquip);
        icons = (ImageView) findViewById(R.id.imageView8);


    }
}