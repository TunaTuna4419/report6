package jp.ac.uryukyu.ie.e235734;
import java.util.Scanner;

public class AI {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("はじめまして。名前を教えて下さい。");
        String name = scanner.next();
        System.out.println("よろしく" + name + "さん");
        Weather weather = new Weather(name);
        Greeting greeting = new Greeting(name);
        ToDo todo = new ToDo(name);

        while(true){
            System.out.println("コマンドを入力してください。");
            String command = scanner.next();
            if(command.equals("exit")){
                System.out.println("終了します。さようなら");
                break;
            }else if(command.equals("今日の天気は？")){
                weather.function();
            }else if(command.equals("こんにちは")){
                greeting.function();
            }else{
                System.out.println("err:有効なコマンドを入力してください。");
            }
        }      
    }
}
