package com.bignerdranch.android.geoquiz;

/**
 * Created by Ray on 2016/2/19.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueAnswer;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueAnswer() {
        return mTrueAnswer;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        mTrueAnswer = trueAnswer;
    }

    public TrueFalse(int mQuestion, boolean mTrueQuestion) {
        this.mQuestion = mQuestion;
        this.mTrueAnswer = mTrueQuestion;
    }

}
