package cz.codecamp.android.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int ACTIVITY_2_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnter = (Button) findViewById(R.id.btn_enter);
        // Nastavime akci na stisk tlacitka
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent, ktery rika ze odtud spustit activity Main2Activity
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                // Spustime forResult aby nam prisel vysledek do onActivityResult() metody
                startActivityForResult(intent, ACTIVITY_2_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Zkontrolujeme jestli je result v poradku a jestli se jedna o nasi activity
        if (resultCode == RESULT_OK && requestCode == ACTIVITY_2_REQUEST) {
            // Nastavime prichozi text do txtGreet
            final TextView txtGreet = (TextView) findViewById(R.id.txt_greet);
            txtGreet.setText(data.getStringExtra("text"));
        }
    }
}
