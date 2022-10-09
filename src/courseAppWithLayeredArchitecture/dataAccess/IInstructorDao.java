package courseAppWithLayeredArchitecture.dataAccess;

import courseAppWithLayeredArchitecture.entities.Instructor;

public interface IInstructorDao {
  public void getAll();

  public void add(Instructor instructor);

  public boolean isExists(String name);

  public void remove(Instructor instructorToDelete);
}
