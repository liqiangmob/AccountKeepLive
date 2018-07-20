package com.demoutils.jinyuaniwm.mydemo;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/**
 * We will not use Accounts in the app, but we need to have Authenticator implementation in order to use XLSSyncAdapter concept.
 * <p>
 * Created by Kursulla on 07/09/15.
 */
public class XLSStubAuthenticator extends AbstractAccountAuthenticator {
    private Context context;

    private AccountManager accountManager;

    public XLSStubAuthenticator(Context context) {
        super(context);
        this.context = context;
        accountManager = AccountManager.get(context);
    }


    @Override
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse,
                                 String s) {

        throw new UnsupportedOperationException();
    }

    @Override
    public Bundle addAccount(AccountAuthenticatorResponse response, String accountType, String authTokenType, String[] requiredFeatures, Bundle options) throws NetworkErrorException {
        return null;
    }

//    @Override
//    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String s,
//                             String s2, String[] strings, Bundle options) throws NetworkErrorException {
//
////        final Bundle bundle = new Bundle();
////        final Intent intent = new Intent(context, MainActivity.class);
////        intent.putExtra(AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE, accountAuthenticatorResponse);
////        bundle.putParcelable(AccountManager.KEY_INTENT, intent);
////        return bundle;
//    }

    @Override
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse,
                                     Account account, Bundle bundle) throws NetworkErrorException {

        return null;
    }

    @Override
    public Bundle getAuthToken(AccountAuthenticatorResponse response, Account account, String authTokenType, Bundle options) throws NetworkErrorException {
        return null;
    }
//
//    @Override
//    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse,
//                               Account account, String s, Bundle options) throws NetworkErrorException {
//
//        String authToken = accountManager.peekAuthToken(account, XLSSyncAdapterManager.ACCOUNT_TYPE);
//        if (TextUtils.isEmpty(authToken)) {
//            final String password = accountManager.getPassword(account);
//            if (password != null) {
//                authToken = account.name + password;
//            }
//        }
//        final Bundle bundle = new Bundle();
//        if (!TextUtils.isEmpty(authToken)) {
//            bundle.putString(AccountManager.KEY_ACCOUNT_NAME, account.name);
//            bundle.putString(AccountManager.KEY_ACCOUNT_TYPE, account.type);
//            bundle.putString(AccountManager.KEY_AUTHTOKEN, authToken);
//            return bundle;
//        }
//        final Intent intent = new Intent(context, MainActivity.class);
//        intent.putExtra(AccountManager.KEY_ACCOUNT_AUTHENTICATOR_RESPONSE, accountAuthenticatorResponse);
//        intent.putExtra(XLSSyncAdapterManager.ACCOUNT, account.name);
//        bundle.putParcelable(AccountManager.KEY_INTENT, intent);
//        return bundle;
//    }

    @Override
    public String getAuthTokenLabel(String s) {
        return null;
    }

    @Override
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse,
                                    Account account, String s, Bundle bundle) throws NetworkErrorException {

        return null;
    }

    @Override
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse,
                              Account account, String[] strings) throws NetworkErrorException {

        return null;
    }
}