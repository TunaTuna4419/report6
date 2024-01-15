package jp.ac.uryukyu.ie.e235734;
import java.util.Random;

public class Weather{
    String name;
    String[] weathers = {"晴れ","曇り","雨"};
    Random rand = new Random();
    Weather(String name){
        this.name = name;
    }
    public void function(){
        int num = rand.nextInt(3);
        System.out.println(name + "さん、今日の天気は" + weathers[num] + "です。");
    }
}
