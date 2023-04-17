package Shopping;

public class Manager extends Employee {
    private static final double DISCOUNT = 0.05;

    public Manager(String name, String address, double salary) {
        super(name, address, salary);
    }

    public double getDiscount() {
        return DISCOUNT + super.getDiscount();
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', address='" + getClass() + "', salary=" + getSalary() + "}";

}

}
