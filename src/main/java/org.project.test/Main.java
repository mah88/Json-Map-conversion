package org.project.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.lang.reflect.Type;
import java.text.MessageFormat;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by mah on 1/28/16.
 */
import java.lang.reflect.Type;
import java.util.*;
import com.google.gson.*;


public class Main  {


    public static void main(String[] args) throws FileNotFoundException {
        String y="string";
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader((new FileReader("/net/u/mah/openbaton/file.json")));
        Type mapOfMapsType = new TypeToken<Map<String, Map<String, Servicefunctionforwarder>>>() {}.getType();
        Map<String, Map<String, Servicefunctionforwarder>> map = gson.fromJson(br, mapOfMapsType);


        String name = map.get("service-function-forwarders").get("service-function-forwarder").getMessages().get(0);
        System.out.println(name);

    }

    public class Servicefunctionforwarder {

        private String name;

        private String servicenode;

        private List<String> messages = new ArrayList<String>();

        /**
         *
         * @return
         *     The name
         */
        public String getName() {
            return name;
        }

        /**
         *
         * @param name
         *     The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         *
         * @return
         *     The servicenode
         */
        public String getServicenode() {
            return servicenode;
        }

        /**
         *
         * @param servicenode
         *     The servicenode
         */
        public void setServicenode(String servicenode) {
            this.servicenode = servicenode;
        }

        /**
         *
         * @return
         *     The messages
         */
        public List<String> getMessages() {
            return messages;
        }

        /**
         *
         * @param messages
         *     The messages
         */
        public void setMessages(List<String> messages) {
            this.messages = messages;
        }
    }







    }
