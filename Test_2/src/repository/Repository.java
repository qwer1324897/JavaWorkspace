package repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import dto.ToDoDto;

public class Repository {

    Map<String, ToDoDto> todolist = new HashMap<>();
    
    public int count() {
        return todolist.size();
    }

    public void saveTodo(String toDo, LocalDate startDay, LocalDate finishDay, boolean done, String review) {
        ToDoDto dto = new ToDoDto(toDo, startDay, finishDay, done, review);
        todolist.put(toDo, dto);
    }

    public Map<String, ToDoDto> allToDoList() {
        return new HashMap<>(todolist);
    }

    public ToDoDto findByTitle(String title) {
        return todolist.get(title);
    }

    public boolean remove(String title) {
        return todolist.remove(title) != null;
    }

}
