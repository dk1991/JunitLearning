package ru.kanaev;

import org.junit.Assert;
import org.junit.Test;
import ru.kanaev.good.Crow;

public class CrowTest {
    @Test
    public void flyingTest() {
        Crow crow = new Crow("Zina");
        crow.feed();
        Assert.assertFalse(crow.isFlying());
    }
}
