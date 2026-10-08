package aufgaben.lösung_1;

class Terminator extends Robot
{
    private String targetName;

    public String getTargetName()
    {
        return targetName;
    }

    public Terminator(String name, boolean isHostile, String targetName)
    {
        super(name, isHostile); // super(...) muss IMMER als Erstes in der Methode ausgeführt werden!
        this.targetName = targetName;
    }
}
