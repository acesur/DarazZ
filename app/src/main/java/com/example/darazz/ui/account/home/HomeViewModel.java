package com.example.darazz.ui.account.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    private HomeViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is Home Fragment");
    }
    public LiveData<String> getText(){
        return mText;
    }
}
