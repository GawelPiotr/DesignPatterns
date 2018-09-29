package main.java.pattern.factor;

public class FactoryComputer {
    public static Computer makeComputer(String type) {
        switch (type){
         case "H ":{
             return new HomeComputer("1TB", "32GB", "Xeon 8gen",
                     "1080TI","embeded").build();

         }
            case "P" :{
                PiComputer piPC = new PiComputer("8GB","512MB","1GHz");
                piPC.addDisplay("10Cal");
                piPC.addKeyboard("PL102");

                return piPC.build();
            }
            case "S" : {
                 new HomeComputer("10TB", "128", "Xenon 8gen x32",
                        "VGA","enable").build();
            }
        }
        return null;
    }
}
