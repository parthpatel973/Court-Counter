package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    Button point3_A, point2_A, freeScore_A;
    Button point3_B, point2_B, freeScore_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        point3_A = findViewById(R.id.point_3_A);
        point2_A = findViewById(R.id.point_2_A);
        freeScore_A = findViewById(R.id.free_score_A);

        point3_B = findViewById(R.id.point_3_B);
        point2_B = findViewById(R.id.point_2_B);
        freeScore_B = findViewById(R.id.free_score_B);

        setPoint_3_A();
        setPoint_2_A();
        setFreeScoreA();

        setPoint_3_B();
        setPoint_2_B();
        setFreeScoreB();
    }

    private void setPoint_2_A() {
        point2_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 2;
                displayScore(scoreTeamA);
            }
        });
    }

    private void setPoint_3_A() {
        point3_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 3;
                displayScore(scoreTeamA);
            }
        });
    }

    private void setFreeScoreA() {
        freeScore_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 1;
                displayScore(scoreTeamA);
            }
        });
    }


    private void displayScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void setPoint_2_B() {
        point2_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 2;
                displayScoreB(scoreTeamB);
            }
        });
    }

    private void setPoint_3_B() {
        point3_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 3;
                displayScoreB(scoreTeamB);
            }
        });
    }

    private void setFreeScoreB() {
        freeScore_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 1;
                displayScoreB(scoreTeamB);
            }
        });
    }

    private void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScore(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}