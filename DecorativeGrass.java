public class DecorativeGrass extends SpecialGrass {

  private String color;
  private boolean isEvergreen;

  public DecorativeGrass() {
    super();
    this.color = "green";
    this.isEvergreen = true;
  }

  public DecorativeGrass(String name, double pricePerUnit, int stockQuantity, String color, boolean isEvergreen) {
    super(name, pricePerUnit, stockQuantity);
    this.color = color;
    this.isEvergreen = isEvergreen;
  }

  public String getColor() {
    return color;
  }

  public boolean getIsEvergreen() {
    return isEvergreen;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setIsEvergreen(boolean isEvergreen) {
    this.isEvergreen = isEvergreen;
  }

  public String toString() {
    return super.toString() + " | Color: " + color + " | Evergreen: " + isEvergreen;
  }
  
}
