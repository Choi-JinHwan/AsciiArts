package ascii.art.xmas.tree;

public class StringBuilderPrinter {

    protected StringBuilder stringBuilder;

    public void print(String string) {
        stringBuilder.append(string);
    }

    public void println(String string) {
        stringBuilder.append(string + "\n");
    }

    public void nextLine() {
        stringBuilder.append("\n");
    }

}
