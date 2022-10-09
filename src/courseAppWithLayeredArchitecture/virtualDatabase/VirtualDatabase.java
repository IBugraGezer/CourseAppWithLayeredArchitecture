package courseAppWithLayeredArchitecture.virtualDatabase;

import courseAppWithLayeredArchitecture.entities.Course;
import courseAppWithLayeredArchitecture.entities.CourseCategory;
import courseAppWithLayeredArchitecture.entities.Instructor;
import java.util.ArrayList;
import java.util.List;

public class VirtualDatabase {

  public static List<Course> courses = new ArrayList<Course>();
  public static List<CourseCategory> courseCategories = new ArrayList<CourseCategory>();
  public static List<Instructor> instructor = new ArrayList<Instructor>();
}
