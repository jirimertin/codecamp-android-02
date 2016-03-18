package cz.codecamp.android.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        // Pridani fragmentu do Activity, pouzito replace aby se zamezilo vice fragmentu po napriklad otoceni zarizeni
        transaction.replace(R.id.fragmentContainer, new Main2ActivityFragment());
        // Pridani fragmentu do backstacku - kdyz uzivatel da tlacitko zpet, tak se da predchozi fragment, pro pouziti odkomentovat
//        transaction.addToBackStack("bla");
        transaction.commit();

    }

    public void hit() {
        Intent data = new Intent();
        data.putExtra("text", "Hit hit");
        // Nastavime result a odesleme na predchozi activitu
        setResult(Activity.RESULT_OK, data);
        // Ukoncime aktualani activitu
        finish();
    }

}
