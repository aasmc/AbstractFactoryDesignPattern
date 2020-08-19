package com.ru.alex.aasmc.banking;

import com.ru.alex.aasmc.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project");
    }
}
