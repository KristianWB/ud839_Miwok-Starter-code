package com.example.android.miwok;

public class Word {

    //Default translation of the word
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation)  {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Getting the default translation
    public String getDefaultTranslation()   {
        return mDefaultTranslation;
    }

    //Getting the Miwok translation
    public String getMiwokTranslation()  {
        return mMiwokTranslation;
    }
}
