package com.example.subbu.architecuralcomponenviewmodel.model;

import android.arch.lifecycle.ViewModel;

public class ClickCounterViewModel extends ViewModel {
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
