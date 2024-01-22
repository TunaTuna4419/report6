package jp.ac.uryukyu.ie.e235734;
import java.util.Scanner;
/**
 * 疑似AIにおいて、名前の取得とコマンド入力待ち、退出の処理を行う。
 * 現時点で天気、挨拶、ToDoリスト、コマンド一覧表示を実装済み。
 * 
 * 今後の課題として、実際の天気の取得、アラームなどの機能追加がある。
 * @author 235734J　津波真太郎
 */
public class AI {
    /**
     * 疑似AI起動メソッド。
     * 名前を取得し、その名前を用いて各インスタンスを作成する。
     * 名前取得後は、Exitコマンドが入力されるまでの間永遠にコマンド待ち、コマンド処理を行う。
     */
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Nice to meet you" + name + ".");
        Weather weather = new Weather(name);
        Greeting greeting = new Greeting(name);
        ToDo todo = new ToDo(name);
        Command commands = new Command();
        while(true){
            System.out.println("Enter the command >>>");
            String command = scanner.next();
            if(command.equals("Exit")){
                System.out.println("Shutdown,Good bye.");
                break;
            }else if(command.equals("Weather?")){
                weather.function();
            }else if(command.equals("Hello")){
                greeting.function();
            }else if(command.equals("AddToDo")){
                //テストを実行するため、ここのみ入力方法を変更している。
                System.out.println("ToDo?");
                String addToDo = scanner.next();
                todo.AddToDo(addToDo);
            }else if(command.equals("SeeToDo")){
                todo.SeeToDo();
            }else if(command.equals("RemoveToDo")){
                todo.RemoveToDo();
            }else if(command.equals("ShowMeCommands")){
                commands.function();
            }else if(command.equals("HowManyToDo")){
                todo.size();
            }else{    System.out.println("err:UnidentifiedCommand.");
            }
        }      
        scanner.close();
    }
}
