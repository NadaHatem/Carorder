package com.builder;

public class ConcreteCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public CarBuilder setSize(String size) {
        car.setSize(size);
        return this;
    }

    @Override
    public CarBuilder setCrust(String crust) {
        car.setCrust(crust);
        return this;
    }

    @Override
    public CarBuilder addTopping(String topping) {
        car.getToppings().add(topping);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}