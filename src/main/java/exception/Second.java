package exception;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Second {
    public static final String ANSI_RED = "\u001B[31m";


    public static void main(String[] args) {
        try {
            createTwoBigDecimal();
        } catch (ArithmeticException exp) {
            System.out.println(ANSI_RED + "Нет точного десятичного результата");
        }
        try {
            getFromEmpyCollection();
        } catch (IndexOutOfBoundsException exp) {
            System.out.println(ANSI_RED + "Выход за пределы!");
        }
        try {
            nullPointerExceptionExample();
        } catch (NullPointerException exp) {
            System.out.println(ANSI_RED + "Значение равно null! Это недопустимо!");
        }
    }


    public static void getFromEmpyCollection() {
        List<String> list = new ArrayList<>();
        System.out.println(list.get(0)); // вызовет NoSuchElementException
    }


    public static void createTwoBigDecimal(){
        // https://www.javatpoint.com/arithmetic-exception-in-java - виды арифметических исключений
        BigDecimal a1 = new BigDecimal(11);
        BigDecimal a2 = new BigDecimal(17);
        a1 = a1.divide(a2);
        System.out.println(a1.toString());
    }


    public static void nullPointerExceptionExample() {
        String str = null;
        int length = str.length(); // вызовет NullPointerException
    }

}

