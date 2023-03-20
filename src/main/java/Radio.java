public class Radio {
    //переменные -------------
    private int nomberStation;
    private int soundVolume;


    //СТАНЦИЯ--------------------------------

    //get and set -----
    public int getNomberStation() {
        return nomberStation;
    }

    public void setNomberStation(int newNomberStation) {
        if (newNomberStation < 0) {
            return;
        }
        if (newNomberStation > 9) {
            return;
        }
        this.nomberStation = newNomberStation;
    }

    //изменение станции ---
    public void next() {
        if (nomberStation != 9) {
            nomberStation++;
        } else {
            nomberStation = 0;
        }
    }

    public void prev() {
        if (nomberStation != 0) {
            nomberStation--;
        } else {
            nomberStation = 9;
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
