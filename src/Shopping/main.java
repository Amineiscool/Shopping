package Shopping;

public class main {

    public static void main(String[] args) {

        Product shirt = new Product("Shirt", 19.99, Size.MEDIUM);
        Product pants = new Product("Pants", 29.99, Size.LARGE);
        Product shoes = new Product("Shoes", 49.99, Size.MEDIUM);

       
        Manager manager = new Manager("mohammed", "123 Main St", 50000);
        Person Person = new Person("amine", "456 Oak Ave", "1234567890");
        Business business = new Business("789 Maple Rd", pants);

        printPersonName(manager);
        printPersonName(Person);


        System.out.println(business);





        double total = calculateTotal(shirt, pants, shoes);
        System.out.println("Total price of products: $" + total);


        printEveryDiscountAvailableForAProduct(shirt);
        printEveryDiscountAvailableForAProduct(pants);
        printEveryDiscountAvailableForAProduct(shoes);
    }



    public static void printPersonName(Person person) {
        System.out.println(person.getName());
    }

    public static double calculateTotal(Product... products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public static void printEveryDiscountAvailableForAProduct(Product product) {
        System.out.println(product.getDescription() + " discounts:");
        if (product.hasEmployeeDiscount()) {
            System.out.println("- Employee discount");
        }
        if (product.hasManagerDiscount()) {
            System.out.println("- Manager discount");
        }
        if (product.hasStudentDiscount()) {
            System.out.println("- Student discount");
        }
        if (product.hasBusinessDiscount()) {
            System.out.println("- Business discount");
        }
    }

}
