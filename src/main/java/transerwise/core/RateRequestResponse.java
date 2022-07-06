package transerwise.core;

import transerwise.core.Currency.ExchangeRate;

public class RateRequestResponse {
    enum Status {
        SUCCESS,
        FAIL
    }

    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    private ExchangeRate exchangeRate;

}
