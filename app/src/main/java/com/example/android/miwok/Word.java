package com.example.android.miwok;

public class Word {

    //Default translation of the word
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    //ImageId declaration
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation)  {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId)  {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Getting the default translation
    public String getDefaultTranslation()   {
        return mDefaultTranslation;
    }

    //Getting the Miwok translation
    public String getMiwokTranslation()  {
        return mMiwokTranslation;
    }

    //Getting the Image id
    public int getImageResourceId()   { return mImageResourceId; }

    public boolean hasImage()   {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
