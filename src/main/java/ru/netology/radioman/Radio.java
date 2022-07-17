package ru.netology.radioman;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void plusVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void minusVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation < 9) {
            int newCurrentStation = currentStation + 1;
            setCurrentStation(newCurrentStation);
            return;
        }
        int newCurrentStation = 0;
        setCurrentStation(newCurrentStation);
    }

    public void prevStation() {
        if (currentStation >= 1) {
            int newCurrentStation = currentStation - 1;
            setCurrentStation(newCurrentStation);
            return;
        }
        int newCurrentStation = 9;
        setCurrentStation(newCurrentStation);

    }

}
