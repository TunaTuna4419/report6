package jp.ac.uryukyu.ie.e235734;
import java.util.Scanner;

public class AI {

    Scanner scanner = new Scanner(System.in);
    Weather weather = new Weather();
    Greeting greeting = new Greeting();
    public void start(){
        while(true){
            System.out.println("コマンドを入力してください。");
            String command = scanner.next();
            if(command.equals("exit")){
                System.out.println("終了します。さようなら");
                break;
            }else if(command.equals("今日の天気は？")){

            }else if(command.equals("こんにちは")){

            }else{
                System.out.println("err:有効なコマンドを入力してください。");
            }
        }      
    }
}
