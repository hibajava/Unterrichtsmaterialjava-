package tierarztpraxis;

public class Katze  extends Tier
{
    //------Attribute---
    String spitzname;

    //-----Methoden-----
    void schnurren() {
        System.out.println("PUURRRRR");
    }
        @Override
                void machGeraeusch()
        {
            System.out.println("Die Katze miaut");
        }
    }

