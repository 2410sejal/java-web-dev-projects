package technology;

public class Computer {

    private String make;
    private String model;
    private double hardDisc;
    private int memory;

    public Computer(String make, String model, double hardDisc, int memory) {
        this.make = make;
        this.model = model;
        this.hardDisc = hardDisc;
        this.memory = memory;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getHardDisc() {
        return hardDisc;
    }


    public int getMemory() {
        return memory;
    }

   public boolean startDevice (){
       System.out.println("starting device");
        return true;
   }

   public boolean shutDownDevice (){
       System.out.println("shutting down device");
        return true;
   }

}
