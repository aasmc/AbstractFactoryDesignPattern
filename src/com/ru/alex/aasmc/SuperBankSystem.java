package com.ru.alex.aasmc;

import com.ru.alex.aasmc.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory bankingTeamFactory = new BankingTeamFactory();
        Developer developer = bankingTeamFactory.getDeveloper();
        Tester tester = bankingTeamFactory.getTester();
        ProjectManager projectManager = bankingTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
