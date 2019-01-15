// Java implementation of the Row Reduction Algorithm, as encountered in Linear Algebra
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
  
  
  public static void main(String[] args){
    int[][] matrix = {{1, 1, 1, -1}, {1, 2, 4, 3}};
    int[][] goal_matrix = {{1, 0, -2, -5}, {0, 1, 3, 4}};
    System.out.println("Original Matrix:");
    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix.length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Goal Matrix:");
    for (int i = 0; i < goal_matrix.length; i++){
      for (int j = 0; j < goal_matrix.length; j++){
        System.out.print(goal_matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  
  
  
  
  
}