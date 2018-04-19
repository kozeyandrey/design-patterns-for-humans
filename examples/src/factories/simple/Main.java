package factories.simple;

public class Main {
    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);
        System.out.println(door.getHeight());
        System.out.println(door.getWidth());
    }
}
