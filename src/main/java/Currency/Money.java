package Currency;

import java.util.Objects;

public class Money implements ICurrency{
    protected float amount;
    protected String currency;

    public Money(float amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String getCurrency() {
        return this.currency;
    }

    @Override
    public float getAmount() {
        return this.amount;
    }

    @Override
    public ICurrency times(float multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    @Override
    public ICurrency add(ICurrency currency) throws Exception {
        ICurrency iCurrency = null;
        if (Objects.isNull(currency)) throw new NullPointerException ("Null cannot be added.");
        if (isSameCurrency(currency.getCurrency())) {
            iCurrency = new Money(this.amount + currency.getAmount(), currency.getCurrency());
        } else throw new Exception(" Currency of type " + this.currency + " cannot be added to " + currency.getCurrency() + "." );
        return iCurrency;
    }

    private boolean isSameCurrency(String currency) {
        return this.currency.equals(currency);
    }


    public static ICurrency dollar(float amount) {
        return new Money(amount, "USD");
    }

    public static ICurrency Franc(float amount) {
        return new Money(amount, "CHF");
    }


    @Override
    public boolean equals (Object object) {
        if ( Objects.isNull(object) ) return false;
        if ( this ==  object )  return true;
        Money money = (Money) object;
        return ( Float.compare(money.amount,amount) == 0 && this.currency.equals(money.currency));
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
