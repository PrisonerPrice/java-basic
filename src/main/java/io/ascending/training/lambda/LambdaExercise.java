package io.ascending.training.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExercise {

    public static void main(String[] args) {

        // 1. map -> list, pick key which entries are duplicate in value
        Map<String, Integer> map = new HashMap();
        System.out.println("<<<<<< Question One <<<<<<");
        map.put("Ryo", 399);
        map.put("Han", 29);
        map.put("Hangbo", 28);
        map.put("Rui", 29);
        List<String> result = map.entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue()))     // Map<Integer, List<Entry<K, V>>>, unfiltered
                .values().stream().filter(e -> e.size() > 1).collect(Collectors.toList())                   // List<List<Entry<K, V>>>, filtered
                .stream().flatMap(e -> e.stream()).map(e -> e.getKey()).collect(Collectors.toList());       // List<String>, result
        System.out.println("method 1: ");
        result.forEach(e -> System.out.println(e));

        List<String> result2 = map.entrySet()
                .stream().filter(e -> Collections.frequency(map.values(), e.getValue()) > 1)
                .map(e -> e.getKey()).collect(Collectors.toList());
        System.out.println("method 2: ");
        result2.forEach(e -> System.out.println(e));

        System.out.println("method 3: ");
        // TODO 1: Ryo's counting method
        //result3.forEach(e -> System.out.println(e));


        // 2. list -> map, K = name, V = index in list
        System.out.println("<<<<<< Question Two <<<<<<");
        List<String> names = new ArrayList<>();
        names.add("Ryo");
        names.add("Han");
        names.add("Hangbo");
        names.add("Rui");
        Map<String,Integer> nameMap = names.stream().collect(Collectors.toMap(e -> e, e -> names.indexOf(e)));
        nameMap.forEach((s, integer) -> System.out.println(s + ": " + integer));
    }
}
