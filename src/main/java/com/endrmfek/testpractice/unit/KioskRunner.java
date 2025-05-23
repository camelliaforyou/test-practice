package com.endrmfek.testpractice.unit;

import com.endrmfek.testpractice.unit.beverage.Americano;
import com.endrmfek.testpractice.unit.beverage.Latte;

public class KioskRunner {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.add(new Americano());
        System.out.println(">> 아메리카노 추가");
        kiosk.add(new Latte());
        System.out.println(">> 라떼 추가");

        int totalPrice = kiosk.calculateTotalPrice();
        System.out.println(">> 총 주문 가격 : " + totalPrice);
    }
}
