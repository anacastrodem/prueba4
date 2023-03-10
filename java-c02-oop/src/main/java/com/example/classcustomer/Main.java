package com.example.classcustomer;

public class Main {

    private static Customer customer1;

    public static void main(String[] args) {

        /*
        Si a la hora de crear objetos no tenemos ciertos valores,
        entonces podemos rellenarlos con un valor por defecto o null en el constructor
         */
        Customer customer1 = new Customer("customer1", "c1@email.com", 20, 10);
        Customer customer2 = new Customer(null, "c2@email.com", null, 0.0);
        if (customer2.name != null) { // null checking
            System.out.println(customer2.name.toUpperCase());
        }


    }
}
