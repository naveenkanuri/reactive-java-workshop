package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Exercise6 {


  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.unresponsiveFlux() and ReactiveSources.unresponsiveMono()

    // Get the value from the Mono into a String variable but give up after 5 seconds
    String value = ReactiveSources.unresponsiveMono()
      .timeout(Duration.ofSeconds(5))
      .doOnError(e -> System.out.println(e.getMessage()))
      .onErrorReturn("timeout mono")
      .block();
    System.out.println(value);

    // Get the value from unresponsiveFlux into a String list but give up after 5 seconds
    // Come back and do this when you've learnt about operators!
    List<String> list = ReactiveSources.unresponsiveFlux()
      .timeout(Duration.ofSeconds(5))
      .doOnError(e -> System.out.println(e.getMessage()))
      .onErrorReturn("timeout flux")
      .collectList().block();

    System.out.println(list);


    System.out.println("Press a key to end");
    System.in.read();
  }

}
