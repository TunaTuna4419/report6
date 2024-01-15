package jp.ac.uryukyu.ie.e235734;
import java.util.Scanner;

public class AI {
    Scanner scanner = new Scanner(System.in);
    Weather weather = new Weather();
    Greeting greeting = new Greeting();
    public void start(){
        System.out.println("コマンドを入力してください。");
        String command = scanner.next();
        System.out.println("コマンドは"+ command + "です。");
    }
}
