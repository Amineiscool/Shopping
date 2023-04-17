package Shopping;

public class Employee extends Person {

    private double salary;
    private static final double DISCOUNT = 0.1;

    public Employee(String name, String address, double salary) {
        super(name, address, "1234567890");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDiscount() {
        return DISCOUNT;
    }

    public void printEmployeePriceAfterDiscount(Product product) {
        double discountPrice = product.getPrice() * (1 - getDiscount());
        System.out.println("Price after discount for employee: " + discountPrice);
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', address='" + getClass() + "', salary=" + salary + "}";
    }
}

