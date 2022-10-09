package courseAppWithLayeredArchitecture;

import courseAppWithLayeredArchitecture.business.CourseCategoryManager;
import courseAppWithLayeredArchitecture.business.CourseManager;
import courseAppWithLayeredArchitecture.business.InstructorManager;
import courseAppWithLayeredArchitecture.dataAccess.ICourseCategoryDao;
import courseAppWithLayeredArchitecture.dataAccess.ICourseDao;
import courseAppWithLayeredArchitecture.dataAccess.IInstructorDao;
import courseAppWithLayeredArchitecture.dataAccess.hibernate.HibernateCourseCategoryDao;
import courseAppWithLayeredArchitecture.dataAccess.hibernate.HibernateCourseDao;
import courseAppWithLayeredArchitecture.dataAccess.hibernate.HibernateInstructorDao;
import courseAppWithLayeredArchitecture.dataAccess.jdbc.JdbcCourseCategoryDao;
import courseAppWithLayeredArchitecture.dataAccess.jdbc.JdbcCourseDao;
import courseAppWithLayeredArchitecture.dataAccess.jdbc.JdbcInstructorDao;
import courseAppWithLayeredArchitecture.entities.Course;
import courseAppWithLayeredArchitecture.entities.CourseCategory;
import courseAppWithLayeredArchitecture.entities.Instructor;

public class Main {

  public static void main(String[] args) {
    //ENTITIES
    Instructor instructor1 = new Instructor(
      "Engin demiroğ",
      "Açıklama metni",
      "image.jpg"
    );
    Instructor instructor2 = new Instructor(
      "İbrahim Buğra Gezer",
      "Açıklama metni",
      "image.jpg"
    );
    CourseCategory courseCategory1 = new CourseCategory("Programlama");
    CourseCategory courseCategory2 = new CourseCategory("Yemek");
    Course course1 = new Course("Java eğitimi", 19.99);
    Course course2 = new Course("PHP eğitimi", 39.99);

    //DAOS
    IInstructorDao instructorDao = new HibernateInstructorDao();
    ICourseCategoryDao courseCategoryDao = new HibernateCourseCategoryDao();
    ICourseDao courseDao = new HibernateCourseDao();

    //MANAGERS
    InstructorManager instructorManager = new InstructorManager(instructorDao);
    CourseCategoryManager courseCategoryManager = new CourseCategoryManager(
      courseCategoryDao
    );
    CourseManager courseManager = new CourseManager(courseDao);

    //OPERATIONS
    instructorManager.create(instructor1);
    instructorManager.create(instructor2);
    courseCategoryManager.create(courseCategory1);
    courseCategoryManager.create(courseCategory2);
    courseManager.create(course1);
    courseManager.create(course2);

    instructorManager.getAll();
    courseCategoryManager.getAll();
    courseManager.getAll();

    instructorManager.remove(instructor1);
    courseCategoryManager.remove(courseCategory1);
    courseManager.remove(course1);

    instructorManager.getAll();
    courseCategoryManager.getAll();
    courseManager.getAll();
  }
}
