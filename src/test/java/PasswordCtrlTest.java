import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordCtrlTest {

    @Test
    void checkPassowordTooShort() {
        boolean actual = PasswordCtrl.checkLength("1234567");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordCorrectLength() {

        boolean actual = PasswordCtrl.checkLength("123456789");
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void checkPassowordTooLong() {

        boolean actual = PasswordCtrl.checkLength("12345678123456781234567812345678");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void checkPasswordUpperCase() {

        boolean actual = PasswordCtrl.containsUpperCaseCharacter("KKKKKKKKKKKKKKKKK");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void checkPasswordLowerCase (){

        boolean actual = PasswordCtrl.containsLowerCaseCharacter("kkkkkkkkkkkkkkkkkkkkk");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void checkPasswordLowerCaseFalse (){

        boolean actual = PasswordCtrl.containsLowerCaseCharacter("KKKKKKKKKKKKKKKK");
        boolean expected = false;
        assertEquals(expected, actual);

    }
    @Test
    void checkPasswordUpperCaseFalse () {

        boolean actual = PasswordCtrl.containsUpperCaseCharacter("kkkkkkkkkkkkkkkkkk");
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void hasDigit (){
        boolean actual = PasswordCtrl.checkIsDigit("123hshsus");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void hasNoDigit (){
        boolean actual = PasswordCtrl.checkIsDigit("hshsussdsdsd");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void hasSpecialSymbol() {
        boolean actual = PasswordCtrl.checkIfSpecialCharacter("das@!$2()");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void hasNoSpecialSymbol() {
        boolean actual = PasswordCtrl.checkIfSpecialCharacter("das123");
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void iscorrectPassword() {
        boolean actual = PasswordCtrl.checkPassword("WasGehtAbBruder123@#!!");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isNotCorrectPassword() {
        boolean actual = PasswordCtrl.checkPassword("ksjdhwuwndi");
        boolean expected = false;
        assertEquals(expected, actual);
    }

}
