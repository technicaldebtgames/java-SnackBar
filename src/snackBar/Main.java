package snackBar;

public class Main {

    private static void run()
    {

        System.out.println("snackBar project is running. -->");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        outputCustomerBuysSnack(c1, s4, 3);
        outputCustomerBuysSnack(c1, s3, 1);
        outputCustomerBuysSnack(c2, s4, 2);
        outputCustomerFindsCash(c1, 10);
        outputCustomerBuysSnack(c1, s2, 1);
        outputAddMoreSnacks(s3, 12);
        outputCustomerBuysSnack(c2, s3, 3);

        System.out.println("<-- snackBar project has finished running.");

    }

    private static void outputCustomerBuysSnack(Customer customer, Snack snack, int quantity)
    {

        customer.buySnacks(snack.getTotalCost(quantity));
        snack.buySnack(quantity);

        System.out.println("");
        System.out.println(customer.getName() + " buys " + quantity + " of " + snack.getName());
        System.out.println(customer.getName() + "'s cash on hand is $" + customer.getCashOnHand());
        System.out.println("Quantity of " + snack.getName() + " is " + snack.getQuantity());
        System.out.println("");

    }

    private static void outputCustomerFindsCash(Customer customer, double cashFound)
    {

        customer.addCashOnHand(cashFound);

        System.out.println("");
        System.out.println(customer.getName() + " finds $" + cashFound);
        System.out.println(customer.getName() + " has $" + customer.getCashOnHand());
        System.out.println("");

    }

    private static void outputAddMoreSnacks(Snack snack, int quantity)
    {

        snack.addQuantity(quantity);

        System.out.println("");
        System.out.println("Adding " + quantity + " more of " + snack.getName());
        System.out.println("Quantity of " + snack.getName() + " is " + snack.getQuantity());
        System.out.println("");

    }

    public static void main(String[] args)
    {

        run();

    }
    
}