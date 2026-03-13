class Laptop {
    String brand;
    int ram;

    // 1. Default Constructor
    Laptop() {
        brand = "Unknown";
        ram = 0;
    }

    // 2. Constructor with Brand
    Laptop(String brand) {
        this.brand = brand;
        ram = 0;
    }

    // 3. Constructor with Brand and RAM
    Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell");
        Laptop l3 = new Laptop("HP", 16);

        System.out.println("l1: " + l1.brand + ", " + l1.ram + "GB");
        System.out.println("l2: " + l2.brand + ", " + l2.ram + "GB");
        System.out.println("l3: " + l3.brand + ", " + l3.ram + "GB");
    }
}