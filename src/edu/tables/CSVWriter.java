package edu.tables;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class CSVWriter {
    public void writeCSV(List<String> tables) throws FileNotFoundException {
        File csvOutputFile = new File("CSV_FILE_NAME.csv");
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            tables.stream().forEach(pw::println);
        }
    }
}
