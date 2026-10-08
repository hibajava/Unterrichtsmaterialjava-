package super_schluesselwort;

class Baum extends Pflanze {
    public Baum(String woWachseIch) {
        super(woWachseIch);
        super.woWachseIch = woWachseIch;
    }

    @Override
    protected void woWachseIch() {
        super.woWachseIch();
        System.out.println(super.woWachseIch);
    }
}