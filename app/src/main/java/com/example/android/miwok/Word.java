package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;
    private int mImageResaurceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Word(String defaulttranslation,String miwoktranslation, int audioresourceid)
    {
        mDefaultTranslation=defaulttranslation;
        mMiwokTranslation=miwoktranslation;
        mAudioResourceId=audioresourceid;
    }

    public Word(String defaulttranslation,String miwoktranslation,int imageresaurceid ,int audioresourceid)

    {
        mDefaultTranslation=defaulttranslation;
        mMiwokTranslation=miwoktranslation;
        mImageResaurceId=imageresaurceid;
        mAudioResourceId=audioresourceid;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslationTranslation()
    {
        return mMiwokTranslation;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }


    public int getmImageResaurceId()
    {
        return mImageResaurceId;
    }
    public boolean hasImage()
    {
        return mImageResaurceId!=NO_IMAGE_PROVIDED;
    }
}
