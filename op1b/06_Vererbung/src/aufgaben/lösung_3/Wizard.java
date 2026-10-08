package aufgaben.lösung_3;

class Wizard extends Spellcaster
{
    @Override
    public void castSpell()
    {
        super.castSpell();
        System.out.println("Für meine Zauberkraft musste ich hart arbeiten.");
    }
}
