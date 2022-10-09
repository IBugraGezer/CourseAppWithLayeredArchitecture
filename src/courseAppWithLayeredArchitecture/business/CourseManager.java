package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.ICourseDao;
import courseAppWithLayeredArchitecture.entities.Course;

public class CourseManager {

  private ICourseDao courseDao;

  public CourseManager(ICourseDao courseDao) {
    this.courseDao = courseDao;
  }

  public void create(Course course) {
    if (!courseDao.isExists(course.getName()) && course.getPrice() > 0) {
      courseDao.add(course);
    }
  }

  public void remove(Course course) {
    if (courseDao.isExists(course.getName())) {
      courseDao.remove(course);
    }
  }
}
