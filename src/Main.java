import _4Api_._4Api_;

public class Main extends _4Api_
{
    public static void main(String[] args)
    {
        println("Cosa vuoi calcolare?");
        int a = readNextInt();
        String b = readNext();
        int c = readNextInt();
        if (b.equalsIgnoreCase("x") || b.equalsIgnoreCase("*"))
        {
            println("Il risultato della tua moltiplicazione e': " + mult(a, c));
        }
        else if (b.equalsIgnoreCase("/") || b.equalsIgnoreCase(":"))
        {
            println("Il risultato della tua divisione e' " + div(a, c));
        }
        else if (b.equalsIgnoreCase("+"))
        {
            println("Il risultato della tua addizione e' " + add(a, c));
        }
        else if (b.equalsIgnoreCase("-"))
        {
            println("Il risultato della tua sottrazione e' " + sub(a, c));
        }
    }

}
