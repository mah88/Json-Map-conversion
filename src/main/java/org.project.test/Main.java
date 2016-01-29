package org.project.test;


import java.io.FileNotFoundException;

import java.lang.reflect.Type;
import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.reflect.TypeToken;
/**
 * Created by mah on 1/28/16.
 */
import java.util.*;
import com.google.gson.*;
import org.project.test.SFFJSON.*;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        //
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader((new FileReader("/net/u/mah/openbaton/file.json")));
        Type mapOfMapsType = new TypeToken<Map<String, ServiceFunctionForwarders>>() {}.getType();


        Map<String, ServiceFunctionForwarders> map = gson.fromJson(br, mapOfMapsType);

        String name = map.get("service-function-forwarders").getServiceFunctionForwarder().get(0).getSffDataPlaneLocator().get(1).getName();

        System.out.println(name);
    }


}
