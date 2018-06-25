package com.iigeo.designpattern.adapter;

/**
 * 被适配对象
 */
public class ExsitPlayer {

    public void palyMp3(String fileName){
        System.out.println("paly MP3"+fileName);
    }

    public void playWma(String fileName){
        System.out.println("play Wma"+fileName);
    }
}
