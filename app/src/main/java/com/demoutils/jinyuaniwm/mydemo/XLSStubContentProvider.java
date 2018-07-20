package com.demoutils.jinyuaniwm.mydemo;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/**
 * Stub content provider. We will not use ContentProvider, but it is mandatory for having XLSSyncAdapter in the app.
 * <p>
 * Created by Kursulla on 08/09/15.
 * LQ
 */
public class XLSStubContentProvider extends ContentProvider {

    public static final String AUTHORITY = "com.demoutils.jinyuaniwm.mydemo.provider";
    public static final String CONTENT_URI_BASE = "content://" + AUTHORITY;
    public static final String TABLE_NAME = "data";
    public static final Uri CONTENT_URI = Uri.parse(CONTENT_URI_BASE + "/" + TABLE_NAME);


    @Override
    public boolean onCreate() {
        return true;
    }

    @Override
    public Cursor query(Uri uri, String[] columns, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }

}
