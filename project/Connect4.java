import java.util.Scanner;

public class Connect4 {
    static Scanner scan = new Scanner(System.in);
    static char[][] grid = {
        {'-', '-','-', '-','-','-'},
        {'-', '-','-', '-','-','-'},
        {'-', '-','-', '-','-','-'},
        {'-', '-','-', '-','-','-'},
        {'-', '-','-', '-','-','-'},
        {'-', '-','-', '-','-','-'}}; 
    public static void main(String[] args) {
        
        printGrid(grid); 
        for(int i=0; i<36; i++){
            if(i%2==0){
                System.out.println("Player A Your Turn");
                int[] spot = askUser(); 
                grid[spot[0]][spot[1]]= 'X';
                printGrid(grid);
                
                    
            }else{
                System.out.println("Player B Your Turn");
            }

        }

        
     
    }
public static void printGrid(char[][] grid){
for(int i=0; i<grid.length; i++){
    for(int j=0; j<grid.length; j++){
        System.out.print(grid[i][j] +  " ");
    }System.out.println();
}
    
}

//need to ask user where they want to go 

public static int[] askUser(){
System.out.print("Pick a Row and column");
    int userRow=scan.nextInt();
    int userColumn =scan.nextInt(); 


{

}
return new int []{userRow, userColumn}; 

}

}



