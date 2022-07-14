package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testMe(){}


    @Test
    public void catTest() {
        String expectedName = "kittypurry";

        Cat cat = new Cat(expectedName);

        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void speakTest(){
        String expectedSpeak = "meow";

        Cat cat = new Cat("clowie");

        String actualSpeak = cat.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);

    }
}
