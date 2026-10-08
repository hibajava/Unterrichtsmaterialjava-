public class Assoziationen{
    public static void main(String[] args){
        // 1) Auto -> Person
        // 1:n Beziehung
        // Von Auto auf den Besitzer (Person) schließen können
        // Aber nicht von der Person auf das Auto

        Person person1 = new Person(1, "Ivanov");
        Person person2 = new Person(2, "Hase");
        Person person3 = new Person(3, "Gonzales");
        System.out.println(Person.personListe);

        // Ein Auto ohne Besitzer
        Auto auto1 = new Auto(1, "Audi");
        Auto auto2 = new Auto(2, "BMW");
        Auto auto3 = new Auto(3, "Ford");
        System.out.println(Auto.autoListe);

        // Dem Auto wird ein Besitzer zugewiesen
        auto1.setBesitzer(person1);
        auto2.setBesitzer(person1);
        auto3.setBesitzer(person3);
        System.out.println(Auto.autoListe);

        // Weil wir eine 1:n Beziehung haben
        // Können wir nicht von einer Person auf ein Auto zugreifen
        // Wir können aber alle Autos abklappern, und gucken, ob "dieser Person"
        // (hier: person1) ein Auto gehört
        for(Auto a : Auto.autoListe){
            if(a.getBesitzer() == person1){
                System.out.println("Dieses Auto " + a + " gehört: " + a.getBesitzer());
            }
        }

        // Ab hier:
        // 2) Person <-> Auto
        // Eine m:n Beziehung
        // Wir können von Person zu Auto navigieren und von Auto zu Person

        person1.getDarfFahrenListe().add(auto1);
        person1.getDarfFahrenListe().add(auto2);
        person1.getDarfFahrenListe().add(auto3);

        System.out.println(person1 + " DARF FAHREN:");
        System.out.println(person1.getDarfFahrenListe());

        // Auto fahrerList, damit eine n:m Beziehung in der
        // Beziehung: darf Fahren existiert
        auto1.getFahrerListe().add(person1);
        auto1.getFahrerListe().add(person2);
        auto2.getFahrerListe().add(person1);
        auto3.getFahrerListe().add(person1);
        auto3.getFahrerListe().add(person3);

        System.out.println("FAHRER:");
        System.out.println(auto1.getFahrerListe());
        System.out.println(auto2.getFahrerListe());
        System.out.println(auto3.getFahrerListe());

    }
}
