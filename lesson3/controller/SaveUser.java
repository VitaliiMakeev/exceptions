package org.example.homeWork.lesson3.controller;

import org.example.homeWork.lesson3.moduls.NoFolder;
import org.example.homeWork.lesson3.moduls.User;

public interface SaveUser {
    String saveUser(User user) throws NoFolder;
}
