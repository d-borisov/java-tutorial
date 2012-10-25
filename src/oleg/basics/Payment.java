package oleg.basics;

public class Payment {

  public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
    double interest = rate / 100.0;
    double partial1 = Math.pow((1 + interest), -numPeriods);
    double denominator = (1 - partial1) / interest;
    double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
    return answer;
  }

}


class Polygon {

  public Polygon polygonFrom(Point... corners) {
    int numberOfSides = corners.length;
    double squareOfSide1, lengthOfSide1;

    //error
    squareOfSide1 = (corners[1].x - corners[0].x) * (corners[1].x - corners[0].x)
        + (corners[1].y - corners[0].y) * (corners[1].y - corners[0].y);

    lengthOfSide1 = Math.sqrt(squareOfSide1);

    return null;
  }
}

class Circle {
  private int x, y, radius;

  public void setOrigin(int x, int y) {
  }

  public void moveCircle(Circle circle, int deltaX, int deltaY) {
    circle.setX(circle.getX() + deltaX);
    circle.setY(circle.getY() + deltaY);

    circle = new Circle();
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}

class PassPrimitiveByValue {

  public static void main(String[] args) {
    int x = 3;
    passMethod(x);
    System.out.println("After invoking passMethod, x = " + x);
  }

  public static void passMethod(int p) {
    p = 10;
  }
}
