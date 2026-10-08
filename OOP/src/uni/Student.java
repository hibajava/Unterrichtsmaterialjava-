package uni;

public class Student {

    String name;
     int marikelnummer;
     double note;


     public Student(String name, int matrikelnummer, double note)
     {
         this.name = name;
         this.marikelnummer = matrikelnummer;
         this.note = note;

     }

     public boolean hatBestanden()
     {
         if (note <= 4.0)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
     public void ausgabe()
     {
         System.out.println("Name: ");
     }
}
