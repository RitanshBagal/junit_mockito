package data.api;
import java.util.*;
public class TodoServiceStub implements TodoService{
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Code");
    }
}
