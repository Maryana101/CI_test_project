package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeServiceTest {
    @Test
    public void shouldNoIncome (){

        IncomeService incomeService = new IncomeService();
        int age=2;
        int actual = incomeService.calcIncome(age);
        int expected =0;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldGetIncome(){
        IncomeService incomeService = new IncomeService();
        int age=50;
        int actual = incomeService.calcIncome(age);
        int expected =50_000;
        Assertions.assertEquals(expected,actual);

    }

}
