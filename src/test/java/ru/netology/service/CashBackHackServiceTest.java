package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackServiceTest {

    @Test
    public void remain() {
        CashBackHackService service = new CashBackHackService();

        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void totalAmount() {
        CashBackHackService service = new CashBackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amountIsLess() {
        CashBackHackService service = new CashBackHackService();

        int expected = 999;
        int actual = service.remain(1001);

        Assert.assertEquals(actual, expected);
    }
}