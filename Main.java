package com.company;

public class Main {

    public static void main(String[] args) {
        Account defaultAccount = new Account();
        Account jasonsAccount = new Account("12345", 0.00, "Jason Comstock", "myemail@jason.com", "(716) 123-1234");

        System.out.println("Your default account number is " + defaultAccount.getNumber());
        System.out.println("Your account number is " + jasonsAccount.getNumber());
        System.out.println("Your account balance is " + jasonsAccount.getBalance());

        jasonsAccount.withdrawal(100.0);

        jasonsAccount.deposit(50.0);
        jasonsAccount.withdrawal(100.0);

        jasonsAccount.deposit(51.0);
        jasonsAccount.withdrawal(100.0);

        Account dansAccount = new Account("Dan", "dan@email.com", "(716) 456-7890");
        System.out.println(dansAccount.getNumber() + " name " + dansAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Jason", 100.00, "jason@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
