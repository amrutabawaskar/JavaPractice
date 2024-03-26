package edu.tables;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TablesCreator {
    List<String> tables = new ArrayList<>();

    public List<String> createTable() {
        for (int i = 1; i <= 10; i++) {
            var table = new ArrayList<String>();
            for (int j = 1; j <= 30; j++) {
                table.add("\"" + j + " X " + i + " = " + (i * j) + "\"");
            }
            tables.add(convertToCSV(table));
        }

        return tables;
    }

     String convertToCSV(List<String> data) {
        return data.stream()
                .collect(Collectors.joining(","));
    }
}
