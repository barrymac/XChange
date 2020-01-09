package org.knowm.xchange.bitfinex.service;

import java.math.BigDecimal;
import org.knowm.xchange.currency.Currency;

public class DefaultTransferFundsParams implements TransferFundsParams {
  public final BitfinexWalletType from;
  public final BitfinexWalletType to;

  public final Currency currency;

  public final BigDecimal amount;

  public DefaultTransferFundsParams(
      BitfinexWalletType from, BitfinexWalletType to, Currency currency, BigDecimal amount) {
    this.from = from;
    this.to = to;
    this.currency = currency;
    this.amount = amount;
  }

  public Currency getCurrency() {
    return currency;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public BitfinexWalletType getFrom() {
    return from;
  }

  public BitfinexWalletType getTo() {
    return to;
  }

  @Override
  public String toString() {
    return "DefaultTransferFundsParams{"
        + "from="
        + from
        + ", to="
        + to
        + ", currency="
        + currency
        + ", amount="
        + amount
        + '}';
  }
}
