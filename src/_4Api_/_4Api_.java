package _4Api_;

import java.util.Scanner;

public class _4Api_ {

    static double result;

    public static long add(long num1, long num2) {
        return num1+num2;
    }

    public static int add(int num1, int num2) {
        return num1+num2;
    }
    public static float add(float num1, float num2) {
        return num1+num2;
    }

    public static double add(double num1, double num2) {
        return num1+num2;
    }

    public static long sub(long num1, long num2) {
        return num1-num2;
    }

    public static int sub(int num1, int num2) {
        return num1-num2;
    }

    public static float sub(float num1, float num2) {
        return num1-num2;
    }

    public static double sub(double num1, double num2) {
        return num1-num2;
    }

    public static long mult(long num1, long num2) {
        return num1*num2;
    }

    public static int mult(int num1, int num2) {
        return num1*num2;
    }

    public static float mult(float num1, float num2) {
        return num1*num2;
    }

    public static double mult(double num1, double num2) {
        return num1*num2;
    }


    public static double valuesconveritor(String misure1, String misure2, double value) {
        switch(misure1) {
            case "Euro":
                switch(misure2) {
                    case "Yen":
                        result = mult(value, 159);
                        break;
                }
            case "Yen":
                switch(misure2) {
                    case "Euro":
                        result = mult(value, 0.0062893081761006) + 0.0000000000000047;
                }
        }

        return result;
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void println() {
        System.out.println();
    }

    static boolean resultcorrect;
    public static boolean opChecker(String operationType, int num1, int num2, int result) {
        int resulta;
        if (operationType.equalsIgnoreCase("Add") || operationType.equalsIgnoreCase("Addiction")) {
            resulta = num1 + num2;
            resultcorrect = resulta == result;
        } else if (operationType.equalsIgnoreCase("Sub") || operationType.equalsIgnoreCase("Subtraction")) {
            resulta = num1 - num2;
            resultcorrect = resulta == result;
        } else if (operationType.equalsIgnoreCase("Div") || operationType.equalsIgnoreCase("Divison")) {
            resulta = num1 / num2;
            resultcorrect = resulta == result;
        } else if (operationType.equalsIgnoreCase("Mult") || operationType.equalsIgnoreCase("Multiplication")) {
            resulta = num1 * num2;
            resultcorrect = resulta == result;
        }
        return resultcorrect;
    }

    public static boolean opChecker(int operationType, int num1, int num2, int result) {
        int resulta;
        if (operationType == 1) {
            resulta = num1 + num2;
            resultcorrect = resulta == result;
        } else if (operationType == 2) {
            resulta = num1 - num2;
            resultcorrect = resulta == result;
        } else if (operationType == 3) {
            resulta = num1 / num2;
            resultcorrect = resulta == result;
        } else if (operationType == 4) {
            resulta = num1 * num2;
            resultcorrect = resulta == result;
        }
        return resultcorrect;
    }

    static Scanner s = new Scanner(System.in);

    public static String readNextLine() {
        return s.nextLine();
    }

    public static int readNextInt() {
        return s.nextInt();
    }

    public static short readNextShort() {
        return s.nextShort();
    }

    public static double readNextDouble() {
        return s.nextDouble();
    }

    public static float readNextFloat() {
        return s.nextFloat();
    }

}