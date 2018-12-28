package Visitor;

import java.util.List;

public class CalculeNbVisitor implements Visitor {

    public CalculeNbVisitor() {
    }

    @Override
    public int visit(Fichier F) {
        return 1;
    }

    @Override
    public int visit(Dossier D) {
        int nb = 0;
        List<Element> elements = D.getElements();
        nb += 1;
        for (Element e : elements) {
            nb += e.accept(new CalculeNbVisitor());
        }
        return nb;
    }
}
