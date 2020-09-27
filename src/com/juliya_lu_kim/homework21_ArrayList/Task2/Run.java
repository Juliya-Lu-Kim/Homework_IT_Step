package com.juliya_lu_kim.homework21_ArrayList.Task2;

/*
2)Создать класс Team, который содержит коллекции экземпляров класс Developer.
* Класс Developer содержит коллекцию классов Skill
* Создать класс Project, который содержит экземпляр класса Team.
* Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести их навыки.
 */
public class Run {
    public static void main(String[] args) {
        Project project1 = new Project("Проект 1");
        Project project2 = new Project("Проект 2");
        Project project3 = new Project("Проект 3");


        Team mobileTeam = new Team();
        System.out.println(mobileTeam.workTeam = "Мобильная разработка");
        mobileTeam.teamName = "Команда 1";
        mobileTeam.developer = new Developer[]{
                Developer.DEVELOPER_2,
                Developer.DEVELOPER_3,
                Developer.DEVELOPER_5
        };

        project1.team = new Team[]{mobileTeam};
        System.out.println(mobileTeam.teamName);
        mobileTeam.showDeveloperInTeam();
        System.out.println("Skills team: " + mobileTeam.teamName + ": " + mobileTeam.showDevSkill());
        System.out.println(" ");
////////////////////////
        Team dbTeam = new Team();
        System.out.println(dbTeam.workTeam = "Data Base");
        dbTeam.teamName = "Команда 2";
        dbTeam.developer = new Developer[]{
                Developer.DEVELOPER_1,
                Developer.DEVELOPER_4,
                Developer.DEVELOPER_6
        };

        project1.team = new Team[]{mobileTeam};
        System.out.println(dbTeam.teamName);
        mobileTeam.showDeveloperInTeam();
        System.out.println("Skills team: " + dbTeam.teamName + ": " + dbTeam.showDevSkill());
    }
}
