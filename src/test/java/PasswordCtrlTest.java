import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordCtrlTest {

    @Test
    void checkPassowordTooShort() {
        boolean actual = PasswordCtrl.checkPassword("1234567");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPasswordCorrectLength() {

        boolean actual = PasswordCtrl.checkPassword("12345678");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void checkPassowordTooLong() {

        boolean actual = PasswordCtrl.checkPassword("12345678123456781234567812345678");
        boolean expected = false;
        assertEquals(expected, actual);

    }


}
