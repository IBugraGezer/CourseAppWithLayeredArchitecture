package courseAppWithLayeredArchitecture.core.logging;

public class FileLogger implements ILogger {

  public void log(String data) {
    System.out.println("Dosyaya loglandı: " + data);
  }
}
