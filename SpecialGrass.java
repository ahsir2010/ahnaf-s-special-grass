public class SpecialGrass {

  private String name;
  private double pricePerUnit;
  private int stockQuantity;

  public SpecialGrass() {
    this.name = "unknown";
    this.pricePerUnit = 0.0;
    this.stockQuantity = 0;
  }

  public SpecialGrass(String name, double pricePerUnit, int stockQuality) {
    this.name = name;
    this.pricePerUnit = pricePerUnit;
    this.stockQuantity = stockQuantity;
  }

  public String getName() {
    return name;
  }

  public double getPricePerUnit() {
    return pricePerUnit;
  }

  public int getStockQuantity() {
    return stockQuantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPricePerUnit(double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public void setStockQuantity(int stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  public String toString() {
    return "Product: " + name + " | Price/Unit: $" + pricePerUnit + " | Stock: " + stockQuantity;
  }
  
}
