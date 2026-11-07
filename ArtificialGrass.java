public class ArtificialGrass extends SpecialGrass {
  
  private double pileHeightMm;
  private boolean isUVProtected;

  public ArtificialGrass() {
    super();
    this.pileHeightMm = 0.0;
    this.isUVProtected = false;
  }

  public ArtificialGrass(String name, double pricePerUnit, int stockQuantity, double pileHeightMm, boolean isUVProtected) {
    super(name, pricePerUnit, stockQuantity);
    this.pileHeightMm = pileHeightMm;
    this.isUVProtected = isUVProtected;
  }

  public double getPileHeightMm() {
    return pileHeightMm;
  }

  public boolean getIsUVProtected() {
    return isUVProtected;
  }

  public void setPileHeightMm(double pileHeightMm) {
    this.pileHeightMm = pileHeightMm;
  }

  public void setIsUVProtected(boolean isUVProtected) {
    this.isUVProtected = isUVProtected;
  }

  public String toString() {
    return super.toString() + " | Pile Height: " + pileHeightMm + "mm | UV Protected: " + isUVProtected;
  }
  
}
