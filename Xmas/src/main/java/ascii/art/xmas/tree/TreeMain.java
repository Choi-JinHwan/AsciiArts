package ascii.art.xmas.tree;

public class TreeMain {

    public static void main(String[] args) throws InterruptedException {
        LightDecorationTreeMaker treeMaker = new SimpleLightDecorationTreeMaker();
        TreePrinter treePrinter = new BlinkTreePrinter(treeMaker);

        treePrinter.print();
    }
}
