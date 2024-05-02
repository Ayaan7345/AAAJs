import static org.junit.Assert.*;
import org.junit.Test;
import the_project.todo;

public class TodoTest {

    @Test
    public void testAddTodo() {
        Todo todo = new Todo();
        todo.addTodo("Buy milk");
        assertEquals(1, todo.getTodos().size());
        assertEquals("Buy milk", todo.getTodos().get(0));
    }

    @Test
    public void testCompleteTodo() {
        Todo todo = new Todo();
        todo.addTodo("Buy milk");
        todo.completeTodo(0);
        assertEquals(1, todo.getTodos().size());
        assertTrue(todo.getTodos().get(0).isCompleted());
    }

    @Test
    public void testDeleteTodo() {
        Todo todo = new Todo();
        todo.addTodo("Buy milk");
        todo.addTodo("Walk dog");
        todo.deleteTodo(0);
        assertEquals(1, todo.getTodos().size());
        assertEquals("Walk dog", todo.getTodos().get(0).getText());
    }
}
