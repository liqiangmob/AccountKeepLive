package com.demoutils.jinyuaniwm.mydemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Service that do "background work" for authenticating user for XLSSyncAdapter
 *
 * Created by Kursulla on 07/09/15.
 * LQ
 */
public class XLSStubAuthenticatorService extends Service {
    private XLSStubAuthenticator authenticator;

    @Override
    public void onCreate() {
        authenticator = new XLSStubAuthenticator(this);
    }

    /*
    * When the system binds to this Service to make the RPC call
    * return the authenticator’s IBinder.
    */
    @Override
    public IBinder onBind(Intent intent) {
        return authenticator.getIBinder();
    }
}
