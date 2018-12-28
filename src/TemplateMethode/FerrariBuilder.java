package TemplateMethode;

public class FerrariBuilder extends CarBuilder {
    @Override
    protected void buildSkeleton() {
        System.out.println("\nFerrari => Building skeleton ... ");
    }

    @Override
    protected void installEngine() {
        System.out.println("\nFerrari => Installing engine ...");
    }

    @Override
    protected void installDoor() {
        System.out.println("\nFerrari => Installing doors ...");
    }

}
