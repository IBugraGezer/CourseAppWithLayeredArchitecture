package courseAppWithLayeredArchitecture.core.logging;

public class DatabaseLogger implements ILogger {

  public void log(String data) {
    System.out.println("Veri tabanına loglandı: " + data);
  }
}
