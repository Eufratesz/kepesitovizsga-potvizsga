package hu.nive.ujratervezes.forest;

public abstract class WhitebarkPine extends Tree {

    private Tree whitebarkPine;
    private int number;


    public WhitebarkPine() {
    }

    public WhitebarkPine(Tree whitebarkPine, int number) {
        this.whitebarkPine = whitebarkPine;
        this.number = number;
    }

    public WhitebarkPine(int height, Tree whitebarkPine, int number) {
        super(height);
        this.whitebarkPine = whitebarkPine;
        this.number = number;
    }

    public WhitebarkPine(int height, WhitebarkPine whitebarkPine) {
        super(height);
        this.whitebarkPine = whitebarkPine;

    }

    @Override
    public void irrigate(int height) {
        height += 2;
    }

    public Tree getWhitebarkPine() {
        return whitebarkPine;
    }

    public int getNumber() {
        return number;
    }
}
