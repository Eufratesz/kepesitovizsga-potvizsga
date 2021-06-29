package hu.nive.ujratervezes.forest;

public abstract class Tree {
    private String name;
    private int height;


    public Tree() {
        height = 0;
    }

    public Tree(int height) {
        this.height = height;
    }

    public abstract void irrigate();


    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
