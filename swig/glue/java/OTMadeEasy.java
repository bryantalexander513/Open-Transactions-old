/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class OTMadeEasy {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OTMadeEasy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OTMadeEasy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_OTMadeEasy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OTMadeEasy() {
    this(otapiJNI.new_OTMadeEasy(), true);
  }

  public boolean make_sure_enough_trans_nums(int nNumberNeeded, String SERVER_ID, String NYM_ID) {
    return otapiJNI.OTMadeEasy_make_sure_enough_trans_nums(swigCPtr, this, nNumberNeeded, SERVER_ID, NYM_ID);
  }

  public String register_nym(String SERVER_ID, String NYM_ID) {
    return otapiJNI.OTMadeEasy_register_nym(swigCPtr, this, SERVER_ID, NYM_ID);
  }

  public String check_user(String SERVER_ID, String NYM_ID, String TARGET_NYM_ID) {
    return otapiJNI.OTMadeEasy_check_user(swigCPtr, this, SERVER_ID, NYM_ID, TARGET_NYM_ID);
  }

  public String create_pseudonym(int nKeybits, String NYM_ID_SOURCE, String ALT_LOCATION) {
    return otapiJNI.OTMadeEasy_create_pseudonym(swigCPtr, this, nKeybits, NYM_ID_SOURCE, ALT_LOCATION);
  }

  public String issue_asset_type(String SERVER_ID, String NYM_ID, String THE_CONTRACT) {
    return otapiJNI.OTMadeEasy_issue_asset_type(swigCPtr, this, SERVER_ID, NYM_ID, THE_CONTRACT);
  }

  public String issue_basket_currency(String SERVER_ID, String NYM_ID, String THE_BASKET) {
    return otapiJNI.OTMadeEasy_issue_basket_currency(swigCPtr, this, SERVER_ID, NYM_ID, THE_BASKET);
  }

  public String exchange_basket_currency(String SERVER_ID, String NYM_ID, String ASSET_TYPE_ID, String THE_BASKET, String ACCOUNT_ID, boolean IN_OR_OUT) {
    return otapiJNI.OTMadeEasy_exchange_basket_currency(swigCPtr, this, SERVER_ID, NYM_ID, ASSET_TYPE_ID, THE_BASKET, ACCOUNT_ID, IN_OR_OUT);
  }

  public String retrieve_contract(String SERVER_ID, String NYM_ID, String CONTRACT_ID) {
    return otapiJNI.OTMadeEasy_retrieve_contract(swigCPtr, this, SERVER_ID, NYM_ID, CONTRACT_ID);
  }

  public String load_or_retrieve_contract(String SERVER_ID, String NYM_ID, String CONTRACT_ID) {
    return otapiJNI.OTMadeEasy_load_or_retrieve_contract(swigCPtr, this, SERVER_ID, NYM_ID, CONTRACT_ID);
  }

  public String create_asset_acct(String SERVER_ID, String NYM_ID, String ASSET_TYPE_ID) {
    return otapiJNI.OTMadeEasy_create_asset_acct(swigCPtr, this, SERVER_ID, NYM_ID, ASSET_TYPE_ID);
  }

  public String stat_asset_account(String ACCOUNT_ID) {
    return otapiJNI.OTMadeEasy_stat_asset_account(swigCPtr, this, ACCOUNT_ID);
  }

  public boolean retrieve_account(String SERVER_ID, String NYM_ID, String ACCOUNT_ID) {
    return otapiJNI.OTMadeEasy_retrieve_account__SWIG_0(swigCPtr, this, SERVER_ID, NYM_ID, ACCOUNT_ID);
  }

  public boolean retrieve_account(String SERVER_ID, String NYM_ID, String ACCOUNT_ID, boolean bForceDownload) {
    return otapiJNI.OTMadeEasy_retrieve_account__SWIG_1(swigCPtr, this, SERVER_ID, NYM_ID, ACCOUNT_ID, bForceDownload);
  }

  public boolean retrieve_nym(String SERVER_ID, String NYM_ID) {
    return otapiJNI.OTMadeEasy_retrieve_nym__SWIG_0(swigCPtr, this, SERVER_ID, NYM_ID);
  }

  public boolean retrieve_nym(String SERVER_ID, String NYM_ID, boolean bForceDownload) {
    return otapiJNI.OTMadeEasy_retrieve_nym__SWIG_1(swigCPtr, this, SERVER_ID, NYM_ID, bForceDownload);
  }

  public String send_transfer(String SERVER_ID, String NYM_ID, String ACCT_FROM, String ACCT_TO, String AMOUNT, String NOTE) {
    return otapiJNI.OTMadeEasy_send_transfer(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_FROM, ACCT_TO, AMOUNT, NOTE);
  }

  public String process_inbox(String SERVER_ID, String NYM_ID, String ACCOUNT_ID, String RESPONSE_LEDGER) {
    return otapiJNI.OTMadeEasy_process_inbox(swigCPtr, this, SERVER_ID, NYM_ID, ACCOUNT_ID, RESPONSE_LEDGER);
  }

  public boolean accept_inbox_items(String ACCOUNT_ID, int nItemType, String INDICES) {
    return otapiJNI.OTMadeEasy_accept_inbox_items(swigCPtr, this, ACCOUNT_ID, nItemType, INDICES);
  }

  public boolean discard_incoming_payments(String SERVER_ID, String NYM_ID, String INDICES) {
    return otapiJNI.OTMadeEasy_discard_incoming_payments(swigCPtr, this, SERVER_ID, NYM_ID, INDICES);
  }

  public boolean cancel_outgoing_payments(String NYM_ID, String ACCOUNT_ID, String INDICES) {
    return otapiJNI.OTMadeEasy_cancel_outgoing_payments(swigCPtr, this, NYM_ID, ACCOUNT_ID, INDICES);
  }

  public int accept_from_paymentbox(String ACCOUNT_ID, String INDICES, String PAYMENT_TYPE) {
    return otapiJNI.OTMadeEasy_accept_from_paymentbox(swigCPtr, this, ACCOUNT_ID, INDICES, PAYMENT_TYPE);
  }

  public String load_public_encryption_key(String NYM_ID) {
    return otapiJNI.OTMadeEasy_load_public_encryption_key(swigCPtr, this, NYM_ID);
  }

  public String load_public_signing_key(String NYM_ID) {
    return otapiJNI.OTMadeEasy_load_public_signing_key(swigCPtr, this, NYM_ID);
  }

  public String load_or_retrieve_encrypt_key(String SERVER_ID, String NYM_ID, String TARGET_NYM_ID) {
    return otapiJNI.OTMadeEasy_load_or_retrieve_encrypt_key(swigCPtr, this, SERVER_ID, NYM_ID, TARGET_NYM_ID);
  }

  public String load_or_retrieve_signing_key(String SERVER_ID, String NYM_ID, String TARGET_NYM_ID) {
    return otapiJNI.OTMadeEasy_load_or_retrieve_signing_key(swigCPtr, this, SERVER_ID, NYM_ID, TARGET_NYM_ID);
  }

  public String send_user_msg_pubkey(String SERVER_ID, String NYM_ID, String RECIPIENT_NYM_ID, String RECIPIENT_PUBKEY, String THE_MESSAGE) {
    return otapiJNI.OTMadeEasy_send_user_msg_pubkey(swigCPtr, this, SERVER_ID, NYM_ID, RECIPIENT_NYM_ID, RECIPIENT_PUBKEY, THE_MESSAGE);
  }

  public String send_user_pmnt_pubkey(String SERVER_ID, String NYM_ID, String RECIPIENT_NYM_ID, String RECIPIENT_PUBKEY, String THE_INSTRUMENT) {
    return otapiJNI.OTMadeEasy_send_user_pmnt_pubkey(swigCPtr, this, SERVER_ID, NYM_ID, RECIPIENT_NYM_ID, RECIPIENT_PUBKEY, THE_INSTRUMENT);
  }

  public String send_user_cash_pubkey(String SERVER_ID, String NYM_ID, String RECIPIENT_NYM_ID, String RECIPIENT_PUBKEY, String THE_INSTRUMENT, String INSTRUMENT_FOR_SENDER) {
    return otapiJNI.OTMadeEasy_send_user_cash_pubkey(swigCPtr, this, SERVER_ID, NYM_ID, RECIPIENT_NYM_ID, RECIPIENT_PUBKEY, THE_INSTRUMENT, INSTRUMENT_FOR_SENDER);
  }

  public String send_user_msg(String SERVER_ID, String NYM_ID, String RECIPIENT_NYM_ID, String THE_MESSAGE) {
    return otapiJNI.OTMadeEasy_send_user_msg(swigCPtr, this, SERVER_ID, NYM_ID, RECIPIENT_NYM_ID, THE_MESSAGE);
  }

  public String send_user_payment(String SERVER_ID, String NYM_ID, String RECIPIENT_NYM_ID, String THE_PAYMENT) {
    return otapiJNI.OTMadeEasy_send_user_payment(swigCPtr, this, SERVER_ID, NYM_ID, RECIPIENT_NYM_ID, THE_PAYMENT);
  }

  public String send_user_cash(String SERVER_ID, String NYM_ID, String RECIPIENT_NYM_ID, String THE_PAYMENT, String SENDERS_COPY) {
    return otapiJNI.OTMadeEasy_send_user_cash(swigCPtr, this, SERVER_ID, NYM_ID, RECIPIENT_NYM_ID, THE_PAYMENT, SENDERS_COPY);
  }

  public boolean withdraw_and_send_cash(String ACCT_ID, String RECIPIENT_NYM_ID, String MEMO, String AMOUNT) {
    return otapiJNI.OTMadeEasy_withdraw_and_send_cash(swigCPtr, this, ACCT_ID, RECIPIENT_NYM_ID, MEMO, AMOUNT);
  }

  public String get_payment_instrument(String SERVER_ID, String NYM_ID, int nIndex) {
    return otapiJNI.OTMadeEasy_get_payment_instrument__SWIG_0(swigCPtr, this, SERVER_ID, NYM_ID, nIndex);
  }

  public String get_payment_instrument(String SERVER_ID, String NYM_ID, int nIndex, String PRELOADED_INBOX) {
    return otapiJNI.OTMadeEasy_get_payment_instrument__SWIG_1(swigCPtr, this, SERVER_ID, NYM_ID, nIndex, PRELOADED_INBOX);
  }

  public String get_box_receipt(String SERVER_ID, String NYM_ID, String ACCT_ID, int nBoxType, String TRANS_NUM) {
    return otapiJNI.OTMadeEasy_get_box_receipt(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, nBoxType, TRANS_NUM);
  }

  public String retrieve_mint(String SERVER_ID, String NYM_ID, String ASSET_ID) {
    return otapiJNI.OTMadeEasy_retrieve_mint(swigCPtr, this, SERVER_ID, NYM_ID, ASSET_ID);
  }

  public String load_or_retrieve_mint(String SERVER_ID, String NYM_ID, String ASSET_ID) {
    return otapiJNI.OTMadeEasy_load_or_retrieve_mint(swigCPtr, this, SERVER_ID, NYM_ID, ASSET_ID);
  }

  public String query_asset_types(String SERVER_ID, String NYM_ID, String ENCODED_MAP) {
    return otapiJNI.OTMadeEasy_query_asset_types(swigCPtr, this, SERVER_ID, NYM_ID, ENCODED_MAP);
  }

  public String create_market_offer(String SERVER_ID, String NYM_ID, String ASSET_ACCT_ID, String CURRENCY_ACCT_ID, String scale, String minIncrement, String quantity, String price, boolean bSelling, String LIFESPAN_IN_SECONDS) {
    return otapiJNI.OTMadeEasy_create_market_offer(swigCPtr, this, SERVER_ID, NYM_ID, ASSET_ACCT_ID, CURRENCY_ACCT_ID, scale, minIncrement, quantity, price, bSelling, LIFESPAN_IN_SECONDS);
  }

  public String kill_market_offer(String SERVER_ID, String NYM_ID, String ASSET_ACCT_ID, String TRANS_NUM) {
    return otapiJNI.OTMadeEasy_kill_market_offer(swigCPtr, this, SERVER_ID, NYM_ID, ASSET_ACCT_ID, TRANS_NUM);
  }

  public String kill_payment_plan(String SERVER_ID, String NYM_ID, String ACCT_ID, String TRANS_NUM) {
    return otapiJNI.OTMadeEasy_kill_payment_plan(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, TRANS_NUM);
  }

  public String cancel_payment_plan(String SERVER_ID, String NYM_ID, String THE_PAYMENT_PLAN) {
    return otapiJNI.OTMadeEasy_cancel_payment_plan(swigCPtr, this, SERVER_ID, NYM_ID, THE_PAYMENT_PLAN);
  }

  public String activate_smart_contract(String SERVER_ID, String NYM_ID, String ACCT_ID, String AGENT_NAME, String THE_SMART_CONTRACT) {
    return otapiJNI.OTMadeEasy_activate_smart_contract(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, AGENT_NAME, THE_SMART_CONTRACT);
  }

  public String trigger_clause(String SERVER_ID, String NYM_ID, String TRANS_NUM, String CLAUSE_NAME, String STR_PARAM) {
    return otapiJNI.OTMadeEasy_trigger_clause(swigCPtr, this, SERVER_ID, NYM_ID, TRANS_NUM, CLAUSE_NAME, STR_PARAM);
  }

  public String withdraw_cash(String SERVER_ID, String NYM_ID, String ACCT_ID, String AMOUNT) {
    return otapiJNI.OTMadeEasy_withdraw_cash(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, AMOUNT);
  }

  public int easy_withdraw_cash(String ACCT_ID, String AMOUNT) {
    return otapiJNI.OTMadeEasy_easy_withdraw_cash(swigCPtr, this, ACCT_ID, AMOUNT);
  }

  public String withdraw_voucher(String SERVER_ID, String NYM_ID, String ACCT_ID, String RECIP_NYM_ID, String STR_MEMO, String AMOUNT) {
    return otapiJNI.OTMadeEasy_withdraw_voucher(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, RECIP_NYM_ID, STR_MEMO, AMOUNT);
  }

  public String pay_dividend(String SERVER_ID, String NYM_ID, String SOURCE_ACCT_ID, String SHARES_ASSET_ID, String STR_MEMO, String AMOUNT_PER_SHARE) {
    return otapiJNI.OTMadeEasy_pay_dividend(swigCPtr, this, SERVER_ID, NYM_ID, SOURCE_ACCT_ID, SHARES_ASSET_ID, STR_MEMO, AMOUNT_PER_SHARE);
  }

  public String deposit_cheque(String SERVER_ID, String NYM_ID, String ACCT_ID, String STR_CHEQUE) {
    return otapiJNI.OTMadeEasy_deposit_cheque(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, STR_CHEQUE);
  }

  public int deposit_cash(String SERVER_ID, String NYM_ID, String ACCT_ID, String STR_PURSE) {
    return otapiJNI.OTMadeEasy_deposit_cash(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, STR_PURSE);
  }

  public int deposit_local_purse(String SERVER_ID, String NYM_ID, String ACCT_ID, String STR_INDICES) {
    return otapiJNI.OTMadeEasy_deposit_local_purse(swigCPtr, this, SERVER_ID, NYM_ID, ACCT_ID, STR_INDICES);
  }

  public String get_market_list(String SERVER_ID, String NYM_ID) {
    return otapiJNI.OTMadeEasy_get_market_list(swigCPtr, this, SERVER_ID, NYM_ID);
  }

  public String get_market_offers(String SERVER_ID, String NYM_ID, String MARKET_ID, String MAX_DEPTH) {
    return otapiJNI.OTMadeEasy_get_market_offers(swigCPtr, this, SERVER_ID, NYM_ID, MARKET_ID, MAX_DEPTH);
  }

  public String get_nym_market_offers(String SERVER_ID, String NYM_ID) {
    return otapiJNI.OTMadeEasy_get_nym_market_offers(swigCPtr, this, SERVER_ID, NYM_ID);
  }

  public String get_market_recent_trades(String SERVER_ID, String NYM_ID, String MARKET_ID) {
    return otapiJNI.OTMadeEasy_get_market_recent_trades(swigCPtr, this, SERVER_ID, NYM_ID, MARKET_ID);
  }

  public String adjust_usage_credits(String SERVER_ID, String USER_NYM_ID, String TARGET_NYM_ID, String ADJUSTMENT) {
    return otapiJNI.OTMadeEasy_adjust_usage_credits(swigCPtr, this, SERVER_ID, USER_NYM_ID, TARGET_NYM_ID, ADJUSTMENT);
  }

  public int VerifyMessageSuccess(String str_Message) {
    return otapiJNI.OTMadeEasy_VerifyMessageSuccess(swigCPtr, this, str_Message);
  }

  public int VerifyMsgBalanceAgrmntSuccess(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String str_Message) {
    return otapiJNI.OTMadeEasy_VerifyMsgBalanceAgrmntSuccess(swigCPtr, this, SERVER_ID, USER_ID, ACCOUNT_ID, str_Message);
  }

  public int VerifyMsgTrnxSuccess(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String str_Message) {
    return otapiJNI.OTMadeEasy_VerifyMsgTrnxSuccess(swigCPtr, this, SERVER_ID, USER_ID, ACCOUNT_ID, str_Message);
  }

  public int InterpretTransactionMsgReply(String SERVER_ID, String USER_ID, String ACCOUNT_ID, String str_Attempt, String str_Response) {
    return otapiJNI.OTMadeEasy_InterpretTransactionMsgReply(swigCPtr, this, SERVER_ID, USER_ID, ACCOUNT_ID, str_Attempt, str_Response);
  }

}
