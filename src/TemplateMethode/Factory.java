package TemplateMethode;

public class Factory {
    public static void main(String[] args) {
        CarBuilder ferrari = new FerrariBuilder();
        CarBuilder renault = new RenaultBuilder();

        ferrari.buildCar();

        renault.buildCar();

    }
}
