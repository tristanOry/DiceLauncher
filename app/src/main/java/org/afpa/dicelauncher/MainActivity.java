package org.afpa.dicelauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static org.afpa.dicelauncher.R.array.valeurs_d;

public class MainActivity extends AppCompatActivity {
    Spinner choix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choix=findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> listeD=ArrayAdapter.createFromResource(this, valeurs_d,android.R.layout.simple_spinner_item);
        listeD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        choix.setAdapter(listeD);
    }


    public void launchDice(View view) {
        int nbFaces=Integer.parseInt(choix.getSelectedItem().toString());
        Intent intent=new Intent(this,Result.class);
        intent.putExtra("nbFaces",nbFaces);
        startActivity(intent);
    }
}
