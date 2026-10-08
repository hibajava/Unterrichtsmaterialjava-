
package aufgaben.lösung_1;
/* Level 1
 * Basisklasse Robot
 *  - Attribute: name, isHostile
 * Subklasse Terminator, erbt von Robot
 *  - Attribute: targetName
 * Subklasse Transformer, erbt von Robot
 *  - Attribute: faction
 * Subklasse Android, erbt von Robot
 *  - Attribute: isHuman
 *
 * Erstellen Sie von jeder Klasse ein Objekt und weisen sie den Attributen über die Konstruktoren beliebige Werte zu.
 * Testen Sie die Attribute durch Konsolenausgaben
 */
public class Lösung_1
{
    public static void main(String[] args)
    {
        Terminator T800 = new Terminator("T-800", true, "Sarah Connor");

        Transformer OptimusPrime = new Transformer("Orion Pax", false, "Autobot");

        Android BicentennialMan = new Android("Andrew", false, true);

        System.out.printf("%s, isHostile: %s, Target: %s%n", T800.getName(), T800.isHostile(), T800.getTargetName());
        System.out.printf("%s, isHostile: %s, Faction: %s%n", OptimusPrime.getName(), OptimusPrime.isHostile(), OptimusPrime.getFaction());
        System.out.printf("%s, isHostile: %s, isHuman: %s%n", BicentennialMan.getName(), BicentennialMan.isHostile(), BicentennialMan.isHuman());

    }
}


