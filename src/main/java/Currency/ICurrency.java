package Currency;

public interface ICurrency {
    String getCurrency();
    float getAmount();
    ICurrency times (float multiplier);
    ICurrency add (ICurrency currency) throws Exception;
}
