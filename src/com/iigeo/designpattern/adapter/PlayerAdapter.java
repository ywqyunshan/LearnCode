package com.iigeo.designpattern.adapter;

/**
 * 适配器适合用于解决新旧系统（或新旧接口）之间的兼容问题，而不建议在一开始就直接使用
 * 适配器
 */
public class PlayerAdapter implements MusicPlayer{

    private ExsitPlayer exsitPlayer;

    public PlayerAdapter(ExsitPlayer exsitPlayer) {
        this.exsitPlayer = exsitPlayer;
    }


    @Override
    public void play(String type, String filename) {
        if (type.equals("MP3")){
            exsitPlayer.palyMp3(filename);
        }else if (type.equals("wma")){
            exsitPlayer.playWma(filename);
        }
    }
}
