import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStTest1() {
        Radio radio = new Radio();

        radio.setRadioSt(7);

        int expected = 7;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStTest2() {
        Radio radio = new Radio();

        radio.setRadioSt(10);

        int expected = 0;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStTest3() {
        Radio radio = new Radio();

        radio.setRadioSt(-10);

        int expected = 0;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStTest1() {
        Radio radio = new Radio();

        radio.nextRadioSt();

        int expected = 1;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStTest2() {
        Radio radio = new Radio();

        radio.setRadioSt(9);
        radio.nextRadioSt();

        int expected = 0;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStTest1() {
        Radio radio = new Radio();

        radio.prevRadioSt();

        int expected = 9;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStTest2() {
        Radio radio = new Radio();

        radio.setRadioSt(9);
        radio.prevRadioSt();

        int expected = 8;
        int actual = radio.getRadioSt();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpRadioValueTest1() {
        Radio radio = new Radio();

        radio.upValue();

        int expected = 1;
        int actual = radio.getRadioValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpRadioValueTest2() {
        Radio radio = new Radio();

        radio.setRadioValue(100);
        radio.upValue();

        int expected = 100;
        int actual = radio.getRadioValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownRadioValueTest1() {
        Radio radio = new Radio();

        radio.downValue();

        int expected = 0;
        int actual = radio.getRadioValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownRadioValueTest2() {
        Radio radio = new Radio();

        radio.setRadioValue(50);
        radio.downValue();

        int expected = 49;
        int actual = radio.getRadioValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioValueTest1() {
        Radio radio = new Radio();

        radio.setRadioValue(150);

        int expected = 100;
        int actual = radio.getRadioValue();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioValueTest2() {
        Radio radio = new Radio();

        radio.setRadioValue(-100);

        int expected = 0;
        int actual = radio.getRadioValue();

        Assertions.assertEquals(expected, actual);
    }
}
