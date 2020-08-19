package com.ru.alex.aasmc.banking;

import com.ru.alex.aasmc.Developer;
import com.ru.alex.aasmc.ProjectManager;
import com.ru.alex.aasmc.ProjectTeamFactory;
import com.ru.alex.aasmc.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QRTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
