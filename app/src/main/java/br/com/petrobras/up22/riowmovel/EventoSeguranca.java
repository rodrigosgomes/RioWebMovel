package br.com.petrobras.up22.riowmovel;

/**
 * Created by admin on 24-06-2016.
 */
class EventoSeguranca {

    //Default Translation for the words
    private String mDefaultTranslation;

    //Miwok Translation for the words
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    // constructor for the new word object
    EventoSeguranca(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // constructor for the new word object with image Resource id
    EventoSeguranca(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //get the default Translation
    String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //get the miwok Translation
    String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get the image resource Id
    int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
