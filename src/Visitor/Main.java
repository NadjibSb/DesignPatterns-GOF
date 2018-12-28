package Visitor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dossier root = new Dossier();
        Dossier d1 = new Dossier();
        Dossier d2 = new Dossier();
        Dossier d3 = new Dossier();
        Fichier f1 = new Fichier(1);
        Fichier f2 = new Fichier(2);
        Fichier f3 = new Fichier(3);

        d1.addElement(f1);
        d2.addElement(f2);
        d3.addElement(f3);
        root.addElement(d1);
        root.addElement(d2);
        root.addElement(d3);

        System.out.println("\nnb de element :"+root.accept(new CalculeNbVisitor()));
        System.out.println("\nTaille du dossier Root :"+root.accept(new CalculeTailleVisitor()));


    }
}
