package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.ICourseCategoryDao;
import courseAppWithLayeredArchitecture.entities.CourseCategory;

public class CourseCategoryManager {

  private ICourseCategoryDao courseCategoryDao;

  public CourseCategoryManager(ICourseCategoryDao courseCategoryDao) {
    this.courseCategoryDao = courseCategoryDao;
  }

  public void create(CourseCategory courseCategory) {
    if (courseCategoryDao.isExists(courseCategory.getName())) {
      System.out.println("Bu kategori zaten eklenmiş");
      return;
    }

    courseCategoryDao.add(courseCategory);
  }

  public void remove(CourseCategory courseCategory) {
    if (courseCategoryDao.isExists(courseCategory.getName())) {
      courseCategoryDao.remove(courseCategory);
    }
  }
}
