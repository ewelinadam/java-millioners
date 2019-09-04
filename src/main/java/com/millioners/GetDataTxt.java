package com.millioners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// zaczytywacz danych z pliku
public class GetDataTxt {
    static List<String> list = new ArrayList<>();
    static final String PATH = "files/a.txt";

    public List<String> createListFromTxtData(String path) throws IOException {


        FileReader file = new FileReader(path);
        BufferedReader read = new BufferedReader(file);
        String line = read.readLine();
        while (line != null) {
            list.add(line);
            line = read.readLine();
        }
        return list;
    }

}
