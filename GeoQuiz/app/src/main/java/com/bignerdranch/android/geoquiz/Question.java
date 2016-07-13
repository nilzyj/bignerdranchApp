package com.bignerdranch.android.geoquiz;

/**
 * Created by Administrator on 2016/7/13.
 */
public class Question {
    private int mTextResId;//问题文本,用于保存地理知识问题字符串的资源ID
    private boolean mAnswerTrue;//问题答案

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }
}
