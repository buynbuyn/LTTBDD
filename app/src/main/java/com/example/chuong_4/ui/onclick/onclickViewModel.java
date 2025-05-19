package com.example.chuong_4.ui.onclick;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class onclickViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public onclickViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
