package com.builder;

public interface CarBuilder {
	CarBuilder setSize(String size);
    CarBuilder setCrust(String crust);
    CarBuilder addTopping(String topping);
    Car build();
}
