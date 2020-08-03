package snackBar;

public class Snack 
{

    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {

        maxId++;

        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;

    }

    // getters

    public int getId()
    {

        return id;

    }

    public String getName()
    {

        return name;

    }

    public int getQuantity()
    {

        return quantity;

    }

    public double getCost()
    {

        return cost;

    }

    public int getVendingMachineId()
    {

        return vendingMachineId;

    }

    // setters

    public void setName(String name)
    {

        this.name = name;

    }

    public void setCost(double cost)
    {

        this.cost = cost;

    }

    public void setVendingMachineId(int vendingMachineId)
    {

        this.vendingMachineId = vendingMachineId;

    }

    // other methods

    public void addQuantity(int quantityToAdd)
    {

        quantity += quantityToAdd;

    }

    public void buySnack(int quantityToBuy)
    {

        quantity -= quantityToBuy;

    }

    public double getTotalCost(int totalQuantity)
    {

        return totalQuantity * cost;

    }

}