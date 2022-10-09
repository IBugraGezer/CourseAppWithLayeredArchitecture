package courseAppWithLayeredArchitecture.dataAccess;

import courseAppWithLayeredArchitecture.entities.CourseCategory;

public interface ICourseCategoryDao {
  public void add(CourseCategory courseCategory);

  public boolean isExists(String name);

  public void remove(CourseCategory courseCategoryToDelete);
}
