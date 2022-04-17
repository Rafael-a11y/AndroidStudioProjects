package com.example.lojarevisao2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lojarevisao2.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        List<Produto> meusProdutos = new ArrayList<>();

        meusProdutos.add(new Produto("Samsung Galaxy S20 FE", 2100.00));
        meusProdutos.add(new Produto("Apple IPhone 20S", 5000.00));
        meusProdutos.add(new Produto("Xiaomi Poco X3", 1800.00));
        meusProdutos.add(new Produto("Logitech C922S", 550.00));

        ArrayAdapter<Produto> adaptador = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                meusProdutos);
        
        ListView lista = this.findViewById(R.id.activity_produtos_listview);
        lista.setAdapter(adaptador);

    }
}