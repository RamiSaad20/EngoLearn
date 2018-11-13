package com.example.engolearn;

public class Word {
    private String mEnglishWord;
    private String mArabicWord;



    public Word (String englishWord , String arabicWord){
        mEnglishWord = englishWord;
        mArabicWord = arabicWord;
    }


    public String getmArabicWord() {
        return mArabicWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }


}
