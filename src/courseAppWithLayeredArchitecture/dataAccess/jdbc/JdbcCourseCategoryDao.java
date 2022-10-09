package courseAppWithLayeredArchitecture.dataAccess.jdbc;

import courseAppWithLayeredArchitecture.dataAccess.ICourseCategoryDao;
import courseAppWithLayeredArchitecture.entities.CourseCategory;
import courseAppWithLayeredArchitecture.virtualDatabase.VirtualDatabase;

public class JdbcCourseCategoryDao implements ICourseCategoryDao {

  public void add(CourseCategory courseCategory) {
    VirtualDatabase.courseCategories.add(courseCategory);
    System.out.println(courseCategory.getName() + " jdbc ile eklendi");
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
      }
      index++;
    }
    System.out.println("jdbc ile silindi");
  }
}
