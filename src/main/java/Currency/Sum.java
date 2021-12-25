package Currency;

public class Sum implements ICurrencyExpression{
    private ICurrency augmend;
    private ICurrency addmend;

    public Sum(ICurrency augmend, ICurrency addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public ICurrency reduceTo(String toCurrency) {
        return null;
    }


//    @Override
//    public ICurrency reduceTo(String toCurrency) {
//        return new Money(ex;
//    }
}
