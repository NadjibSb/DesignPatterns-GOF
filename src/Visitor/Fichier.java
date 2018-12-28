package Visitor;

public class Fichier implements Element {

    private int size;

    public Fichier(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
