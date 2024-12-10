package de.sesqa.pr3.task6.calculator;

public class SimpleCalculator {
  public int add(int a, int b) {
    return a + b; // Fix: return `a + b` instead of `a - b`
  }

  public int subtract(int a, int b) {
    return a - b; // Fix: return `a - b` instead of `a + b`
  }

  public int divide(int a, int b) {
    if (b == 0) { // Fix: if `b == 0` instead of `b > 100`
      throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    return a / b; // Fix: return `a / b` instead of `a * b`
  }
}
