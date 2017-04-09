package com.xeroo.lucius.samplesdemomvp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.xeroo.lucius.samplesdemomvp.R;
import com.xeroo.lucius.samplesdemomvp.presenters.MyPresenter;

public class HomeActivity extends AppCompatActivity implements HomeActivityInterface, AdapterView.OnItemClickListener {
    private MyPresenter presenter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = (ListView) findViewById(R.id.list_city);
        listView.setOnItemClickListener(this);
        presenter = new MyPresenter(this, listView);
        presenter.showListMessage();
    }



    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        presenter.onItemSelected(position);
    }
}
