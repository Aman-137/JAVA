// // Right Star Print

// public class PatternPrint {

// public static void main(String[] args) {
// int row = 6;

// for (int i = 0; i < row; i++) {
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }

// System.out.println();
// }

// }

// }

// // Left Star Print
// public class PatternPrint {
// public static void main(String[] args) {
// int row = 6;

// for (int i = 0; i <= row; i++) {
// for (int k = 2 * (row - i); k >= 0; k--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }

// }

// Pyramid or Triangle Print
// public class PatternPrint {
// public static void main(String[] args) {
// int row = 6;

// // for (int i = row; i >= 0; i--) {// THis is for upside down Pyramid
// triangle
// for (int i = 0; i < row; i++) { // this is for Pyramid Triangle
// for (int k = row - i; k >= 0; k--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// }
// }

// Right star downside

// public class PatternPrint {
// public static void main(String[] args) {
// int row = 6;

// for (int i = row; i > 0; i--) {
// for (int j = i; j > 0; j--) {
// System.out.print(" * ");
// }
// System.out.println();
// }
// }
// }

// Left Start downside
// public class PatternPrint {
// public static void main(String[] args) {
// int row = 6;

// for (int i = row; i >= 0; i--) {
// for (int k = row; k > i; k--) {
// System.out.print(" ");
// }
// for (int j = 0; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }
