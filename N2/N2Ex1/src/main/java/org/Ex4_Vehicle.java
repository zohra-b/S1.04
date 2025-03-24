package org;

import java.util.Objects;

public class Ex4_Vehicle {
    String name;

    public Ex4_Vehicle(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        org.Ex4_Vehicle vehicle = (org.Ex4_Vehicle) o;
        return Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


}

class Moto extends org.Ex4_Vehicle {

    public Moto(String name) {
        super(name);
    }
}

class Car extends org.Ex4_Vehicle {

    public Car(String name) {
        super(name);
    }
}

class Bicycle extends org.Ex4_Vehicle {

    public Bicycle(String name) {
        super(name);
    }
}
