package aufgaben.lösung_6;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

class Mitarbeiter
{
    private static final List<Mitarbeiter> mitarbeiterListe = new ArrayList<Mitarbeiter>();
    private double grundgehalt;

    /**
     * @param g Grundgehalt
     */
    public Mitarbeiter(double g)
    {
        grundgehalt = g;
        mitarbeiterListe.add(this);
    }

    public static String getGehälter(double umsatz)
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(umsatz);
        StringBuilder sb = new StringBuilder();
        double summe = 0;
        sb.append("Umsatz: ").append(money);
        sb.append("\n");
        sb.append("\nAuflistung aller Gehälter:\n");
        for (Mitarbeiter m : mitarbeiterListe)
        {
            double gehalt = m.getGehalt();
            sb.append(m.toString());
            sb.append("\n");
            summe += gehalt;
        }

        money = formatter.format(umsatz - summe);
        sb.append("\nGewinn: ").append(money);
        return sb.toString();
    }

    protected double getGehalt()
    {
        return grundgehalt;
    }

    @Override
    public String toString()
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(getGehalt());
        return String.format("Lohn eines Mitarbeiters: %s", money);
    }
}
