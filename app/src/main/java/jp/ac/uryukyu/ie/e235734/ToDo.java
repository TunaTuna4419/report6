package jp.ac.uryukyu.ie.e235734;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * ToDoリストの追加、削除、参照をするクラス。
 */
public class ToDo {
    Scanner scanner = new Scanner(System.in);
    int amount = 0;
    String name;
    ArrayList<String> todos = new ArrayList<String>();
    ToDo(String name){
        this.name = name;
    }
    /**
     * ToDoを追加する。scannerによって使用者からToDoを受け取り、ArrayListに順次追加していく。
     */
    public void AddToDo(){
        System.out.println("ToDo?");
        String addToDo = scanner.next();
        todos.add(addToDo);
        amount += 1;
        System.out.println("ToDo[" + addToDo + "]was added.");
    }
    /**
     * 上記のAddToDo()とは逆に、すでに追加されているToDoを削除する。
     * もし保存されていないToDoを入力された場合は、"There is no ToDo"というエラーを出力する。
     */
    public void RemoveToDo(){
        System.out.println("Which ToDo do you want to remove? Answer with a nubmer.");
        String number = scanner.next();
        int intnumber = Integer.parseInt(number);
        if(intnumber < amount){
            System.out.println("ToDo[" + todos.get(intnumber) + "]is removed.");
            todos.remove(intnumber);
            amount -= 1;
        }else{
            System.out.println("There is no ToDo.");
        }
    }
    /**
     * ToDoを一覧表示する。
     * For文を用いて、ArrayList内のToDoを順次表示する。
     */
    public void SeeToDo(){
        System.out.println("ToDo which you added is....");
        for (int i = 0;i < amount ; i++){
            System.out.println(todos.get(i));
        }
        System.out.println("That's all.");
    }

}
