package Model;

public class ExchangeRate {

    final Currency from;
    final Currency to;
    final Number rate;

    public ExchangeRate(Currency from, Currency to, Number rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }
}
