package com.example.expensetracker;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ContentProviderUser extends Activity {

    SimpleCursorAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider_user);
        querycontentprovider();

    }

    public void querycontentprovider() {

        String[] projection = new String[] {
                MyProviderContract.ID,
                MyProviderContract.DATE,
                MyProviderContract.CATEGORY,
                MyProviderContract.AMOUNT,
        };

        String colsToDisplay [] = new String[] {
                MyProviderContract.ID,
                MyProviderContract.DATE,
                MyProviderContract.CATEGORY,
                MyProviderContract.AMOUNT,
        };

        int[] colResIds = new int[] {
                R.id.value1,
                R.id.value2,
                R.id.value3,
                R.id.value4
        };

        Cursor cursor = getContentResolver().query(MyProviderContract.PEOPLE_URI, projection, null, null, null);

        dataAdapter = new SimpleCursorAdapter(
                this,
                R.layout.db_item_layout,
                cursor,
                colsToDisplay,
                colResIds,
                0);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(dataAdapter);
    }
}
