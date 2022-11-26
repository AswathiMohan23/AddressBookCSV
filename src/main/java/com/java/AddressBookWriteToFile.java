package com.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AddressBookWriteToFile {

    public static void writingData (List<ArrayList> list,String filePath){
        StringBuffer addressBookBuffer= new StringBuffer();
        list.forEach(contact->{
            addressBookBuffer.append(list);
        });
        try {
            Files.write(Paths.get(filePath),addressBookBuffer.toString().getBytes());
        }catch (IOException e){
            System.out.println("exception");
        }

    }

}
