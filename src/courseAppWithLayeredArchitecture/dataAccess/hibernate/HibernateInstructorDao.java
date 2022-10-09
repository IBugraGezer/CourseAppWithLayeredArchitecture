
package courseAppWithLayeredArchitecture.dataAccess.hibernate;

import courseAppWithLayeredArchitecture.dataAccess.IInstructorDao;
import courseAppWithLayeredArchitecture.entities.Instructor;
import courseAppWithLayeredArchitecture.virtualDatabase.VirtualDatabase;

public class HibernateInstructorDao implements IInstructorDao {

  public void add(Instructor instructor) {
    VirtualDatabase.instructors.add(instructor);
    System.out.println(instructor.getName() + " hibernate ile eklendi");
  }

  public boolean isExists(String name) {
    for (Instructor instructor : VirtualDatabase.instructors) {
      if (instructor.getName() == name) {
        return true;
      }
    }
    return false;
  }

  public void remove(Instructor instructorToRemove) {
    int index = 0;
    for (Instructor instructor : VirtualDatabase.instructors) {
      if (instructor.getName() == instructorToRemove.getName()) {
        VirtualDatabase.instructors.remove(index);
      }
      index++;
    }
    System.out.println("hibernate ile silindi");
  }
}
