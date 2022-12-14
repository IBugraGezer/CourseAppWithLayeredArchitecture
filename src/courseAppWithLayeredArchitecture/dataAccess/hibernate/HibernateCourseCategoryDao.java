package courseAppWithLayeredArchitecture.dataAccess.hibernate;

import courseAppWithLayeredArchitecture.dataAccess.ICourseCategoryDao;
import courseAppWithLayeredArchitecture.entities.CourseCategory;
import courseAppWithLayeredArchitecture.virtualDatabase.VirtualDatabase;

public class HibernateCourseCategoryDao implements ICourseCategoryDao {

  public void getAll() {
    System.out.println("----Kategoriler hibernate ile listeleniyor----");
    for (CourseCategory courseCategory : VirtualDatabase.courseCategories) {
      System.out.println(courseCategory.getName());
      System.out.println("--------------");
    }
  }

  public void add(CourseCategory courseCategory) {
    VirtualDatabase.courseCategories.add(courseCategory);
    System.out.println(courseCategory.getName() + " hibernate ile eklendi");
  }

  public boolean isExists(String name) {
    for (CourseCategory courseCategory : VirtualDatabase.courseCategories) {
      if (courseCategory.getName() == name) {
        return true;
      }
    }
    return false;
  }

  public void remove(CourseCategory courseCategoryToDelete) {
    int index = 0;
    for (CourseCategory courseCategory : VirtualDatabase.courseCategories) {
      if (courseCategory.getName() == courseCategoryToDelete.getName()) {
        VirtualDatabase.courseCategories.remove(index);
        System.out.println(courseCategory.getName() + " hibernate ile silindi");
        return;
      }
      index++;
    }
  }
}
