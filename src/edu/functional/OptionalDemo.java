package edu.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Optional<String>> elements = new ArrayList<>();
        Stream.of("1","2","3").forEach(i->elements.add(Optional.of(i)));
        elements.add(getMyString());
        // print all non empty elements in list
        elements.stream().filter(Optional::isPresent).map(Optional::get).forEach(System.out::println);
    }

    /**
     * This method returns empty optional
     * @return
     */
    static Optional<String> getMyString(){
        return Optional.empty();
    }
}
