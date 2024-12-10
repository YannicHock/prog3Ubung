package de.sesqa.pr3.task6;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Joiner;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    checkArgument(args.length > 0, "Please provide some names!");

    final Joiner joiner = Joiner.on(", ").skipNulls();
    final String greeting = "Hello " + joiner.join(args) + "!";

    System.out.println(greeting);
  }
}
