package transerwise.core;

import transerwise.core.Currency.Currency;

/**
 * Provides service to calls third party rest API
 */
public interface ThirdPartyAPI {
    void exchange(Currency currencyA, Currency currencyB, float amount);
    float rate(Currency currencyA, Currency currencyB);

    // exchange
    // rate
}
