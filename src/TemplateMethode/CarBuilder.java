package TemplateMethode;

public abstract class CarBuilder {
    protected abstract void buildSkeleton();
    protected abstract void installEngine();
    protected abstract void installDoor();

    public void buildCar(){
        System.out.println("\nBuilding a Car ...");
        buildSkeleton();
        installEngine();
        installDoor();
    }

}
