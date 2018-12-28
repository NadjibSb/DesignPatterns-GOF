package Visitor;

import java.util.List;

public class CalculeTailleVisitor implements Visitor {

    @Override
    public int visit(Fichier F) {
        return F.getSize();
    }

    @Override
    public int visit(Dossier D) {
        int size = 0;
        List<Element> elements = D.getElements();
        for (Element e : elements) {
            size += e.accept(this);
        }
        return size;
    }
}
