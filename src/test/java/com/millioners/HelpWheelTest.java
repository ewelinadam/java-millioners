package com.millioners;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;


public class HelpWheelTest {
    @Test
    public void shouldReturnAwhenRandomIndexEquals0() {
        //given
        Random random = Mockito.mock(Random.class);
        HelpWheel helpWheel = new HelpWheel(random);
        //when
        Mockito.when(random.nextInt(7)).thenReturn(0);
        String answer = helpWheel.answerHelp("A");

        //then
        Assert.assertEquals("A", answer);
    }
    @Test
    public void shouldReturnBwhenRandomIndexEquals1() {
        //given
        Random random = Mockito.mock(Random.class);
        HelpWheel helpWheel = new HelpWheel(random);
        //when
        Mockito.when(random.nextInt(7)).thenReturn(1);
        String answer = helpWheel.answerHelp("A");

        //then
        Assert.assertEquals("B", answer);
    }
    @Test
    public void shouldReturnAwhenRandomIndexEquals6() {
        //given
        Random random = Mockito.mock(Random.class);
        HelpWheel helpWheel = new HelpWheel(random);
        //when
        Mockito.when(random.nextInt(7)).thenReturn(6);
        String answer = helpWheel.answerHelp("A");

        //then
        Assert.assertEquals("A", answer);
    }
}
