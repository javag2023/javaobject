public class Accountant extends Employee {
    public void accountHandling(){
        System.out.println("Accounting");
    }

    @Override
    public double calculateSalary() {
        return 10*11;
    }
}
