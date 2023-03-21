public class Radio {
    //переменные -------------
    private int nomberStation;
    private int soundVolume;
    private int maxStation;

    public Radio () {
        maxStation = 10;
    }
    public Radio (int stationCount) {
        maxStation = stationCount - 1;
    }


    //СТАНЦИЯ--------------------------------

    //get and set -----
    public int getNomberStation() {
        return nomberStation;
    }

    public void setNomberStation(int newNomberStation) {
        if (newNomberStation < 0) {
            return;
        }
        if (newNomberStation > maxStation) {
            return;
        }
        this.nomberStation = newNomberStation;
    }

    //изменение станции ---
    public void next() {
        if (nomberStation != maxStation) {
            nomberStation++;
        } else {
            nomberStation = 0;
        }
    }

    public void prev() {
        if (nomberStation != 0) {
            nomberStation--;
        } else {
            nomberStation = maxStation;
        }
    }

    //ЗВУК-------------------------------------------
    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume != 100) {
            soundVolume++;
        } else {
            soundVolume = 100;
        }
    }


    public void reductionVolume() {
        if (soundVolume != 0) {
            soundVolume--;
        } else {
            soundVolume = 0;
        }
    }
}
