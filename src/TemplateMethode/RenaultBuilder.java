package TemplateMethode;

public class RenaultBuilder extends CarBuilder {
    @Override
    protected void buildSkeleton() {
        System.out.println("\nRenault => Building skeleton ...");
    }

    @Override
    protected void installEngine() {
        System.out.println("\nRenault => Installing Engine ...");

    }

    @Override
    protected void installDoor() {
        System.out.println("\nRenault => Installing Door ...");

    }

}
