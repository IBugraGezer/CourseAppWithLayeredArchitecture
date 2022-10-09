package courseAppWithLayeredArchitecture.dataAccess.hibernate;

import courseAppWithLayeredArchitecture.dataAccess.ICourseDao;
import courseAppWithLayeredArchitecture.entities.Course;
import courseAppWithLayeredArchitecture.virtualDatabase.VirtualDatabase;

public class HibernateCourseDao implements ICourseDao {

  public void add(Course course) {
    System.out.println(course.getName() + " hibernate ile eklendi");
    VirtualDatabase.courses.add(course);
  }

  public boolean isExists(String name) {
    for (Course course : VirtualDatabase.courses) {
      if (course.getName() == name) {
        return true;
      }
    }
    return false;
  }

  public void remove(Course courseToRemove) {
    int index = 0;
    for (Course course : VirtualDatabase.courses) {
      if (course.getName() == courseToRemove.getName()) {
        VirtualDatabase.courses.remove(index);
      }
      index++;
    }
    System.out.println("hibernate ile silindi");
  }
}