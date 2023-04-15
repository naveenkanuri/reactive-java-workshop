package io.javabrains.reactiveworkshop;

import java.io.IOException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        Flux<Integer> flux = ReactiveSources.intNumbersFlux();


        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
