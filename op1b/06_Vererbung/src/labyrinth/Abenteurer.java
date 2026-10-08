package labyrinth;

import java.util.ArrayList;

public class Abenteurer {
    private String name;
    private int[] position;
    private ArrayList<String> inventar;

    public Abenteurer(String name) {
        this.name = name;
        this.position = new int[]{0, 0}; // Startposition
        this.inventar = new ArrayList<>();
    }

    public int[] getPosition() {
        return position;
    }

    public void move(int bewegungAufXAchse, int bewegungAufYAchse) {
        position[0] += bewegungAufXAchse;
        position[1] += bewegungAufYAchse;
    }

    public void addToInventory(String item) {
        inventar.add(item);
    }

    public ArrayList<String> getInventar() {
        return inventar;
    }

    public String getName(){
        return this.name;
    }
}
