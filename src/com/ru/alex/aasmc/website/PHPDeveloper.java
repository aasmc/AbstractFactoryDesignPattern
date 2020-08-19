package com.ru.alex.aasmc.website;

import com.ru.alex.aasmc.Developer;

public class PHPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP dev writes PHP code...");
    }
}
