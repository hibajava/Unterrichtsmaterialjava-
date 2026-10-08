package assoziation;

import java.util.ArrayList;
import java.util.List;

public class Tierpfleger {
    private int mitarbeiterId;
    private String name;
    private ArrayList<Tier> kuemmertSichUm = new ArrayList<Tier>();

    public Tierpfleger(int id, String name){
        this.name = name;
        this.mitarbeiterId = id;
    }

    public void tierZurPflegeHinzufuegen(Tier tier){
        this.kuemmertSichUm.add(tier);
    }

}
