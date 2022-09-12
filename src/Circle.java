public class Circle {
  private double radius;
  private String color;

  /**
   * @param radius
   * @param color
   */

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  /**
   * "Getter" method to return color
   * @return (String) the color of the Circle
   */
  public String getColor() {
    return this.color;
  }

  public double getArea() {
    return Math.PI * (Math.pow(this.radius, 2));
  }

  public double getPerimeter() {
    return Math.PI * 2 * this.radius;
  }

}
