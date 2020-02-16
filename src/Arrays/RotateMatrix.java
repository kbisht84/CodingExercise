package Arrays;

public class RotateMatrix {

    public void rotate(int[][] matrix) {
        int mat_length= matrix.length;
        for(int i=0;i < mat_length; i++){
            for(int j=i; j< mat_length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

        for(int i=0; i< mat_length; i++){
            for(int j=0; j< mat_length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][mat_length -1-j];
                matrix[i][mat_length -1-j] = temp;
            }
        }
    }
}
