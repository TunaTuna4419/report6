package jp.ac.uryukyu.ie.e235734;

public class Weather{
    String name;
    Weather(String name){
        this.name = name;
    }
    public void function(){
        System.out.println(name + "さん、今日の天気は〇〇です。");
    }
}
