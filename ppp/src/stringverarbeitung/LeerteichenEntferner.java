package stringverarbeitung;

public class LeerteichenEntferner
{
    public static void main(String[] args)
    {
        String satz = "Hallo welt Java";
        String neuerSatz = satz.replace(" ", " ");

        System.out.println(neuerSatz);

    }
}
