package org.knowm.xchange.bitfinex.service;

public enum BitfinexWalletType {
  EXCHANGE_WALLET("exchange"),
  FUNDING_WALLET("deposit"),
  MARGIN_WALLET("margin");
  private String value;

  public String getValue() {
    return value;
  }

  BitfinexWalletType(String value) {
    this.value = value;
  }
}
