package com.dchal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    /*Music music = context.getBean("musicBean",Music.class);
    MusicPlaeer mp = new MusicPlaeer(music);
    Music music1 = context.getBean("classicalMusic",Music.class);
    MusicPlaeer mp2 = new MusicPlaeer(music1);
    mp2.playMusic();
    mp.playMusic();*/

     //  MusicPlaeer mp =  context.getBean("musicPlaeer",MusicPlaeer.class);
       //  mp.playMusic();
   Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();

    }


}
