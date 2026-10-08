package verzweigungen;

public class Test2
{
    //Globale Variable
static int x = 500;

    //Die Main- Methode
    public static void main(String[] args) {
        int alter = 18;
        //Die verzweigung
        if(alter>=18)
        {
            //Das sind lokale Veriablen
         int x  = 100;
            String ausgabe1 = " Du bist volljährig";
            System.out.println(ausgabe1);
            System.out.println(x);
        }
        else
        {
            //Lokale Variablen
            int y = 0;
            String ausgabe2 = "Du bist minderjährig";

            System.out.println(ausgabe2);
            System.out.println(y);
        }
           int  x = 60;

        //Die lokalen Variablen können hier nicht aufgerufen
        System.out.println(x);
    }
}
