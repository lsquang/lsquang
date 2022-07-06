package transerwise.core;

import transerwise.core.Currency.Currency;

/** provides services to connect to data
 *
  */
public interface Database {
    void update(String id, Currency currencyA, Currency currencyB, float amount, TransferWiseCoreImpl.TransactionStatus status);
}
