package org.knowm.xchange.bitfinex.v2.dto.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** https://api.bitfinex.com/v2/auth/w/transfer */
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@Setter
@Getter
@ToString
public class Transfer {
  /** Ledger identifier */
  private long id;
  private String type;
  private String text;
  private String withdrawType;
  private String walletFrom;
  private String walletTo;
  private String amount;

  /*
      * MTS	int	Millisecond Time Stamp of the update
  TYPE	string	Purpose of notification ('on-req', 'oc-req', 'uca', 'fon-req', 'foc-req')
  MESSAGE_ID	int	unique ID of the message
  MTS_UPDATED	int	Millisecond Time Stamp when the transfer was created
  WALLET_FROM	string	Starting wallet
  WALLET_TO	string	Destination wallet
  CURRENCY	string	Currency
  CURRENCY_TO	str	Currency converted to
  AMOUNT	int	Amount of Transfer
  CODE	null or integer	Work in progress
  STATUS	string	Status of the notification; it may vary over time (SUCCESS, ERROR, FAILURE, ...)
  TEXT	string	Text of the notification
  *
  * [
      MTS_UPDATE,
      WALLET_FROM,
      WALLET_TO,
      _PLACEHOLDER,
      CURRENCY,
      CURRENCY_TO,
      _PLACEHOLDER,
      AMOUNT
    ]
    *
      * */

}
