package aufgaben.lösung_6;

import java.text.NumberFormat;

class Vorstand extends Vorgesetzter
{
    private double prozentsatz;

    /**
     * @param p Aufschlag in Prozent
     * @param b Bonus
     * @param g Grundgehalt
     */
    public Vorstand(double p, double b, double g)
    {
        super(b, g);
        prozentsatz = p;
    }

    @Override
    protected double getGehalt()
    {
        return super.getGehalt() * (1 + (prozentsatz / 100));
    }

    @Override
    public String toString()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(getGehalt());
        return String.format("Honorar eines Vorstandsvorsitzenden: %s", money);
    }
}
