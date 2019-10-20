package BuilderDesign;

public class BuilderDesignMain {

    public static void main(String[] args) {

        ChairBuilder chairBuilder = new ChairBuilder();

        Chair chair = chairBuilder.setRollChair(true).setColour("black").build();

        System.out.println(chair);

    }

}
