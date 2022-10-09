package courseAppWithLayeredArchitecture.dataAccess;

import courseAppWithLayeredArchitecture.entities.Course;

public interface ICourseDao {
  public void add(Course course);

  public boolean isExists(String string);

  public void remove(Course course);
}
