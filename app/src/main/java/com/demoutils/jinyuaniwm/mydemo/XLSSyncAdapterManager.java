package com.demoutils.jinyuaniwm.mydemo;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Kursulla on 08/09/15.
 */
public class XLSSyncAdapterManager {
    public static final String AUTHORITY = "com.demoutils.jinyuaniwm.mydemo.provider";
    public static final String ACCOUNT_TYPE = "com.demoutils.jinyuaniwm.mydemo";
    public static final String ACCOUNT = "dummyaccount";
    private static Account newAccount;

    public static void init(Context context) {
        newAccount = new Account(ACCOUNT, ACCOUNT_TYPE);
        AccountManager accountManager = (AccountManager) context.getSystemService(Context.ACCOUNT_SERVICE);


        if (accountManager.addAccountExplicitly(newAccount, null, null)) {
            System.out.println("Dodat acc");
            System.out.println("*****************************");
            ContentResolver.setSyncAutomatically(newAccount, AUTHORITY, true);
            ContentResolver.setIsSyncable(newAccount, AUTHORITY, 1);
            ContentResolver.addPeriodicSync(newAccount, AUTHORITY, new Bundle(), 1);
        } else {
            System.out.println("Ili postoji ili je doslo do sranja");
            System.out.println("*****************************");
        }



    }

    public static void forceRefresh() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
        bundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);

        ContentResolver.requestSync(newAccount, AUTHORITY, bundle);
    }
}
