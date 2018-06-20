package com.iigeo.find;

import java.util.Arrays;

/**
 * 查找出现次数最多字符的次数
 */
public class FindString {


    private String strings="";
    private int max_lenth=0;
    private String max_str="";

    public FindString(String s){
        this.strings=s;
    }

    public void findMostStr(){
        if (strings!=null){
            while (strings.length()>0){
                int length=strings.length();
                String first=strings.substring(0,1);
                strings=strings.replaceAll(first,"");
                if (length-strings.length()>max_lenth){
                    max_lenth=length-strings.length();
                    max_str=first;
                }
            }

        }
        System.out.println("出现此处最多的字符"+max_str);
        System.out.println("出现次数最多字符的次数"+max_lenth);

    }
}

