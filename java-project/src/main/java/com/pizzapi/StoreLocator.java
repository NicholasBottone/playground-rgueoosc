package com.pizzapi;

public class StoreLocator {

    public static Store findClosestStoreToCustomer(Customer customer) throws PizzaException {

        if (customer == null) {
            throw new PizzaException("Customer object not provided to StoreLocator.");
        }

        return new Store("Gongoliers Pizza & Bakery");

    }

}