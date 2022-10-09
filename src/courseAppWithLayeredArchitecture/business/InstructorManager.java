package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.IInstructorDao;
import courseAppWithLayeredArchitecture.entities.Instructor;

public class InstructorManager {

  private IInstructorDao instructorDao;

  public InstructorManager(IInstructorDao instructorDao) {
    this.instructorDao = instructorDao;
  }

  public void create(Instructor instructor) {
    instructorDao.add(instructor);
  }

  public void remove(Instructor instructor) {
    if (instructorDao.isExists(instructor.getName())) {
      instructorDao.remove(instructor);
    }
  }
}
