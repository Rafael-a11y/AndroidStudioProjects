package com.example.loja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.loja.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosActivity extends AppCompatActivity //Empity Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_produtos); //Aponta para o activity_produtos.xml responsável pelo layout
        List<Produto> meusProdutos = new ArrayList<>();
        meusProdutos.add(new Produto("IPhone S20",6000));
        meusProdutos.add(new Produto("Xiaomi Poco X3",1800));
        meusProdutos.add(new Produto("Samsung Galaxy S20 FE", 2100));
        meusProdutos.add(new Produto("Redmi Note 10S", 1800));

        ArrayAdapter <Produto> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                meusProdutos );
        ListView view = findViewById(R.id.activity_produtos_listview); /*Aponta para o
        android:id="@+id/activity_produtos_listview" que eu dei para a listview dentro de activity_produtosl.xml*/
        view.setAdapter(adaptador); //Seta adaptador como responsável pela ListView view
    }
}