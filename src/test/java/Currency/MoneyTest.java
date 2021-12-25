package Currency;

import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    void testMultiplication () {
        ICurrency currency =  Money.dollar(5);
        assertEquals(Money.dollar(10), currency.times(2));
        assertEquals(Money.dollar(15), currency.times(3));

    }

    @Test
    void testEquals() {
        ICurrency currency = Money.dollar(5);
        assertEquals(currency, currency);
        assertEquals(Money.dollar(5), currency );
        assertEquals(Money.dollar(10), currency.times(2));
        assertNotEquals(Money.dollar(5), Money.Franc(5));
        assertNotEquals(Money.dollar(5).times(2), Money.Franc(5).times(2));
    }

    @Test
    void testSum() throws Exception {
        ICurrency dollar = Money.dollar(5);
        ICurrency franc = Money.Franc(5);
        assertEquals(Money.dollar(10), dollar.add(dollar));
        assertNotEquals(Money.dollar(11), dollar.add(dollar));
    }
}
