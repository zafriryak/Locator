package software.locator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clientMainActivity extends AppCompatActivity {


    Button B1;
    Button B2;
    Button B3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_main);

        B1 = (Button) findViewById(R.id.gps_button);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B1click();
            }
        });
        B2 = (Button) findViewById(R.id.ble_button);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B2click();
            }
        });
        B3 = (Button) findViewById(R.id.qr_button);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                B3click();
            }
        });
    }



    public void B1click() {
        Bundle bundle=getIntent().getExtras();
        String name = bundle.getString("name");
        Intent intent = new Intent(this, gpsActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }

    public void B2click() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void B3click() {

        Intent intent = new Intent(this, qrActivity.class);
        startActivity(intent);
    }


}
