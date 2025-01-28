package business;

import data.api.TodoService;
import data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessMockTest {
    @Test
    public void testRetrieveTodosRelatedToSpring_usingMock(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
        assertEquals(2, filteredTodos.size());
    }
}
