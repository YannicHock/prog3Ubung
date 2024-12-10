package de.sesqa.pr3.task6.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SimpleCalculatorTest {

  private final SimpleCalculator calculator = new SimpleCalculator();

  @Test
  @DisplayName("Addition of 2 and 3 should return 5")
  void add_givenTwoAndThree_shouldReturnFive() {
    // Arrange
    final int a = 2;
    final int b = 3;

    // Act
    final int result = calculator.add(a, b);

    // Assert
    assertEquals(5, result);
  }

  @Test
  @DisplayName("Subtraction of 3 from 5 should return 2")
  void subtract_givenFiveAndThree_shouldReturnTwo() {
    // Arrange
    final int a = 5;
    final int b = 3;

    // Act
    final int result = calculator.subtract(a, b);

    // Assert
    assertEquals(2, result);
  }

  @Test
  @DisplayName("Division of 6 by 2 should return 3")
  void divide_givenSixAndTwo_shouldReturnThree() {
    // Arrange
    final int a = 6;
    final int b = 2;

    // Act
    final int result = calculator.divide(a, b);

    // Assert
    assertEquals(3, result);
  }

  @Test
  @DisplayName("Division by zero should throw IllegalArgumentException")
  void divide_givenDivisorZero_shouldThrowIllegalArgumentException() {
    // Arrange
    final int a = 6;
    final int b = 0;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
  }
}
