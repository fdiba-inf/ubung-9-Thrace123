package exercise9;

public class Ellipse {
  private Point startPoint;
  private double halb a;
  private double halb b;

  public Ellipse (){
    startPoint = new Point (0, 0);
    halb a = 1;
    halb b = 1;

  }
  public Ellipse(Ellipse otherEllipse) {
        startPoint = new Point(otherEllipse.startPoint);
        halb a = otherEllipse.halb a;
        halb b = otherEllipse.halb b;
    }

    public boolean isValid() {
        return halb a > 0 && halb b > 0;
    }

    public void initialize() {

      do{
        System.out.println("Start point: ");
        startPoint.initialize();
        System.out.println("Halbachse a: ");
        halb a = Utils.INPUT.nextDouble();
        System.out.println("Halbachse b: ");
        halb b = Utils.INPUT.nextDouble();


      } while (!isValid ());
    }

    public double calculatePerimeter (){
      return  Math.PI * Math.abs(3*(halba + halbb) - Math.sqrt((3*halba + halbb)*(halba + 3*halbb)));
    }
    public double calculateArea () {
      return  Math.PI * halba * halbb;
    }
    public String getType(){
      return (halb a == halb b) ? "Cycle" : "Elipse";
    }
    public String toString (){
      return String.format("%s-[%s, %s], %s, P=%s, A=%s", startPoint, halba, halbb, getType(), calculatePerimeter(), calculateArea());
    }
    public boolean equals() {
       boolean sameHalba = Utils.equals(hal ba, otherEllipse.halb a);
       boolean sameHalbb = Utils.equals(halbb, otherEllipse.halb b);
       boolean sameHalbaReversed = Utils.equals(halb a, otherEllipse.halbb);
       boolean sameHalbbReversed = Utils.equals(halb b, otherEllipse.halb a);

      return (sameHalb a && sameHalb b) || (sameHalbaReversed && sameHalbbReversed);
    }
}