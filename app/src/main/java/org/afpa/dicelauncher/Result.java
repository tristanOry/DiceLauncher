package org.afpa.dicelauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class Result extends AppCompatActivity {
private TextView tvRes, tvLabel;
private Button btnLaunch;
private int nbFaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        nbFaces=intent.getIntExtra("nbFaces", 6);
        tvRes=findViewById(R.id.textView2);
        tvLabel=findViewById(R.id.textView3);
        launchDice();
    }

    private void launchDice(){
        Random rand=new Random();
        int res=rand.nextInt(nbFaces)+1;
        tvRes.setText(String.valueOf(res));
        tvLabel.setText("Pour un dé à "+String.valueOf(nbFaces)+" faces");
    }

    public void relaunch(View view) {
        launchDice();
    }
}
