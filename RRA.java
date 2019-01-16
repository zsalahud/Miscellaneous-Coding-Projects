import java.util.*;

// A basic Java implementation of the Row Reduction Algorithm, as encountered in Linear Algebra, using arrays.

public class RRA{
  
  public static int[][] row_reducer(int[][] array){

    int[][] matrix = new int[array.length][array[0].length];
    
    // copy input matrix
    for (int r = 0; r < matrix.length; r++)
    {
        for (int c = 0; c < matrix[r].length; c++)
        {
            matrix[r][c] = array[r][c];
        }
    }
    
    for (int p = 0; p < matrix.length; p++){
       // creating left-most pivot 
        int pivot = matrix[p][p];
        if (pivot != 0)
        {
            int other_pivot = 1 / pivot;
            for (int i = 0; i < matrix[p].length; i++)
            {
                matrix[p][i] *= other_pivot;
            }
        }
        // make zero-rows
        for (int r = 0; r < matrix.length; r++)
        {
            if (r != p)
            {
                int f = matrix[r][p];
                for (int i = 0; i < matrix[r].length; i++)
                {
                    matrix[r][i] -= f * matrix[p][i];
                }
            }
        }
    }
    return matrix;
  }

}
