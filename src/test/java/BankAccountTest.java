import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;


    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount();

    }

    @Test
    public void canReturnFirstName(){

        String result = bankAccount.getFirstName("Nimo");
        String expected = "Nimo";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canReturnLastName(){

        String result = bankAccount.getLastName("Mohamed");
        String expected = "Mohamed";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canReturnDateOfBirth(){

        String result = bankAccount.getDataOfBirth("01/09/1999");
        String expected = "01/09/1999";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canReturnAccountNumber(){

        String result = bankAccount.getAccountNumber("123456");
        String expected = "123456";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canReturnBalance(){

        String result = bankAccount.getBalance("1B");
        String expected = "1B";
        assertThat(result).isEqualTo(expected);

    }

}

