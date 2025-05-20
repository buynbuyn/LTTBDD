package com.example.chuong_4.ui.lbsk;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class lbskViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public lbskViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to lbsk Fragment!");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setText(String text) {
        mText.setValue(text);
    }
}