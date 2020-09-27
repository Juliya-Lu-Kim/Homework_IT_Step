package com.juliya_lu_kim.homework21_ArrayList.Task2;

/*
Создать класс Project, который содержит экземпляр класса Team.
 */

public class Project {
    // коллекция экземпляров класса Team
    Team[] team; // команда разработчиков
    String projectTeam; // название проекта

    // конструкторы класса
    public Project(Team[] team, String projectTeam) {
        this.team = team;
        this.projectTeam = projectTeam;
    }

    public Project(String projectTeam){
        this.projectTeam = projectTeam;
    }

    // геттеры и сеттеры класса
    public Team [] getTeam(){
        return team;
    }

    public void setTeam (Team [] team){
        this.team = team;
    }

    public String getProjectTeam(){
        return projectTeam;
    }

    public void setProjectTeam(){
        this.projectTeam = projectTeam;
    }

    // методы класса

    public void Print(){
        System.out.println("Проект команды: " + projectTeam + "Команда разработчиков: ");
        teamDevelopers();
        System.out.println("Навыки участников команды: ");
        teamSkillsDev();
    }

    public void teamDevelopers(){
        for (Team team1: team) {
            System.out.println("Команда: " + team1.teamName);
            team1.showDeveloperInTeam();
        }
    }

    public void teamSkillsDev(){
        for (Team team1 : team) {
            System.out.println(team1.teamName + ": " + team1.showDevSkill());
        }
    }

}
