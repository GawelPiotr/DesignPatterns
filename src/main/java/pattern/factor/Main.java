package main.java.pattern.factor;

public class Main {

    public static void main(String[] args) {
        Computer homePC = FactoryComputer.makeComputer("H");
        Computer rasberryPi = FactoryComputer.makeComputer("P");
        Computer server = FactoryComputer.makeComputer("S");

        System.out.println("Configuration");
        System.out.println(homePC);
        System.out.println("Configuration");
        System.out.println(rasberryPi);
        System.out.println("Configuration");
        System.out.println(server);

    }
}
