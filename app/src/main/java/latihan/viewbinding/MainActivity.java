package latihan.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import latihan.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainBinding.btnPlusA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = scoreA+1;
                mainBinding.scoreA.setText(String.valueOf(scoreA));
            }
        });

        mainBinding.btnMinusA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (scoreA > 0){
                    scoreA = scoreA-1;
                    mainBinding.scoreA.setText(String.valueOf(scoreA));
                }


            }
        });

        mainBinding.btnPlusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB = scoreB+1;
                mainBinding.scoreB.setText(String.valueOf(scoreB));
            }
        });

        mainBinding.btnMinusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (scoreB > 0){
                    scoreB = scoreB-1;
                    mainBinding.scoreB.setText(String.valueOf(scoreB));
                }

            }
        });


        mainBinding.btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA = 0;
                scoreB = 0;
                mainBinding.scoreA.setText(String.valueOf(scoreA));
                mainBinding.scoreB.setText(String.valueOf(scoreB));
            }
        });
    }

}