package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MCQMain extends AppCompatActivity {
    public QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    public TextView mScoreView;
    public TextView mQuestionView;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public Button mButtonChoice4;


    public String mAnswer;
    public int mScore = 0;
    public int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_c_q_main);
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer){
                    Toast.makeText(MCQMain.this,"Correct",Toast.LENGTH_SHORT).show();


                    mScore++;
                    updateScore(mScore);

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{


                        updateQuestion();


                    }
                }
                else{
                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{
                        Toast.makeText(MCQMain.this,"Wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();


                    }









                }
            }
        });



        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice2.getText() == mAnswer){
                    Toast.makeText(MCQMain.this,"Correct",Toast.LENGTH_SHORT).show();

                    mScore++;
                    updateScore(mScore);

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{


                        updateQuestion();


                    }
                }
                else{

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{
                        Toast.makeText(MCQMain.this,"Wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();


                    }









                }


            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer){
                    Toast.makeText(MCQMain.this,"Correct",Toast.LENGTH_SHORT).show();

                    mScore++;
                    updateScore(mScore);

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{


                        updateQuestion();


                    }
                }
                else{

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{
                        Toast.makeText(MCQMain.this,"Wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();


                    }









                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonChoice4.getText() == mAnswer){
                    Toast.makeText(MCQMain.this,"Correct",Toast.LENGTH_SHORT).show();

                    mScore++;
                    updateScore(mScore);

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{


                        updateQuestion();


                    }
                }
                else{

                    if(mQuestionNumber==QuestionLibrary.mQuestions.length) {
                        Intent i = new Intent(MCQMain.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("finalScore",mScore);
                        i.putExtras(bundle);
                        MCQMain.this.finish();
                        startActivity(i);


                    }
                    else{
                        Toast.makeText(MCQMain.this,"Wrong",Toast.LENGTH_SHORT).show();
                        updateQuestion();


                    }









                }
            }
        });






    }

    public void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }






    public void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}