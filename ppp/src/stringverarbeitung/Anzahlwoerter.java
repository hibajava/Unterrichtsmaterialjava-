package stringverarbeitung;

public class Anzahlwoerter
{
    public static void main(String[] args)
    {
        String text = "Ich lerne Java Programmiereung";

        String[] zerlegt = text.split("");

       // System.out.println(Arrays.toString(zerlegt));
        //Anzahl der wörter
        System.out.println(text.split("").length);

    }
}
