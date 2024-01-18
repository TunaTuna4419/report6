package jp.ac.uryukyu.ie.e235734;

public class Command {
    String[] commands = {"Exit","Weather?","Hello","AddToDo","RemoveToDo","SeeToDo","ShowMeCommands"};
    public void function(){
        System.out.println("I will show you available commands.");
        for(int i = 0;i <= 5;i++){
            System.out.println(commands[i]);
        }
    }
}