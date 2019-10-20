package BuilderDesign;

public class Chair {

    private String name;
    private String colour;
    private int numOfLegs;
    private boolean rollChair;
    private boolean leansBack;

    public Chair(String name, String colour, int numOfLegs, boolean rollChair, boolean leansBack) {
        this.name = name;
        this.colour = colour;
        this.numOfLegs = numOfLegs;
        this.rollChair = rollChair;
        this.leansBack = leansBack;

    }

    @Override
    public String toString() {
        return "Chair{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", numOfLegs=" + numOfLegs +
                ", rollChair=" + rollChair +
                ", leansBack=" + leansBack +
                '}';
    }
}
