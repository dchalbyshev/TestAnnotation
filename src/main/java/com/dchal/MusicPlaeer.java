package com.dchal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlaeer {
private  ClassicalMusic classicalMusic;
private RockMusic rockMusic;
    @Autowired
    public MusicPlaeer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }
/*    public MusicPlaeer(Music music) {
        this.music = music;
    }*/
  /* @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }*/

    public  String  playMusic(){
        return  classicalMusic.getSong();


    }
}
