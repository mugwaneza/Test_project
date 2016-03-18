package models;


import play.data.validation.Constraints.*;
import java.util.ArrayList;
import java.util.List;
import play.db.ebean.*;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by alexis on 3/18/2016.
 */

@Entity
public class Task extends Model {

    @Id
    public Long id;

   @Required
    public String label;

  public static Finder<Long,Task> find = new Finder(
            Long.class, Task.class
    );

    public static List<Task> all() {
        return find.all();
    }

    public static void create(Task task) {

        task.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }
}
