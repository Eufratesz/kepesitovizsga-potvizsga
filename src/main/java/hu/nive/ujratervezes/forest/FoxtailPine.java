package hu.nive.ujratervezes.forest;

public abstract class FoxtailPine extends Tree {

    private Tree FoxtailPine;
    private int number;

    public FoxtailPine() {
    }



    @Override
    public void irrigate(int height) {
        height += 2;

    }

    public Tree getFoxtailPine() {
        return FoxtailPine;
    }

    public int getNumber() {
        return number;
    }
}
