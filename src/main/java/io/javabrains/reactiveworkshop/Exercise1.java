package io.javabrains.reactiveworkshop;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        StreamSources.intNumbersStream()
        .forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("---------------------------");
        StreamSources.intNumbersStream()
        .filter(i -> i < 5)
        .forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("---------------------------");
        StreamSources.intNumbersStream()
        .filter(i -> i > 5)
        .limit(3)
        .skip(1)
        .forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println("---------------------------");
        System.out.println( StreamSources.intNumbersStream().filter(i -> i > 5)
        .findFirst().orElse(-1));

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("---------------------------");
        StreamSources.userStream()
        .map(User::getFirstName)
        .forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("---------------------------");
        var ids = StreamSources.intNumbersStream().collect(Collectors.toSet());
        StreamSources.userStream()
        .filter(user -> ids.contains(user.getId()))
        .forEach(System.out::println);
    }

}
