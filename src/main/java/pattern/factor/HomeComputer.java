package main.java.pattern.factor;

public class HomeComputer {

    private Computer computer;

    public HomeComputer(String HDD, String RAM, String CPU, String grapthic, String sound){
        computer = new Computer(HDD, RAM, CPU);
        computer.setGraphicCard(grapthic);
        computer.setSoundCard(sound);

    }

    public Computer build(){
        return computer;
    }
}
