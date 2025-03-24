package org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Ex4_VehicleTest {
    List<Ex4_Vehicle> myVehicles;
    Ex4_Vehicle moto1;
    Ex4_Vehicle moto2;
    Ex4_Vehicle bicy1;
    Ex4_Vehicle bicy2;
    Ex4_Vehicle car1;
    Ex4_Vehicle car2;

    @BeforeEach
    void setUp() {
        myVehicles = new ArrayList<>();
        moto1 = new Moto("Yamaha");
        moto2 = new Moto("Honda");
        bicy1 = new Bicycle("Scott");
        bicy2 = new Bicycle("Giant");
        car1 = new Car("Seat");
        car2 = new Car("Ford");

    }

    @Test
    void objectsInsertedInOrder(){
        myVehicles.add(moto1);
        myVehicles.add(bicy1);
        myVehicles.add(car1);

        assertEquals(myVehicles.get(0), moto1);
        assertEquals(myVehicles.get(1), bicy1);
        assertEquals(myVehicles.get(2), car1);
    }

    @Test
    void allObjectsAreInserted(){
        myVehicles.add(moto1);
        myVehicles.add(bicy1);
        myVehicles.add(car1);

        assertEquals(3, myVehicles.size());
        assertTrue((myVehicles.contains(moto1)));
        assertTrue((myVehicles.contains(bicy1)));
        assertTrue((myVehicles.contains(car1)));

    }

    @Test
    void objetAddedOnce(){
        myVehicles.add(moto1);
        myVehicles.add(bicy1);
        myVehicles.add(car1);

        assertEquals(1, Collections.frequency(myVehicles, moto1));
    }

    @Test
    void objectNotAdded(){
        myVehicles.add(moto1);
        myVehicles.add(bicy1);
        myVehicles.add(car1);

        assertFalse(myVehicles.contains(moto2));
    }

    //Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada. Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.
}
