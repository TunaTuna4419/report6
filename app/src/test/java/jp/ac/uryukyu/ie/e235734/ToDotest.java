/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jp.ac.uryukyu.ie.e235734;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToDotest {
    @Test
    void ToDoTest(){
        ToDo todo = new ToDo("TestName");
        for (int i = 0;i < 3;i++){
            todo.AddToDo("TestToDo" + i);
        }
        assertEquals(3, todo.size());
    }
}

