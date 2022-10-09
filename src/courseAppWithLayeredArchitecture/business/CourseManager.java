package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.ICourseDao;
import courseAppWithLayeredArchitecture.entities.Course;

public class CourseManager {

  private ICourseDao courseDao;

  public CourseManager(ICourseDao courseDao) {
    this.courseDao = courseDao;
  }

  public void create(Course course) {
    if (courseDao.isExists(course.getName())) {
      System.out.println("Bu kurs zaten eklenmiş");
      return;
    }
    if (!(course.getPrice() > 0)) {
      System.out.println("Kursun fiyatı 0'dan büyük olmalıdır");
      return;
    }

    courseDao.add(course);
  }

  public void getAll() {
    courseDao.getAll();
  }

  public void remove(Course course) {
    if (courseDao.isExists(course.getName())) {
      courseDao.remove(course);
    }
  }
}
