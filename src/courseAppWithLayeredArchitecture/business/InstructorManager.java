package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.dataAccess.IInstructorDao;
import courseAppWithLayeredArchitecture.entities.Instructor;

public class InstructorManager extends AbstractManager {

  private IInstructorDao instructorDao;

  public InstructorManager(IInstructorDao instructorDao) {
    this.instructorDao = instructorDao;
  }

  public void create(Instructor instructor) {
    instructorDao.add(instructor);
    this.log("eğitmen eklendi");
  }

  public void getAll() {
    instructorDao.getAll();
    this.log("eğitmenler listelendi");
  }

  public void remove(Instructor instructor) {
    if (instructorDao.isExists(instructor.getName())) {
      instructorDao.remove(instructor);
      this.log("eğitmen silindi");
    }
  }
}
