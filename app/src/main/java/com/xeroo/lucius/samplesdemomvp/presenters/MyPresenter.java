package com.xeroo.lucius.samplesdemomvp.presenters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.xeroo.lucius.samplesdemomvp.R;
import com.xeroo.lucius.samplesdemomvp.models.City;
import com.xeroo.lucius.samplesdemomvp.models.MyModel;
import com.xeroo.lucius.samplesdemomvp.views.HomeActivityInterface;

import java.util.ArrayList;

/**
 * Created by lucius on 09/04/2017.
 */

public class MyPresenter implements PresenterInterface {
    private HomeActivityInterface viewInterface;
    private MyModel model;
    private ListView listView;
    private MyCustomAdapter dataAdapter;

    public MyPresenter(HomeActivityInterface viewInterface) {
        this(viewInterface, null);
    }

    public MyPresenter(HomeActivityInterface viewInterface, ListView listView) {
        this.viewInterface = viewInterface;
        init(listView);
    }

    public void init(ListView listView) {
        this.listView = listView;
        this.model = new MyModel();
    }

    public void showListMessage() {
        dataAdapter = new MyCustomAdapter(model.getDataArray());
        listView.setAdapter(dataAdapter);
    }

    public void onItemSelected(int position) {
        City city = model.getCityAt(position);
        viewInterface.showToast("Country: "+ city.getCityName());
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        this.viewInterface = null;
        this.model = null;
    }

    public class MyCustomAdapter extends BaseAdapter {
        private ArrayList<City> messageList;

        public MyCustomAdapter(ArrayList<City> messageList) {
            this.messageList = messageList;
        }

        @Override
        public int getCount() {
            return messageList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
            ((TextView) view.findViewById(R.id.text_name)).setText(messageList.get(position).getCityName() + "hello");
            return view;
        }
    }
}
