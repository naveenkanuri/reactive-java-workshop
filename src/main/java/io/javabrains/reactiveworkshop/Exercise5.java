package io.javabrains.reactiveworkshop;

import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

    // Subscribe to a flux using the error and completion hooks
    ReactiveSources.intNumberMono().subscribe(
      System.out::println,
      System.err::println,
      () -> System.out.println("Completed")
    );

    // Subscribe to a flux using an implementation of BaseSubscriber
    ReactiveSources.userMono().subscribe(new BaseSubscriber<User>() {
      @Override
      protected void hookOnNext(User user) {
        System.out.println(user);
      }

      @Override
      protected void hookOnComplete() {
        System.out.println("completed");
      }

      @Override
      protected void hookOnError(Throwable throwable) {
        System.err.println(throwable.getMessage());
      }
    });

    System.out.println("Press a key to end");
    System.in.read();
  }

}