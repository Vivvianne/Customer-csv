package com.bring.customer.service;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.bring.customer.service.bestCustomer.findBestCustomer.printDups;

public class findBestCustomer2 {

    static class findBestCustomer{
        findBestCustomer() throws IOException {
        }

        public class Customer {
            private final String customer_id;
            private final int transaction_amount;
            private final int transaction_date;

            public Customer(String customer_id, int transaction_amount, int transaction_date){
                super();
                this.customer_id = customer_id;
                this.transaction_amount = transaction_amount;
                this.transaction_date = transaction_date ;
            }

            public String getCustomer_id(){
                return customer_id;
            }

            public int getTransaction_amount() {
                return transaction_amount;
            }

            public int getTransaction_date(){
                return transaction_date;
            }

        }

        public static void main(String[] args) throws IOException, CsvException {

            String fileName = "c:\\test\\csv\\transaction_data_2.csv";
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
//        Pattern comma = Pattern.compile(",");
//        try (
//        Stream<String> stream = Files.lines(Paths.get("c:\\test\\csv\\transaction_data_1.csv"))) {
//            Map<Integer, Long> numberOfLessonsPassed = stream.skip(1).map(l -> comma.split(l))
//                    .map(s -> new Customer(String.valueOf(s[0]),(int[1]), String.valueOf(int[2])))
////                    .filter(s -> s.getGrade() >= 5)
//                    .stream.collect();
//            System.out.println(findBestCustomer2);
//        } catch (
//        IOException e) {
//            e.printStackTrace();
//        }

    }

}



