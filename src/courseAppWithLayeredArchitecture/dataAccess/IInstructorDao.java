package courseAppWithLayeredArchitecture.dataAccess;

import courseAppWithLayeredArchitecture.entities.Instructor;
import courseAppWithLayeredArchitecture.virtualDatabase.VirtualDatabase;

public interface IInstructorDao {
  public void add(Instructor instructor);

  public boolean isExists(Instructor instructor);

  public void remove(Instructor instructor);
}
