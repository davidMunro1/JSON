/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author davidmunro
 */
public class JSONDecode {

    private final JSONArray array;

    public JSONDecode(JSONArray obj) {
        array = obj;
    }

    public void test() {

        Iterator it = array.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
