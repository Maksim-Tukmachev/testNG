package ru.netology.maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackServiceTest {
    @Test
    void onLimit() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void underLimit() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    void secondBonus() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }
}
