// Task 1: Example Object (Laptop)
class Laptop {
    String brand;
    int ramSize; // in GB
    double screenSize; // in inches
    String processor;

    public Laptop(String brand, int ramSize, double screenSize, String processor) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.screenSize = screenSize;
        this.processor = processor;
    }

    void powerOn() {
        System.out.println(brand + " Laptop is powering on...");
    }

    void powerOff() {
        System.out.println(brand + " Laptop is shutting down...");
    }

    void runSoftware(String software) {
        System.out.println("Running " + software + " on " + brand + " Laptop.");
    }
}

// Task 2: Identifying objects in the Loan Management System
class Loan {
    int loanId;
    String borrower;
    double amount;
    boolean isPaid;

    public Loan(int loanId, String borrower, double amount) {
        this.loanId = loanId;
        this.borrower = borrower;
        this.amount = amount;
        this.isPaid = false;
    }

    void makePayment(double payment) {
        if (payment >= amount) {
            isPaid = true;
            System.out.println("Loan fully paid.");
        } else {
            amount -= payment;
            System.out.println("Remaining loan amount: " + amount);
        }
    }
}

class Borrower {
    String name;
    String idNumber;

    public Borrower(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    void requestLoan(double amount) {
        System.out.println(name + " is requesting a loan of " + amount);
    }
}

// Task 3: BangunRuang Class with PrismaSegitiga and Balok
abstract class BangunRuang {
    abstract double getVolume();
}

class PrismaSegitiga extends BangunRuang {
    double base;
    double height;
    double length;

    public PrismaSegitiga(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    @Override
    double getVolume() {
        return (0.5 * base * height) * length;
    }
}

class Balok extends BangunRuang {
    double length;
    double width;
    double height;

    public Balok(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double getVolume() {
        return length * width * height;
    }
}

// Main Class
public class TaskALSD {
    public static void main(String[] args) {
        // Testing Laptop
        Laptop myLaptop = new Laptop("Dell", 16, 15.6, "Intel i7");
        myLaptop.powerOn();
        myLaptop.runSoftware("Eclipse");
        myLaptop.powerOff();

        // Testing Loan System
        Borrower borrower = new Borrower("Nasywa", "12345");
        borrower.requestLoan(5000);

        Loan loan = new Loan(1, "Nasywa", 5000);
        loan.makePayment(2000);
        loan.makePayment(3000);

        // Testing BangunRuang Classes
        PrismaSegitiga prisma = new PrismaSegitiga(4, 3, 11);
        Balok balok = new Balok(6, 4, 8);

        System.out.println("Volume of PrismaSegitiga: " + prisma.getVolume());
        System.out.println("Volume of Balok: " + balok.getVolume());
    }
}
