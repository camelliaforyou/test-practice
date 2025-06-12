package com.endrmfek.testpractice.unit;

import com.endrmfek.testpractice.unit.beverage.Americano;
import com.endrmfek.testpractice.unit.beverage.Latte;
import com.endrmfek.testpractice.unit.order.Order;
import net.bytebuddy.description.type.RecordComponentDescription;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class KioskTest {

    @Test
    void add_manual_test() {
        Kiosk kiosk = new Kiosk();
        kiosk.add(new Americano());

        System.out.println(">> 담긴 음료 수 : " + kiosk.getBeverages().size());
        System.out.println(">> 담긴 음료 : " + kiosk.getBeverages().get(0).getName());
    }

    @Test
    void add() {
        Kiosk kiosk = new Kiosk();
        kiosk.add(new Americano());

        //assertThat(kiosk.getBeverages().size()).isEqualTo(1);
        assertThat(kiosk.getBeverages()).hasSize(1);
        assertThat(kiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

    @Test
    void addSeveralBeverages() {
        Kiosk kiosk = new Kiosk();
        Americano americano = new Americano();

        kiosk.add(americano, 2);

        //assertThat(kiosk.getBeverages().size()).isEqualTo(1);
        assertThat(kiosk.getBeverages().get(0)).isEqualTo(americano);
        assertThat(kiosk.getBeverages().get(1)).isEqualTo(americano);
    }
    @Test
    void addZeroBeverage() {
        Kiosk kiosk = new Kiosk();
        Americano americano = new Americano();

        kiosk.add(americano, 0);

        assertThatThrownBy(() -> kiosk.add(americano, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("음료는 한잔 이상 주문해야 합니다.");

    }

    @Test
    void remove() {
        Kiosk kiosk = new Kiosk();
        Americano americano = new Americano();

        kiosk.add(americano);
        assertThat(kiosk.getBeverages()).hasSize(1);

        kiosk.remove(americano);
//        assertThat(kiosk.getBeverages()).hasSize(0);
        assertThat(kiosk.getBeverages()).isEmpty();
    }

    @Test
    void clear() {
        Kiosk kiosk = new Kiosk();
        Americano americano = new Americano();
        Latte latte = new Latte();

        kiosk.add(americano);
        kiosk.add(latte);
        assertThat(kiosk.getBeverages()).hasSize(2);

        kiosk.clear();
        assertThat(kiosk.getBeverages()).isEmpty();
    }

    @Test
    void createOrder() {
        Kiosk kiosk = new Kiosk();
        Americano americano = new Americano();

        kiosk.add(americano);

        Order order = kiosk.createOrder();

        assertThat(kiosk.getBeverages()).hasSize(1);
        assertThat(kiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

     







}