package ru.netology.radioman;

public class Radio {

    private int currentVolume;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentStation;
    private int maxCurrentStation = 10;
    private int minCurrentStation = 0;

    public Radio() {

    }

    public Radio(int maxCurrentStation) {
        this.maxCurrentStation = maxCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minCurrentVolume) {
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void plusVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void minusVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minCurrentStation) {
            return;
        }
        if (currentStation > maxCurrentStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void nextStation() {
        if (currentStation < maxCurrentStation) {
            int newCurrentStation = currentStation + 1;
            setCurrentStation(newCurrentStation);
            return;
        }
        int newCurrentStation = 0;
        setCurrentStation(newCurrentStation);
    }

    public void prevStation() {
        if (currentStation > minCurrentStation) {
            int newCurrentStation = currentStation - 1;
            setCurrentStation(newCurrentStation);
            return;
        }
        int newCurrentStation = maxCurrentStation;
        setCurrentStation(newCurrentStation);

    }

}
