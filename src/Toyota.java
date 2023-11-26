public class Toyota extends Car {
    @Override
    public void drive() {
        System.out.println("toyota");
    }

    @Override
    public void applyBreak() {
        System.out.println("break");
    }
}