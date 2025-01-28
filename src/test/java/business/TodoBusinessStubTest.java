package business;
import data.api.TodoService;
import data.api.TodoServiceStub;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;
public class TodoBusinessStubTest {
    @Test
    public void testRetrieveTodosRelatedToSpring_usingStub(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
        assertEquals(2, filteredTodos.size());
    }
    @Test
    public void testRetrieveTodosRelatedToSpring_usingStub2(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy1");
        assertEquals(0, filteredTodos.size());
    }
}
