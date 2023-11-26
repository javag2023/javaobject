public class Director extends Employee implements Retireable, Accountable {


    @Override
    public double calculatePension() {
        return 0;
    }

    @Override
    public void heldResponsible() {
        System.out.println("Held responsible");
    }
}
