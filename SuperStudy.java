class loan {
    int rate;

    loan() {
        System.out.println("Hi, I'm default constructor of loan");
    }

    loan(int rate) {
        this.rate = rate;
    }

    void printRate() {
        System.out.println(this.rate);
    }
}

class Carloan extends loan {
    int rate;

    Carloan() {
        System.out.println("Hi, I'm default constructor of Carloan");
        System.out.println(super.rate);// 1- using super to access the instance variable of parent class
    }

    Carloan(int rate) {
        super(7);// 3 - to invoke the constructor of the parent class(must be 1st line of the
                 // constructor)
        this.rate = rate;
    }

    void printRate() {
        System.out.println(this.rate);
        super.printRate();// 2 - using super to invoke methods of the parent class
        System.out.println(super.rate);
    }
}

public class SuperStudy {
    public static void main(String args[]) {
        Carloan cl2 = new Carloan();
        Carloan cl = new Carloan(8);
        cl.printRate();
    }
}