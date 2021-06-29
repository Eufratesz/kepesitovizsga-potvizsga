package hu.nive.ujratervezes.forest;

public class Lumberjack {

    private Lumberjack lumberjack;

    public Lumberjack() {
    }

    public boolean canCut(Tree tree){
        if (tree.getHeight() > 4){
            return true;
        }

    }
}
