package com.endrmfek.testpractice.unit;

import com.endrmfek.testpractice.unit.beverage.Americano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KioskTest {

    @Test
    void add() {
        Kiosk kiosk = new Kiosk();
        kiosk.add(new Americano());

        System.out.println(">> 담긴 음료 수 : " + kiosk.getBeverages().size());
        System.out.println(">> 담긴 음료 : " + kiosk.getBeverages().get(0).getName());
    }

}