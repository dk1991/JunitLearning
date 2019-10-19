package ru.kanaev;

import org.junit.Assert;
import org.junit.Test;
import ru.kanaev.good.Blackbird;
import ru.kanaev.good.Crow;

public class BlackbirdTest {
    @Test
    public void flyingTest() {
        Blackbird blackbird = new Blackbird("Igor");
        blackbird.feed();
        Assert.assertTrue(blackbird.isFlying());
    }
}
