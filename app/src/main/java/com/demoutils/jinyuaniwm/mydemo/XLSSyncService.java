package com.demoutils.jinyuaniwm.mydemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Service that keeps running XLSSyncAdapter in background.
 * <p/>
 * Created by Kursulla on 07/09/15.
 * LQ
 */
public class XLSSyncService extends Service {
    private static XLSSyncAdapter syncAdapter = null;
    // Object to use as a thread-safe lock
    private static final Object syncAdapterLock = new Object();

    @Override
    public void onCreate() {
        super.onCreate();
    /*
     * Create the sync adapter as a singleton.
     * Set the sync adapter as syncable
     * Disallow parallel syncs
     */
        synchronized (syncAdapterLock) {
            if (syncAdapter == null) {
                syncAdapter = new XLSSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    /**
     * Return an object that allows the system to invoke the sync adapter.
     */
    @Override
    public IBinder onBind(Intent intent) {
    /*
     * Get the object that allows external processes
     * to call onPerformSync(). The object is created
     * in the base class code when the XLSSyncAdapter
     * constructors call super()
     */
        return syncAdapter.getSyncAdapterBinder();
    }
}
