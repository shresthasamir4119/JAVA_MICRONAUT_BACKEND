package todo.app.todo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "todos")
@Table(schema = "todo")
public class Todo {
    @Id
    private Long id;
    private String title;
    private Boolean isCompleted;

    public Long getId() {
        return  id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsCompleted() {
        return  isCompleted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
