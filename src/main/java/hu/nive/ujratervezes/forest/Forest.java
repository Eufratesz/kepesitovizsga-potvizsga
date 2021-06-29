package hu.nive.ujratervezes.forest;

import java.util.ArrayList;
import java.util.List;

public class Forest extends Tree {

    List<Tree> trees;

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    @Override
    public void irrigate() {

    }

    public List<Tree> getTrees() {
        return trees;
    }


    public void rain() {
        for (Tree tree : trees) {
            tree.irrigate();
        }
    }

    public void cutTrees(Lumberjack lumberjack) {
        lumberjack.canCut(tree);

    }

    public boolean isEmpty() {
        if (trees.size() == 0) {
            return true;
        }
        return false;
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Tree tree : trees) {
            String name = tree.getName();
            String result = "There is a  " + trees.size() + "tall" + tree.getName() + "in the forest.";
            status.add(result);
        }

        return status;
    }


}
