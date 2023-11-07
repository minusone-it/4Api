import apicalc.ApiCalc;

public class Main extends ApiCalc {
    public static void main(String[] args) {
        double a = add(2, 2);
        double b = valuesconveritor("Euro", "Yen", 0.62);
        System.out.println(b);
    }
}
