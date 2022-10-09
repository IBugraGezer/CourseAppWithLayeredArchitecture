package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.ICourseCategoryDao;
import courseAppWithLayeredArchitecture.entities.CourseCategory;

public class CourseCategoryManager extends AbstractManager {

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
    this.log("kategori eklendi");
  }

  public void getAll() {
    courseCategoryDao.getAll();
    this.log("kategoriler listelendi");
  }

  public void remove(CourseCategory courseCategory) {
    if (courseCategoryDao.isExists(courseCategory.getName())) {
      courseCategoryDao.remove(courseCategory);
      this.log("kategori silindi");
    }
  }
}
