package verzweigungen;

public class Temperatur
{
    public static void main(String[] args)
    {
        int temperatur = 30;

        if(temperatur <= 0)
        {
            System.out.println("Frost");
        }
        else if (temperatur <= 15)
        {
            System.out.println("kalt");
        }
        else if(temperatur <= 25)
        {
            System.out.println("mild");
        }
        else
        {
            System.out.println("warm");
        }
    }
}
