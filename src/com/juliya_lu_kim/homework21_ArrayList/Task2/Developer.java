package com.juliya_lu_kim.homework21_ArrayList.Task2;

/*
Класс Developer содержит коллекцию классов Skill
 */

public enum  Developer {

    DEVELOPER_1(new Skill[]{Skill.JAVA, Skill.DATABASE, Skill.MYSQL}),
    DEVELOPER_2(new Skill[]{Skill.ANDROID, Skill.QA, Skill.JAVA}),
    DEVELOPER_3(new Skill[]{Skill.REACT, Skill.JAVA, Skill.ANDROID}),
    DEVELOPER_4(new Skill[]{Skill.QA, Skill.DATABASE, Skill.PYTHON}),
    DEVELOPER_5(new Skill[]{Skill.JAVA, Skill.ANDROID, Skill.MYSQL}),
    DEVELOPER_6(new Skill[]{Skill.REACT, Skill.DATABASE, Skill.PYTHON}),
    DEVELOPER_7(new Skill[]{Skill.QA, Skill.REACT, Skill.MYSQL}),
    DEVELOPER_8(new Skill[]{Skill.PYTHON, Skill.DATABASE, Skill.WORDPRESS}),
    DEVELOPER_9(new Skill[]{Skill.WORDPRESS, Skill.DATABASE, Skill.MYSQL});


    Skill [] skill;


    Developer(Skill[] skill){
        this.skill = skill;
    }

    public Skill[] getSkill(){
        return skill;
    }

}
