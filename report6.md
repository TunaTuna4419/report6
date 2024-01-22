# 課題レポート6:Java最終課題  (擬似的な対話型AIを作る)
##### 津波真太郎 235743J  
提出日 2024/01/22

## リポジトリURL
URL:https://github.com/TunaTuna4419/report6

## 課題説明
今回設定した課題はタイトルにもあるように「擬似的な対話型AI」である。この課題の内容としては、特定のコマンドを入力すると特定の処理を行うものである。例えば、”今日の天気は？”と打つと”今日の天気は〇〇です”とランダムに天気を返す。  
このようなプログラムを実装する。

## 取り組み方
AI.javaを実行の基礎コードとし、その下に各機能ごとにクラスを設定した。メソッドは基本的に戻り値はなく、特定の処理や出力を行う形でコーディングしている。  
また、実装したい機能を考えたうえで、その機能をどのレベルでなら現時点で実装することができるかをまとめ、実際にコーディングをした。例として、天気を出力するメソッドに関して、理想は現在の沖縄の天気を取得、出力することだったが、それが今の実力でできなかったため、晴れ、雨、曇りの３つの天気をランダムで出力するメソッドに変更した。
## コード解説
解説コード1

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

このコードに関して、このコードはToDoの中で指定されたものを削除するコードである。
使用者から何番目のToDoを削除するかをint型で受け取り、そのToDoをArrayListからremoveする。この時、予期せぬ数字が入力された場合に備えて、数字がおかしい場合のための処理もコーディングしてある。

解説コード2

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


このコードでは、天気をランダムに出力するため、数字をランダムで生成しその値を用いて配列から天気を呼び出すことで、ランダムに天気を出力している。
## 実行結果
    shintaro_tsuha $ cd /Users/shintaro_tsuha/Lectures/prog2/report/report6 ; /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-17.jdk/Conten
    ts/Home/bin/java @/var/folders/3f/pfymb3lx7qxdfy5lqmrc0lk40000gn/T/cp_9sbaajan6vmftiw1txz3idiwr.argfile jp.ac.uryukyu.ie.e235734.Main 
    What is your name?
    Shintaro
    Nice to meet youShintaro.
    Enter the command >>>
    Hello
    Hi,Shintaro
    Enter the command >>>
    AddToDo
    ToDo?
    WakeUp
    ToDo[WakeUp]was added.
    Enter the command >>>
    RemoveToDo
    Which ToDo do you want to remove? Answer with a nubmer.
    0
    ToDo[WakeUp]is removed.
    Enter the command >>>
    ShowMeCommand
    err:UnidentifiedCommand.
    Enter the command >>>
    ShowMeCommands
    I will show you available commands.
    Exit
    Weather?
    Hello
    AddToDo
    RemoveToDo
    SeeToDo
    Enter the command >>>
    Exit
    Shutdown,Good bye.
    shintaro_tsuha $
## テスト結果
![Alt text](<スクリーンショット 2024-01-22 13.36.03-1.png>)
## 考察
今回の課題においてコード全体の構成、すなわちクラス間の関係や、メソッドの実装方法に関して考えが甘く、ユニットテストを行う際にコード修正をする必要があった。これによりコマンドを受け取る部分全体の統一感がなくなり、第３者がコードを読む際に戸惑うことが考えられる。次回同じようにプロジェクトを進める際は、テストコードの記述も考慮しつつ全体の構造を検討すべきだと感じた。またスケジュール管理について、短い時間に分けて今回はコード実装をしていたが、後日コードを書き始めるときに自分が前回何をやっていたかが曖昧になっていることがあったため、なるべくまとまった時間を用意する必要があるとも感じた。