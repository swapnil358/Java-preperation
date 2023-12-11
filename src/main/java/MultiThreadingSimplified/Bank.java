package MultiThreadingSimplified;

/* Static Synchronization */

class Bank extends Thread {

    static int bal = 5000;
    static int withdraw;

    public Bank(int withdraw) {
        this.withdraw = withdraw;
    }



    public static synchronized void withdraw() {  //as the method is synchronized, now either t1 thread or t2 thread will enter
        String name = Thread.currentThread().getName();
        if (withdraw <= bal) {
            System.out.println(name + " withdrawn money");
            bal = bal - withdraw;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void run(){
        withdraw();
    }
}

class Customer {
    public static void main(String[] args) {
        Bank obj = new Bank(5000);   //obj has one lock

        Thread t1 = new Thread(obj);    //We are assigning two thread to the single lock (obj)
        Thread t2 = new Thread(obj);

        t1.setName("Raju");
        t2.setName("Sunita");    //Raju and sunita has joint account, they can withdraw and deposit money

        t1.start();
        t2.start();


        Bank obj2 = new Bank(5000);
        Thread t3 = new Thread(obj2);    //We are assigning two thread to the single lock (obj)
        Thread t4 = new Thread(obj2);
        t3.setName("Rahul");
        t4.setName("Anita");

        t3.start();
        t4.start();

    }
}

//output -
// Raju withdrawn money
//Sunita withdrawn money
// corrupted data, Raju and Sunita can not withdraw 5000 money at time, because they have balance of 5000/- only

//To avoid this problem we can make the method synchronized
