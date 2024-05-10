package harnessio;

public class Calculator {  
    public int add(int a, int b) {  
        return a + b;  
    }  
  
    public int subtract(int a, int b) {  
        return a - b;  
    }  
  
    public int multiply(int a, int b) {  
        return a * b;  
    }  
  
    public int divide(int a, int b) {  
        if (b == 0) {  
            throw new IllegalArgumentException("Cannot divide by zero");  
        }  
        return a / b;  
    }  
    
    public static void main(String[] args) {  
        Calculator calculator = new Calculator();  
  
        int result = calculator.add(5, 3);  
        System.out.println("Addition: " + result);  
  
        result = calculator.subtract(10, 4);  
        System.out.println("Subtraction: " + result);  
  
        result = calculator.multiply(6, 2);  
        System.out.println("Multiplication: " + result);  
  
        result = calculator.divide(10, 2);  
        System.out.println("Division: " + result);  
    }  
}  