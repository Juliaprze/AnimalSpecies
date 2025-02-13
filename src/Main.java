public class Main {
    public static void main(String[] args) {
    Species hawk = new Species("Hawk", "Bird", 80, "A bird of prey.");
    Species lion = new Species("Lion", "Mammal", 38, "King of the jungle.");
    Species shark = new Species("Shark", "Fish", 82, "A large predatory fish.");

    hawk.printData();
    lion.printData();
    shark.printData();

        System.out.println("\nCloned species:");
        Species clonedShark = shark.cloneObject();
        clonedShark.printData();
    }
}