package com.dchal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private  int id;
    private  MusicPlaeer musicPlaeer;
@Autowired
    public Computer( MusicPlaeer musicPlaeer) {
        this.id = 1;
        this.musicPlaeer = musicPlaeer;
    }

    @Override
    public String toString() {
        return "Computer" + id + musicPlaeer.playMusic();
    }
}
