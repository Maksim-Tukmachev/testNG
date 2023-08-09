package ru.netology.maven;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackServiceTest {
    @Test
    public void onLimit() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void underLimit() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void secondBonus() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }
}
