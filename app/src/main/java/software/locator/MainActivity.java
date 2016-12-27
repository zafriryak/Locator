package software.locator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;



public class MainActivity extends AppCompatActivity  {

    Button B1;
    Button B2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        B1=(Button)findViewById(R.id.tec_button);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B1click();
            }
        });
        B2=(Button)findViewById(R.id.tec_button_ble);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B2click();
            }
        });
/*
        dbBle d1 = new dbBle("22:22:78:13:79:60","32.494707, 35.491071");
        dbBle d2 = new dbBle("FC:F1:52:2B:0D:76","31.897443, 34.815009");
        dbBle d3 = new dbBle("00:1F:81:34:0C:E9","32.105296, 35.204931");
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("BLEdb").push().setValue(d1);
        mDatabase.child("BLEdb").push().setValue(d2);
        mDatabase.child("BLEdb").push().setValue(d3);
*/
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void B1click()
    {
        Intent intent = new Intent(this, tecMap.class);
        intent.putExtra("from","");
        intent.putExtra("mac","");
        startActivity(intent);
    }

    public void B2click()
    {
        Intent intent = new Intent(this, ListActivity.class);
        intent.putExtra("prem","Tech");
        startActivity(intent);
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

}

