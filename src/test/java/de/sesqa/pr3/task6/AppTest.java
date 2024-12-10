package de.sesqa.pr3.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import nl.altindag.console.ConsoleCaptor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** Unit test for simple App. */
public class AppTest {

  private static ConsoleCaptor consoleCaptor;

  @BeforeAll
  public static void setupConsoleCaptor() {
    consoleCaptor = new ConsoleCaptor();
  }

  @AfterEach
  public void clearOutput() {
    consoleCaptor.clearOutput();
  }

  @AfterAll
  public static void tearDown() {
    consoleCaptor.close();
  }

  @Test
  @DisplayName("Given names should be printed to the console")
  void shouldPrintGivenNames() {
    String[] args = {"Emilia", "Noah", "Mia", "Luca"};
    App.main(args);
    String output = String.join("", consoleCaptor.getStandardOutput());
    assertEquals("Hello Emilia, Noah, Mia, Luca!", output);
  }

  @Test
  @DisplayName("If no names are given, an IAE should be thrown")
  void shouldThrowIAEIfNoNamesAreGiven() {
    String[] args = {};
    assertThrows(IllegalArgumentException.class, () -> App.main(args));
  }
}
