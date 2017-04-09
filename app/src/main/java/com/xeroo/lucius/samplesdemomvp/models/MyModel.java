package com.xeroo.lucius.samplesdemomvp.models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

/**
 * Created by lucius on 09/04/2017.
 */

public class MyModel {
    private Gson gson;
    private String jsonData = "[{" +
            "  \"country\": \"Indonesia\"," +
            "  \"city_name\": \"Karangjaladri\"" +
            "}, {" +
            "  \"country\": \"Yemen\"," +
            "  \"city_name\": \"Ḩabīl al Jabr\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Yangdu\"" +
            "}, {" +
            "  \"country\": \"Brazil\"," +
            "  \"city_name\": \"Mata de São João\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Chujiang\"" +
            "}, {" +
            "  \"country\": \"Sweden\"," +
            "  \"city_name\": \"Gislaved\"" +
            "}, {" +
            "  \"country\": \"Czech Republic\"," +
            "  \"city_name\": \"Valašská Bystřice\"" +
            "}, {" +
            "  \"country\": \"Colombia\"," +
            "  \"city_name\": \"El Cocuy\"" +
            "}, {" +
            "  \"country\": \"Indonesia\"," +
            "  \"city_name\": \"Sruki\"" +
            "}, {" +
            "  \"country\": \"Indonesia\"," +
            "  \"city_name\": \"Oeba\"" +
            "}, {" +
            "  \"country\": \"Philippines\"," +
            "  \"city_name\": \"Padre Burgos\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Yatunpu\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Xidajie\"" +
            "}, {" +
            "  \"country\": \"Philippines\"," +
            "  \"city_name\": \"Dicamay\"" +
            "}, {" +
            "  \"country\": \"Portugal\"," +
            "  \"city_name\": \"Torres Vedras\"" +
            "}, {" +
            "  \"country\": \"Russia\"," +
            "  \"city_name\": \"Isheyevka\"" +
            "}, {" +
            "  \"country\": \"Philippines\"," +
            "  \"city_name\": \"Amadeo\"" +
            "}, {" +
            "  \"country\": \"Israel\"," +
            "  \"city_name\": \"Jīsh\"" +
            "}, {" +
            "  \"country\": \"Liberia\"," +
            "  \"city_name\": \"Ganta\"" +
            "}, {" +
            "  \"country\": \"Philippines\"," +
            "  \"city_name\": \"Lumbang\"" +
            "}, {" +
            "  \"country\": \"Czech Republic\"," +
            "  \"city_name\": \"Brloh\"" +
            "}, {" +
            "  \"country\": \"Thailand\"," +
            "  \"city_name\": \"Chai Nat\"" +
            "}, {" +
            "  \"country\": \"France\"," +
            "  \"city_name\": \"Metz\"" +
            "}, {" +
            "  \"country\": \"Greece\"," +
            "  \"city_name\": \"Gouménissa\"" +
            "}, {" +
            "  \"country\": \"Armenia\"," +
            "  \"city_name\": \"Artashat\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Tunguang\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Jiahu\"" +
            "}, {" +
            "  \"country\": \"Japan\"," +
            "  \"city_name\": \"Narutō\"" +
            "}, {" +
            "  \"country\": \"Brazil\"," +
            "  \"city_name\": \"Brasília de Minas\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Donglai\"" +
            "}, {" +
            "  \"country\": \"France\"," +
            "  \"city_name\": \"Sedan\"" +
            "}, {" +
            "  \"country\": \"France\"," +
            "  \"city_name\": \"Toulouse\"" +
            "}, {" +
            "  \"country\": \"China\"," +
            "  \"city_name\": \"Changning\"" +
            "}, {" +
            "  \"country\": \"Portugal\"," +
            "  \"city_name\": \"Horta\"" +
            "}, {" +
            "  \"country\": \"Argentina\"," +
            "  \"city_name\": \"Villa Ángela\"" +
            "}, {" +
            "  \"country\": \"Indonesia\"," +
            "  \"city_name\": \"Ciusul\"" +
            "}, {" +
            "  \"country\": \"Mali\"," +
            "  \"city_name\": \"Douentza\"" +
            "}, {" +
            "  \"country\": \"United States\"," +
            "  \"city_name\": \"Denver\"" +
            "}, {" +
            "  \"country\": \"Chile\"," +
            "  \"city_name\": \"Coihaique\"" +
            "}, {" +
            "  \"country\": \"Finland\"," +
            "  \"city_name\": \"Tampere\"" +
            "}, {" +
            "  \"country\": \"Indonesia\"," +
            "  \"city_name\": \"Binangun\"" +
            "}, {" +
            "  \"country\": \"Portugal\"," +
            "  \"city_name\": \"A-da-Gorda\"" +
            "}, {" +
            "  \"country\": \"Syria\"," +
            "  \"city_name\": \"Badāmā\"" +
            "}, {" +
            "  \"country\": \"Afghanistan\"," +
            "  \"city_name\": \"Paghmān\"" +
            "}, {" +
            "  \"country\": \"Brazil\"," +
            "  \"city_name\": \"Abaetetuba\"" +
            "}, {" +
            "  \"country\": \"Sweden\"," +
            "  \"city_name\": \"Kista\"" +
            "}, {" +
            "  \"country\": \"Philippines\"," +
            "  \"city_name\": \"Sulangan\"" +
            "}, {" +
            "  \"country\": \"Philippines\"," +
            "  \"city_name\": \"Malalag\"" +
            "}, {" +
            "  \"country\": \"Bulgaria\"," +
            "  \"city_name\": \"Levski\"" +
            "}, {" +
            "  \"country\": \"Brazil\"," +
            "  \"city_name\": \"Carolina\"" +
            "}]";


    public MyModel() {
        gson = new Gson();
    }

    public ArrayList<City> getDataArray() {
        return gson.fromJson(jsonData, new TypeToken<ArrayList<City>>() {}.getType());
    }

    public City getCityAt(int position) {
        ArrayList<City> temp = gson.fromJson(jsonData, new TypeToken<ArrayList<City>>() {}.getType());
        return temp.get(position);
    }
}
