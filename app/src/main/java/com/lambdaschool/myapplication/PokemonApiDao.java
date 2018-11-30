package com.lambdaschool.myapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static com.lambdaschool.myapplication.NetworkAdapter.httpGetRequest;

public class PokemonApiDao {
    public static ArrayList<Pokemon> getAllPokemon(){
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        String nextUrl = "https://pokeapi.co/api/v2/pokemon/";
        while(nextUrl != null) {
            String page = NetworkAdapter.httpGetRequest(nextUrl);

        //process page of data
        try {
            JSONObject pageJson = new JSONObject(page);
            JSONArray resultsArray = pageJson.getJSONArray("result");

            for (int i = 0; i < resultsArray.length(); ++i) {
                try {
                    pokemons.add(new Pokemon(resultsArray.getJSONObject(i)));

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            }catch (JSONException e) {
                    e.printStackTrace();
            }

            try {
                nextUrl = new JSONObject(page).getString("next");
            }catch (JSONException e) {
                e.printStackTrace();
                nextUrl = null;
            }


        }
        return pokemons;
        }
}
