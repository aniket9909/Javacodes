// import java.util.*;

// class RectanglePattern {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter row and column : ");
//     int row = sc.nextInt();
//     int col = sc.nextInt();
//     for (int i = 0; i < row; i++) {
//       for (int j = 0; j < col; j++) {
//         if (i == 0 || i == row - 1) {
//           System.out.print("* ");

//         } else {
//           if (j == 0 || j == col - 1) {
//             System.out.print("* ");
//           } else {
//             System.out.print("  ");
//           }
//         }
//       }
//       System.out.println();
//     }
//   }
// }

/**
 * RectanglePattern
 */
public class RectanglePattern {

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {

      for (int j = 0; j < 5; j++) {
        if (i == 0 || i == 4) {
          System.out.print("* ");
        } else if (j > 0 && j < 4) {
          System.out.print("  ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }

  }
}