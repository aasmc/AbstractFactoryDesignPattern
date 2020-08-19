package com.ru.alex.aasmc.website;

import com.ru.alex.aasmc.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website Project");
    }
}
