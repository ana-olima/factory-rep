package model;


import factory.IPhoneSimpleFactory;

public class Client {
    public static void main(String[] args) {

    System.out.println("### Ordering an IPhone 11");
    IPhone iPhone = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
    System.out.println(iPhone);

    System.out.println("###Ordering an IPhone X");
    IPhone iPhone1 = IPhoneSimpleFactory.orderIPhone("X", "standard");
    System.out.println(iPhone1);
    }
}
