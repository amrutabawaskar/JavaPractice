package edu.tables;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TablesCreator tc=new TablesCreator();
        List<String>tables=tc.createTable();
        CSVWriter csvWriter=new CSVWriter();
        csvWriter.writeCSV(tables);
        }

    }
