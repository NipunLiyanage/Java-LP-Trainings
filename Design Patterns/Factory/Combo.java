package com.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Combo {

    protected List<Food> foods = new ArrayList<>();

    protected abstract void createCombo();

    @Override
    public String toString() {
        return "Combo{" +
                "foods=" + foods +
                '}';
    }
}
