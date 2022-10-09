package courseAppWithLayeredArchitecture.business;

import courseAppWithLayeredArchitecture.core.logging.DatabaseLogger;
import courseAppWithLayeredArchitecture.core.logging.FileLogger;
import courseAppWithLayeredArchitecture.core.logging.ILogger;
import courseAppWithLayeredArchitecture.core.logging.MailLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractManager {

  public List<ILogger> loggers = new ArrayList<ILogger>(
    Arrays.asList(new FileLogger(), new MailLogger(), new DatabaseLogger())
  );

  public void log(String data) {
	System.out.println("-----Logging-----");
    for (ILogger logger : loggers) {
      logger.log(data);
    }
	System.out.println("-----Logging-----");
  }
}
