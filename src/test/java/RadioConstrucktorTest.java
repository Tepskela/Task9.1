import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioConstrucktorTest {

    //Граничные знаяения ------------------
    @Test
    public void testEquallyMaxStation() {
        Radio radio = new Radio(15);

        radio.setNomberStation(14);

        int expected = 14;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAboutMaxStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(20);

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLessMaxStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(18);

        int expected = 18;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testLessMinStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(-1);

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEquallyMinStation() {
        Radio radio = new Radio(10);

        radio.setNomberStation(0);

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAboutMinStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(1);

        int expected = 1;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    //Кнопки Next и Prev----------------------

    @Test
    public void testButtonNextEquallyMaxStation() {
        Radio radio = new Radio(15);

        radio.setNomberStation(13);
        radio.next();

        int expected = 14;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonNextAboutMaxStation() {
        Radio radio = new Radio(18);

        radio.setNomberStation(17);
        radio.next();

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testButtonNextLessMaxStation() {
        Radio radio = new Radio(21);

        radio.setNomberStation(18);
        radio.next();

        int expected = 19;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonPrevLessMaxStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(19);
        radio.prev();

        int expected = 18;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonPrevEquallyMinStation() {
        Radio radio = new Radio(10);

        radio.setNomberStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonPrevAboutMinStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(2);
        radio.prev();

        int expected = 1;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonPrevLessMinStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(0);
        radio.prev();

        int expected = 19;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonNextAboutMinStation() {
        Radio radio = new Radio(20);

        radio.setNomberStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }


    //Маленькое колличество станций -----------------
    @Test
    public void testTwoStation() {
        Radio radio = new Radio(2);

        radio.setNomberStation(1);

        int expected = 1;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testOneStation() {
        Radio radio = new Radio(1);

        radio.setNomberStation(0);

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonNextTwoStation() {
        Radio radio = new Radio(2);

        radio.setNomberStation(1);
        radio.next();

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testButtonaPrevTwoStation() {
        Radio radio = new Radio(2);

        radio.setNomberStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getNomberStation();
        Assertions.assertEquals(expected, actual);
    }

}
