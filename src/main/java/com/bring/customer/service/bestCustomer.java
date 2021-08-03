package com.bring.customer.service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.commons.lang3.math.Fraction;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class bestCustomer {
    static class findBestCustomer {
        public static void printDups(String str) {
            HashMap<Character, Integer> count = new HashMap<>();

                for (int i = 0; i < str.length(); i++) {
                    if (!count.containsKey(str.charAt(i)))
                        count.put(str.charAt(i), 1);
                    else
                        count.put(str.charAt(i),
                                count.get(str.charAt(i)) + 1);

                    for (int j = 0; j < str.length(); j++) {
                        if (!count.containsKey(str.charAt(j)))
                            count.put(str.charAt(j), 1);
                        else
                            count.put(str.charAt(j),
                                    count.get(str.charAt(j)) + 1);
                    }
                }

            for (int j = 0; j < str.length(); j++) {
                if (!count.containsKey(str.charAt(j)))
                    count.put(str.charAt(j), 1);
                else
                    count.put(str.charAt(j),
                            count.get(str.charAt(j)) + 1);
            }


                /*Print duplicates in sorted order*/
                for (Map.Entry mapElement : count.entrySet()) {
                    char key = (char) mapElement.getKey();
                    int value = ((int) mapElement.getValue());

                    if (value > 1)
                        System.out.println(key
                                + ", count = " + value);
                }


            }


        public static void main(String[] args) throws IOException, CsvException {

            String fileName = "c:\\test\\csv\\transaction_data_1.csv";
            try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
                List<String[]> r = reader.readAll();
                String str = fileName;
                class Customer {
                    public String customer_id;
                    public String transaction_amount;
                    public String transaction_date;

                    TreeMap<String,Customer> sortedCustomer= new TreeMap<String,Customer>();
                    //loop through arrays and put new Customers into Map

                    Collection<Customer> values = sortedCustomer.values();


                }
                printDups(str);
                r.forEach(x -> System.out.println(Arrays.toString(x)));
            }

        }


        }





}
