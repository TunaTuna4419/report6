package jp.ac.uryukyu.ie.e235734;
/**
 * 取得した名前を用いて挨拶をするクラス
 */
public class Greeting{
    String name;
    Greeting(String name){
        this.name = name;
    }
    /**
     * 取得した名前と文章をSystem.out.println()で出力する。
     */
    public void function(){
        System.out.println("Hi," + name);
    }
}
