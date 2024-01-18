package jp.ac.uryukyu.ie.e235734;
/**
 * 現在実行可能なコマンドを表示
 */
public class Command {
    String[] commands = {"Exit","Weather?","Hello","AddToDo","RemoveToDo","SeeToDo","ShowMeCommands"};
    /**
     * 現在実行可能なコマンドをFor文を利用して一覧表示する。
     */
    public void function(){
        System.out.println("I will show you available commands.");
        for(int i = 0;i <= 5;i++){
            System.out.println(commands[i]);
        }
    }
}