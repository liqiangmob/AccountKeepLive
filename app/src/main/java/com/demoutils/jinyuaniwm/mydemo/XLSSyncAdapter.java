package com.demoutils.jinyuaniwm.mydemo;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

/**
 * The real magic happens here.
 * This is adapter that will be called when system decide it is time to sync data.
 * Created by Kursulla on 07/09/15.
 * LQ
 */
public class XLSSyncAdapter extends AbstractThreadedSyncAdapter {

    public XLSSyncAdapter(Context context, boolean autoInitialize) {
        super(context, autoInitialize);
    }

    @Override
    public void onPerformSync(Account account, Bundle extras, String authority, ContentProviderClient contentProviderClient, SyncResult syncResult) {


        getContext().getContentResolver().notifyChange(XLSStubContentProvider.CONTENT_URI, null, false);


        System.out.println("******* onPerformSync *******");
//        System.out.println("*******" + syncResult.syncAlreadyInProgress+" *******");
        System.out.println("*****************************");

    }

}