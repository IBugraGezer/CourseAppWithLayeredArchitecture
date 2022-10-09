package courseAppWithLayeredArchitecture.entities;

public class Instructor {

  private String name;
  private String descriptionText;
  private String profilePhotoPath;

  public Instructor(
    String name,
    String descriptionText,
    String profilePhotoPath
  ) {
    this.name = name;
    this.descriptionText = descriptionText;
    this.profilePhotoPath = profilePhotoPath;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescriptionText() {
    return descriptionText;
  }

  public void setDescriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
  }

  public String getProfilePhotoPath() {
    return profilePhotoPath;
  }

  public void setProfilePhotoPath(String profilePhotoPath) {
    this.profilePhotoPath = profilePhotoPath;
  }
}
