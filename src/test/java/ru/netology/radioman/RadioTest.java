package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetCurrentStationUnder0() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrent9Volume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeOver100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeUnder0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldPlusVolumeTest() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.plusVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolume99Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.plusVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolume100Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.plusVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolume0Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.plusVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldMinusVolume10Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.minusVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldMinusVolume100Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.minusVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolume0Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.minusVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation50() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(50);
        int expected = 50;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationOver50() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(51);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber50Test() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(50);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber0Of50Test() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 50;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation10() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 10;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationOver10() {
        Radio rad = new Radio();
        rad.setCurrentStation(11);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber9Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 10;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber0Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber10Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.nextStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStationNumber0Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 10;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber10Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber1Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.prevStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


}