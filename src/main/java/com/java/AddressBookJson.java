package com.java;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AddressBookJson {
    public static String ADDRESS_BOOK_JSON ="addressBookFile.json";

    public static void writingDataAsJson(List list) throws IOException {
        //Creating a JSONObject
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Contact list",list);

        try {
            FileWriter file = new FileWriter(ADDRESS_BOOK_JSON);
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
