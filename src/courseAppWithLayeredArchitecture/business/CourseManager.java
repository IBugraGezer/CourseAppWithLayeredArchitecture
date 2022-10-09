package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.ICourseDao;
import courseAppWithLayeredArchitecture.entities.Course;

public class CourseManager extends AbstractManager {

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
    this.log("kurs eklendi");
  }

  public void getAll() {
    courseDao.getAll();
    this.log("kurslar listelendi");
  }

  public void remove(Course course) {
    if (courseDao.isExists(course.getName())) {
      courseDao.remove(course);
      this.log("kurs silindi");
    }
  }
}
