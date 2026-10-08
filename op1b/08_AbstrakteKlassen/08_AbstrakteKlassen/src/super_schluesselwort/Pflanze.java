package super_schluesselwort;

class Pflanze {
    protected String woWachseIch = "überall";

    public Pflanze(String woWachseIch) {
        this.woWachseIch = woWachseIch;
        this.woWachseIch();
    }

    protected void woWachseIch() {
        System.out.println(woWachseIch);
    }
}