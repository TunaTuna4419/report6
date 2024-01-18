package jp.ac.uryukyu.ie.e235734;
import java.util.Random;
/**
 * 天気を聞かれると、架空の天気を返す。
 * 那覇の天気を取得したかったが、実装ができなかったため、ランダムで天気を出力するコードに変更。
 */
public class Weather{
    String name;
    String[] weathers = {"Sunny","Cloudy","Rainy"};
    Random rand = new Random();
    Weather(String name){
        this.name = name;
    }
    /**
     * 天気をString[]型のweathersに保存しておき、ランダムに選ばれた数字を用いて天気を出力する。
     */
    public void function(){
        int num = rand.nextInt(3);
        System.out.println("It's" + weathers[num] + "," + name+ ".");
    }
}