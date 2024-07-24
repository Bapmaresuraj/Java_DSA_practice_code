
// print hollow  rectangle
public class Question1 {

    public static void Hollow_Rectangle(int TotalRows, int TotalCols) {

        for (int i = 1; i <= TotalRows; i++) {
            for (int j = 1; j <= TotalCols; j++) {
                // cell (i,j)
                if (i == 1 || i == TotalRows || j == 1 || j == TotalCols) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {

        Hollow_Rectangle(4, 5);
    }
}
