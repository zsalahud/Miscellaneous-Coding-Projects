import java.util.*;

// Java implementation of the Row Reduction Algorithm, as encountered in Linear Algebra, using basic arrays.
public class RRA{
  
//  public int[][] row_reducer(int[][] array){
//    for(int i = 0; i < array.length; i++){
//      for(int j = 0; j< array.length; j++){
//        
//      }
//    }
//    
//    
//  }
//  
//  
  
  public static void main(String[] args){
    int[][] matrix = {{0, 3, -6, 6, 4, -5},{3, -7, 8, -5, 8, 9},{3, -9, 12, -9, 6, 15}};
    int[][] goal_matrix = {{3, -9, 12, -9, 6, 15},{0, 2, -4, 4, 2, -6},{0, 0, 0, 0, 1, 4}};
    System.out.println("Original Matrix:");
    for (int i = 0; i < matrix.length; i++){
      System.out.print(Arrays.toString(matrix[i]) + " ");
      System.out.println();
    }
  
    System.out.println("Goal Matrix:");
    for (int i = 0; i < goal_matrix.length; i++){
        System.out.print(Arrays.toString(goal_matrix[i]) + " ");
        System.out.println();
    }
  
  
  
  
  
  
  
}
}
