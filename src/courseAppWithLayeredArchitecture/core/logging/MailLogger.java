package courseAppWithLayeredArchitecture.core.logging;

public class MailLogger implements ILogger {

  public void log(String data) {
    System.out.println("Mail atıldı: " + data);
  }
}
