package _4Api_;

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
                        result = mult(value, 159);
                }
        }

        return result;
    }

    public static void println(String text) {
        System.out.println(text);
    }

}