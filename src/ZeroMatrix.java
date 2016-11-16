/**
 * Created by samuel on 11/15/16.
 */
public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[4][3];
        for (int i=0; i<4; i++){
            for (int j=0; j<3; j++){
                mat[i][j] = (int)(Math.random()*5);
                System.out.println("matrix [" + i + "]" + "[" + j + "] : " + mat[i][j]);
            }
        }

        matrix(mat);

        System.out.println("*****************************************************************************");

         for (int i=0; i<4; i++){
            for (int j=0; j<3; j++){
                System.out.println("matrix [" + i + "]" + "[" + j + "] : " + mat[i][j]);
            }
        }

    }

    public static int[][] matrix(int[][] vector) {
        boolean rowHasZero = false;
        boolean colHasZero = false;


        for (int i = 0; i < vector.length; i++) {
            if (vector[i][0] == 0) {
                rowHasZero = true;
                break;
            }
        }

        for (int i = 0; i < vector[0].length; i++) {
            if (vector[0][i] == 0) {
                colHasZero = true;
                break;
            }
        }

        for (int i = 1; i < vector.length; i++) {
            for (int j = 1; j < vector[0].length; j++) {
                if (vector[i][j] == 0) {
                    vector[i][0] = 0;
                    vector[0][j] = 0;
                }
            }

        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i][0] == 0) {
                nullifyRow(vector, i);
            }
        }

        for (int j = 0; j < vector[0].length; j++) {
            if (vector[0][j] == 0) {
                nullifyCol(vector, j);
            }
        }

        if (rowHasZero) {
            nullifyRow(vector, 0);
        }

        if (colHasZero) {
            nullifyCol(vector, 0);
        }

        return vector;

    }

    public static int[][] nullifyRow(int[][] vector, int index) {
        for (int i = 0; i < vector.length; i++) {
            vector[i][0] = 0;
        }
        return vector;
    }

    public static int[][] nullifyCol(int[][] vector, int index) {
        for (int j = 0; j < vector[0].length; j++) {
            vector[0][j] = 0;
        }
        return vector;
    }
}


