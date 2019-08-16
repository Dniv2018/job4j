package ru.job4j.condition;
/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
//public class Point {
  //  @SuppressWarnings("CanBeFinal")
//    private int x;
 //   @SuppressWarnings("CanBeFinal")
 //   private int y;

 //   public Point(int x, int y) {
 //       this.x = x;
 //       this.y = y;
 //   }
public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
  //  public static void main(String[] args) {
  //      Point a = new Point(0, 1);
 //       Point b = new Point(2, 5);
 //       // сделаем вызов метода
 //       System.out.println("x1 = " + a.x);
 //       System.out.println("y1 = " + a.y);
 //       System.out.println("x2 = " + b.x);
 //       System.out.println("y2 = " + b.y);
//
 //       double result = b.distance(a);
 //       System.out.println("Расстояние между точками А и В : " + result);
 //   }
//}