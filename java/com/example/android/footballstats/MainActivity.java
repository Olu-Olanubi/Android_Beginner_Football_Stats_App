package com.example.android.footballstats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA, foulTeamA, cornerTeamA, FreeKickTeamA, yellowCardTeamA, redCardTeamA = 0;
    int scoreTeamB, foulTeamB, cornerTeamB, FreeKickTeamB, yellowCardTeamB, redCardTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayTeamAScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addOneToTeamAScore(View v){
            scoreTeamA = scoreTeamA+1;
            displayTeamAScore(scoreTeamA);
    }
    public void teamAFouls(View v){
        foulTeamA = foulTeamA+1;
        displayTeamAFoul(foulTeamA);
    }
    public void displayTeamAFoul(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void teamACorner(View v){
        cornerTeamA = cornerTeamA+1;
        displayTeamACorner(cornerTeamA);
    }
    public void displayTeamACorner(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(score));
    }
    public void teamAFreeKick(View v){
        FreeKickTeamA = FreeKickTeamA+1;
        displayTeamAFreeKick(FreeKickTeamA);
    }
    public void displayTeamAFreeKick(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_freekick);
        scoreView.setText(String.valueOf(score));
    }
    public void teamAYellowCard(View v){

        yellowCardTeamA = yellowCardTeamA+1;
        displayTeamAyellowCard(yellowCardTeamA);
    }
    public void displayTeamAyellowCard(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowCard);
        scoreView.setText(String.valueOf(score));
    }
    public void teamARedCard(View v){

        redCardTeamA = redCardTeamA+1;
        displayTeamARedCard(redCardTeamA);
    }
    public void displayTeamARedCard(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_redCard);
        scoreView.setText(String.valueOf(score));
    }



    public void displayTeamBScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addOneToTeamBScore(View v){

        scoreTeamB = scoreTeamB+1;
        displayTeamBScore(scoreTeamB);
    }
    public void teamBFouls(View v){

        foulTeamB = foulTeamB+1;
        displayTeamBFoul(foulTeamB);
    }
    public void displayTeamBFoul(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBCorner(View v){

        cornerTeamB = cornerTeamB+1;
        displayTeamBCorner(cornerTeamB);
    }
    public void displayTeamBCorner(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBFreeKick(View v){

        FreeKickTeamB = FreeKickTeamB+1;
        displayTeamBFreeKick(FreeKickTeamB);
    }
    public void displayTeamBFreeKick(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_freekick);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBYellowCard(View v){

        yellowCardTeamB = yellowCardTeamB+1;
        displayTeamByellowCard(yellowCardTeamB);
    }
    public void displayTeamByellowCard(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowCard);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBRedCard(View v){

        redCardTeamB = redCardTeamB+1;
        displayTeamBRedCard(redCardTeamB);
    }
    public void displayTeamBRedCard(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_redCard);
        scoreView.setText(String.valueOf(score));
    }



    public void reset(View v){
        scoreTeamA = 0;
        foulTeamA = 0;
        cornerTeamA = 0;
        FreeKickTeamA = 0;
        yellowCardTeamA = 0;
        redCardTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        cornerTeamB = 0;
        FreeKickTeamB = 0;
        yellowCardTeamB = 0;
        redCardTeamB = 0;

        displayTeamBRedCard(redCardTeamB);
        displayTeamByellowCard(yellowCardTeamB);
        displayTeamBFreeKick(FreeKickTeamB);
        displayTeamBCorner(cornerTeamB);
        displayTeamBFoul(foulTeamB);
        displayTeamBScore(scoreTeamB);

        displayTeamARedCard(redCardTeamA);
        displayTeamAyellowCard(yellowCardTeamA);
        displayTeamAFreeKick(FreeKickTeamA);
        displayTeamACorner(cornerTeamA);
        displayTeamAFoul(foulTeamA);
        displayTeamAScore(scoreTeamA);

    }
}
