package factories.abstraction;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door woodenDoor = woodenDoorFactory.makeDoor();
        DoorFittingExpert carpenter = woodenDoorFactory.makeFittingExpert();

        woodenDoor.getDescription();
        carpenter.getDescription();

        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door ironDoor = ironDoorFactory.makeDoor();
        DoorFittingExpert welder = ironDoorFactory.makeFittingExpert();

        ironDoor.getDescription();
        welder.getDescription();
    }
}
