package com.codegym.controller;

import com.codegym.model.Clazz;

import java.util.ArrayList;
import java.util.List;

public class ClazzManagement implements GeneralManagement<Clazz>, ReadFile<Clazz>, WriteFile<Clazz> {
    private List<Clazz> clazzes = new ArrayList<>();

    @Override
    public void displayAll() {

    }

    @Override
    public void addNew(Clazz clazz) {

    }

    @Override
    public void updateById(String id, Clazz clazz) {

    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public Clazz getById(String id) {
        return null;
    }

    @Override
    public List<Clazz> readFile(String path) {
        return null;
    }

    @Override
    public void writeFile(List<Clazz> elements) {

    }
}
