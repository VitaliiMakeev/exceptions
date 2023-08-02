package org.example.homeWork.lesson3;

import org.example.homeWork.lesson3.controller.CheckUser;
import org.example.homeWork.lesson3.controller.ChekUser;
import org.example.homeWork.lesson3.controller.SaveUsser;
import org.example.homeWork.lesson3.moduls.NoFolder;
import org.example.homeWork.lesson3.moduls.NumberException;
import org.example.homeWork.lesson3.moduls.User;
import org.example.homeWork.lesson3.view.View;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {
    public static void main(String[] args) throws NoFolder {
        View view = new View();
        view.start();

    }
}