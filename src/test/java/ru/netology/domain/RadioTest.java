package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationHigherMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNexCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setNexCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationLowerMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrevCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevCurrentStation();
        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setIncreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setIncreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setDecreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);
    }


}
