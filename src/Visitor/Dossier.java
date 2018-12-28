package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements Element {
    private List<Element> elements;

    public Dossier() {
        this.elements = new ArrayList<>();
    }

    public List<Element> getElements() {
        return elements;
    }

    public void addElement(Element e) {
        elements.add(e);
    }

    public void deleteElement(Element e) {
        elements.remove(e);
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
