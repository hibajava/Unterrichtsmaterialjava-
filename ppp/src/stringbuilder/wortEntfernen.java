package stringbuilder;

public class wortEntfernen
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello world");

        sb.delete(sb.indexOf("world"),sb.length() );

        System.out.println(sb);

    }
}
