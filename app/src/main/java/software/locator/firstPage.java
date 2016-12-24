package software.locator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class firstPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button signInButton;
    private EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


        Spinner dropdown = (Spinner) findViewById(R.id.permiChoose);
        String[] items = new String[]{"User", "Technician"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(this);


        signInButton = (Button) findViewById(R.id.SignInBtn);
        userName = (EditText) findViewById(R.id.userNameEt);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {
      //  Toast.makeText(this,userName.getText().toString(),Toast.LENGTH_LONG);
        System.out.println(parent.getItemAtPosition(pos) );
        System.out.println("what it enterd:   "+userName.getText().toString());
        if (parent.getItemAtPosition(pos).equals("Technician") && userName.getText().toString().equals("Technician")) {

            signInButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(firstPage.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        }
         else if(parent.getItemAtPosition(pos).equals("User")){
            signInButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(firstPage.this,clientMainActivity.class);
                    intent.putExtra("name",userName.getText().toString());
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

