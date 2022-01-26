package com.codegym.controller;

import java.util.List;

public interface ReadFile<T> {//Generic

    List<T> readFile(String path);
}
