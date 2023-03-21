import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    //Тест граничных значений станций радио---------------------------------
    @Test
    public void testAboveMaxStation() {
        Radio radio = new Radio();

        radio.setNomberStation(10);

        int expected = 10;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEquallyMaxStation() {
        Radio radio = new Radio();

        radio.setNomberStation(10);

        int expected = 10;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMaxStation() {
        Radio radio = new Radio();

        radio.setNomberStation(9);

        int expected = 9;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMinStation() {
        Radio radio = new Radio();

        radio.setNomberStation(-1);

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEquallyMinStation() {
        Radio radio = new Radio();

        radio.setNomberStation(0);

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboveMinStation() {
        Radio radio = new Radio();

        radio.setNomberStation(1);

        int expected = 1;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    // Кнопки Next и Prev--------------------

    @Test
    public void testButtonNextAboveMaxStation() {
        Radio radio = new Radio();

        radio.setNomberStation(10);

        radio.next();

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonNextEquallyMaxStation() {
        Radio radio = new Radio();

        radio.setNomberStation(9);

        radio.next();

        int expected = 10;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonPrevLessMaxStation() {
        Radio radio = new Radio();

        radio.setNomberStation(10);

        radio.prev();

        int expected = 9;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonPrevLessMinStation() {
        Radio radio = new Radio();

        radio.setNomberStation(0);

        radio.prev();

        int expected = 10;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonPrevEquallyMinStation() {
        Radio radio = new Radio();

        radio.setNomberStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonNextAboutMinStation() {
        Radio radio = new Radio();

        radio.setNomberStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    //Граничные значения звука (предпологаю, что тестирование граничных знечений громкости лишнее, т к по условиям, пользователь не может ввыбирать громкость)
    @Test
    public void testAboutMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEquallyMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);

        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAboutMinSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEquallyMinSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMinSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    // Кнопки + (increase) и - (reduction)  --------------------------------------
    @Test
    public void testButtonIncreaseAboutMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonIncreaseEquallyMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonReductionLessMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.reductionVolume();

        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonReductionLessMinSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonReductionEquallyMinSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonincreaseAboutMinSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}

