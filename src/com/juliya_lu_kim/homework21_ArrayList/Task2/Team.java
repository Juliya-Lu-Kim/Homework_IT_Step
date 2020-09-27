package com.juliya_lu_kim.homework21_ArrayList.Task2;

/*
Создать класс Team, который содержит коллекции экземпляров класс Developer.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Team {

    // коллекция экземпляров класса Developer
    Developer[] developer;
    String teamName; // название команды
    String workTeam; // работа команды

    // конструкторы класса
    public Team(Developer[] developer) {
        this.developer = developer;
    }

    public Team() {
    }

    public Team(String names, Developer[] developer, String workTeam) {
        teamName = names;
        this.developer = developer;
        this.workTeam = workTeam;
    }

    // геттеры и сеттеры класаа

    public Developer[] getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer[] developer) {
        this.developer = developer;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getWorkTeam() {
        return workTeam;
    }

    public void setWorkTeam(String workTeam) {
        this.workTeam = workTeam;
    }


    // вывод информации на консоль
    @Override
    public String toString() {
        return "Команда: " + teamName + "Проект команды: " + workTeam +
                "Разработчики команды: " + Arrays.toString(developer) +
                "Квалификация: " + showDevSkill();
    }

    // методы класса

    // метод для вывода навыков разработчиков команды
    public ArrayList showDevSkill() {
        ArrayList<String> skillTeam = new ArrayList<>();
        for (Developer dev : developer) {
            skillTeam.add(Arrays.toString(dev.getSkill()));
        }
        return skillTeam;
    }

    // метод для вывода состава команды разработчиков
    public void showDeveloperInTeam(){
        System.out.println("Участники команды: " );
        for (Developer dev : developer) {
            System.out.println(dev + "; ");
        }
    }


}
