package transerwise.core;

import transerwise.core.Currency.Currency;

public interface TransferWiseCore {
    ExchangeResponse exchange(Currency currencyA, Currency currencyB, float amount);
    RateRequestResponse rateRequestExchange(Currency currencyA, Currency currencyB);
    TransactionInfo getTransactionInfo(String transactionId);
    void updateTransaction(String transactionId,
                            TransactionStatus transactionStatus);
}
