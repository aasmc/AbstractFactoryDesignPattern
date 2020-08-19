package com.ru.alex.aasmc;

import com.ru.alex.aasmc.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory websiteTeamFactory = new WebsiteTeamFactory();
        Developer developer = websiteTeamFactory.getDeveloper();
        Tester tester = websiteTeamFactory.getTester();
        ProjectManager projectManager = websiteTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }

}
