package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetCurrent9Volume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationOver9() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationUnder0() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
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
    public void shouldPlusVolumeOver10Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.plusVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolume10Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.plusVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeUnder0Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
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
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolume5Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.minusVolume();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeOver10Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.minusVolume();
        int expected = -1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeUnder0Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.minusVolume();
        int expected = -1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolume0Test() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.minusVolume();
        int expected = -1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber9Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.nextStation();
        int expected = 0;
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
    public void shouldNextStationNumber5Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.nextStation();
        int expected = 6;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber8Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.nextStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOverNumber9Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(20);
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationUnderNumber0Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber0Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber9Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.prevStation();
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber5Test() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        rad.prevStation();
        int expected = 4;
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

    @Test
    public void shouldPrevStationNumberOver10() {
        Radio rad = new Radio();
        rad.setCurrentStation(20);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumberUnder0() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


}