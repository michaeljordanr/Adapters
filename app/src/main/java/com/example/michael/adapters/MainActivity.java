package com.example.michael.adapters;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    //private ArrayAdapter<CharSequence> adapter;
    //private ArrayAdapter<String> adapter;
    private ProdutosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //adapter = ArrayAdapter.createFromResource(this, R.array.produtos, android.R.layout.simple_list_item_1);
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
//
//        adapter.add(getString(R.string.coffee));
//        adapter.add(getString(R.string.noddles));
//        adapter.add(getString(R.string.beans));

        adapter = new ProdutosAdapter(this, Produto.getProdutos());

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //String item = adapter.getItem(position);
        Produto item = (Produto) adapter.getItem(position);

        Toast.makeText(this, "Item clicado " + item.getNome(),Toast.LENGTH_LONG).show();
    }
}
