package com.java;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBookCsv {
    static AddressBookWriteToFile addressBookWriteToFile=new AddressBookWriteToFile();
    public static String ADDRESS_BOOK_CSV="addressBookFile.csv";
   // public static void writeDataToCSV(String firstName,String lastName,String city,String state,String zip, String mobile)
    public static void writeDataToCSV(List list)
    {

        // first create file object for file placed at location
        // specified by filepath
        File addressBookCsvFile = new File(ADDRESS_BOOK_CSV);

        try {
            // create FileWriter object with file as parameter
            FileWriter addressBookCsvWriter = new FileWriter(addressBookCsvFile);

            // create CSVWriter with  as separator
            CSVWriter writer = new CSVWriter(addressBookCsvWriter,',',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);

            // create a List which contains String array
            ArrayList<String[]> data = new ArrayList<String[]>();
            data.add(new String[]{list.toString()});
            writer.writeAll(data);

            // closing writer connection
            writer.close();

            // closing writer connection
           // writer.close();
        } catch (IOException e) {
            e.printStackTrace();        }
    }
}
