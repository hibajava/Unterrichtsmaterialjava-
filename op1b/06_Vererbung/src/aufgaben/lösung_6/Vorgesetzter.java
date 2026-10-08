package aufgaben.lösung_6;

import java.text.NumberFormat;

class Vorgesetzter extends Mitarbeiter
{
    private double bonus;

    /**
     * @param b Bonus
     * @param g Grundgehalt
     */
    public Vorgesetzter(double b, double g)
    {
        super(g);
        bonus = b;
    }

    @Override
    protected double getGehalt()
    {
        return super.getGehalt() + bonus;
    }

    @Override
    public String toString()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(getGehalt());
        return String.format("Gehalt eines Vorgesetzten: %s", money);
    }
}
