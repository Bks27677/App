package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myapplication.adapter.ProductAdapter;
import com.example.myapplication.adapter.ProductCategoryAdapter;
import com.example.myapplication.model.ProductCategory;
import com.example.myapplication.model.Products;

import java.util.ArrayList;
import java.util.List;

public class SshopActivity extends AppCompatActivity {
    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sshop);



        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Trending"));
        productCategoryList.add(new ProductCategory(2, "Most Popular"));
        productCategoryList.add(new ProductCategory(3, "All Body Products"));
        productCategoryList.add(new ProductCategory(4, "Skin Care"));
        productCategoryList.add(new ProductCategory(5, "Hair Care"));
        productCategoryList.add(new ProductCategory(6, "Make Up"));
        productCategoryList.add(new ProductCategory(7, "Fragrance"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Product001", "500 ชิ้น", "300 Bath", R.drawable.a001));
        productsList.add(new Products(2, "Product002", "350 ชิ้น", "500 Bath", R.drawable.a002));
        productsList.add(new Products(1, "Product003", "500 ชิ้น", "300 Bath", R.drawable.a003));
        productsList.add(new Products(2, "Product004", "350 ชิ้น", "500 Bath", R.drawable.a004));
        productsList.add(new Products(1, "Product005", "500 ชิ้น", "300 Bath", R.drawable.a005));
        productsList.add(new Products(2, "Product006", "350 ชิ้น", "500 Bath", R.drawable.a006));
        productsList.add(new Products(2, "Product007", "350 ชิ้น", "500 Bath", R.drawable.a007));
        productsList.add(new Products(2, "Product008", "350 ชิ้น", "500 Bath", R.drawable.a008));
        productsList.add(new Products(2, "Product009", "350 ชิ้น", "500 Bath", R.drawable.a009));

        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }

    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }


}
