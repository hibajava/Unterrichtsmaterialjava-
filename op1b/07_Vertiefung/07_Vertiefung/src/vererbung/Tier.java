package vererbung;

public class Tier {
    protected int alter;

    public Tier(int alter){
        this.alter = alter;
        System.out.println("Das Tier ist... " +  alter + " Jahre alt!");
    }
}
