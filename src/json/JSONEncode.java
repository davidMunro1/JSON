/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author davidmunro
 */
public class JSONEncode {

    public JSONEncode() {

    }

    
    /**
     * 
     * A method to return a JSON array after initialisation 
     * @return 
     */
    public static JSONArray encode() {
        JSONObject liverpool = new JSONObject();
        liverpool.put("Club", "Liverpool");
        liverpool.put("Manager", "Brendan Rodgers");

        JSONArray liverpoolDetails = new JSONArray();
        liverpoolDetails.add("Stadium size : 44500");
        liverpoolDetails.add("Founded : 1890");
        liverpoolDetails.add("Club colour : Red");
        liverpool.put("Liverpool details", liverpoolDetails);

        JSONObject norwich = new JSONObject();
        norwich.put("Club", "Norwich");
        norwich.put("Manager", "Alex O'neil");

        JSONArray norwichDetails = new JSONArray();
        norwichDetails.add("Stadium size : 28500");
        norwichDetails.add("Founded : 1905");
        norwichDetails.add("Club colour : Yellow & Green");
        norwich.put("Norwich Details", norwichDetails);

        JSONArray plCLubs = new JSONArray();
        plCLubs.add(liverpool);
        plCLubs.add(norwich);

        JSONObject real = new JSONObject();
        real.put("Club", "Real Madrid");
        real.put("Manager", "Rafa Benitez");

        JSONArray realMadridDetails = new JSONArray();
        realMadridDetails.add("Stadium size : 82500");
        realMadridDetails.add("Founded : 1901");
        realMadridDetails.add("Club colour : White");

        real.put("Real Madrid Details", realMadridDetails);

        JSONArray laLigaClubs = new JSONArray();
        laLigaClubs.add(real);

        JSONArray leagues = new JSONArray();
        leagues.add(laLigaClubs);
        leagues.add(plCLubs);

        return leagues;
    }

}
