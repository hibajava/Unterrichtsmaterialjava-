package stringbuilder;

public class WortEinfuegen
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ich lerne Java");

        sb.insert(10,"gerade");

        System.out.println(sb);
    }
}
