package com.example.lojarevisao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;
import com.example.lojarevisao.model.Produto;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class ProdutosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        List<Produto> meusProdutos = new ArrayList<>();

        meusProdutos.add(new Produto("Samsung Galaxy S20 FE", 2100));
        meusProdutos.add(new Produto("Apple IPhone S20", 10000));
        meusProdutos.add(new Produto("Xiaomi Poco X3 SnapDragon", 2000));
        meusProdutos.add(new Produto("Redmi Note S10", 1800));

        ArrayAdapter<Produto> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, meusProdutos);
        ListView listView = this.findViewById(R.id.activity_produtos_list_view);
        listView.setAdapter(adaptador);

    }
}