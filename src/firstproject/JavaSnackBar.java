package firstproject;

    public class JavaSnackBar {
        public static void main(String[] args) {
            Customer customer1 = new Customer(1, "Jane", 45.25);
            Customer customer2 = new Customer(2, "Bob", 33.14);
            VendingMachines machine1 = new VendingMachines(1, "Food");
            VendingMachines machine2 = new VendingMachines(2, "Drink");
            VendingMachines machine3 = new VendingMachines(3, "Office");
            Snacks vendingFood1 = new Snacks(1, "Chips", 36, 1.75, 1);
            Snacks vendingFood2 = new Snacks(2, "Chocolate Bar", 36, 1.00, 1);
            Snacks vendingFood3 = new Snacks(3, "Pretzel", 30, 2.00, 1);
            Snacks vendingDrink1 = new Snacks(4, "Soda", 24, 2.50, 2);
            Snacks vendingDrink2 = new Snacks(5, "Water", 20, 2.75, 2);
            System.out.println(vendingDrink1.cost);
            System.out.println(customer1.name);
            System.out.println(machine1.name);

        }
        public static class Customer {
            //instance variables
            public int id;
            public String name;
            public double cashOnHand;

            //customer constructor
            public Customer(int initId, String initName, double initCashOnHand) {
                id = initId;
                name = initName;
                cashOnHand = initCashOnHand;
            }
                    }
        public static class VendingMachines {
            //instance variables
            public int id;
            public String name;
            //vending machine constructor
            public VendingMachines(int initId, String initName) {
                id = initId;
                name = initName;
            }
            public void setId(int id){
                this.id = id;
            }
            public void setName(String name){
                this.name = name;
            }
            public int getId(){
                return id;
            }
            public String getName(){
                return name;
            }
        }
        public static class Snacks{
            //instance variables
            public int id;
            public String name;
            public int quantity;
            public double cost;
            public int vendingMachineId;
            //snacks constructor
            public Snacks(int initId, String initName, int initQuantity, double initCost, int initVendingMachineId){
                id = initId;
                name = initName;
                quantity = initQuantity;
                cost = initCost;
                vendingMachineId = initVendingMachineId;
            }
            public void setId(int id){
                this.id = id;
            }
            public void setName(String name){
                this.name = name;
            }
            public void setCost(double cost){
                this.cost = cost;
            }
            public void setVendingMachineId(int vendingMachineId){
                this.vendingMachineId = vendingMachineId;
            }
            public int getId(){
                return id;
            }
            public String getName(){
                return name;
            }
            public int getQuantity(){
                return quantity;
            }
            public double getCost(){
                return cost;
            }
            public int getVendingMachineId(){
                return vendingMachineId;
            }
        }


    }