package com.ru.alex.aasmc.website;

import com.ru.alex.aasmc.Developer;
import com.ru.alex.aasmc.ProjectManager;
import com.ru.alex.aasmc.ProjectTeamFactory;
import com.ru.alex.aasmc.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
