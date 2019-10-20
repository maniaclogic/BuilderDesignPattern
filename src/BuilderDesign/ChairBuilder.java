package BuilderDesign;

public class ChairBuilder {

    private String name;
    private String colour;
    private int numOfLegs;
    private boolean rollChair;
    private boolean leansBack;

    public ChairBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ChairBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public ChairBuilder setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
        return this;
    }

    public ChairBuilder setRollChair(boolean rollChair) {
        this.rollChair = rollChair;
        return this;
    }

    public ChairBuilder setLeansBack(boolean leansBack) {
        this.leansBack = leansBack;
        return this;
    }

    public Chair build(){
        return new Chair(name, colour, numOfLegs, rollChair, leansBack);
    }
}
