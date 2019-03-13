import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class TicTacToe{
    public static void main(String[]args){
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        char[][] grid = game.initializeGrid();
        int row;
        int col;
        char gameState = 'c';
        boolean playerToggle = true;
        while(true){
            game.printGrid(grid);
            gameState = game.checkGameState(grid);
            if(gameState == 'w'){
                if(playerToggle){
                    System.out.println("Game over! X won!");
                }else{
                    System.out.println("Game over! O won!");
                }
                break;
            }else if(gameState == 'd'){
                System.out.println("Game over! It's a draw!");
                break;
            }
            row = game.getRow(sc);
            col = game.getCol(sc);
            playerToggle = !playerToggle;
            char[][] newGrid;
            if(playerToggle){
                newGrid = game.placeToken(grid, 'X', row, col);
            }else{
                newGrid = game.placeToken(grid, 'O', row, col);
            }
            if(game.sameValues(grid, newGrid)){
                System.out.println("Illegal move! Try again.");
                playerToggle = !playerToggle;
            }else{
                for(int i=0 ; i<grid.length ; i++){
                    for(int j=0 ; j<grid.length ; j++){
                        grid[i][j] = newGrid[i][j];
                    }
                }
            }
        }
        sc.close();
    }

    public int getRow(Scanner sc){
        int row = 999;
        while(row == 999){
            try{
                row = sc.nextInt();
            }catch(InputMismatchException exception){
                System.out.println(exception);
                sc.nextLine();
            }
        }
        return row;
    }

    public int getCol(Scanner sc){
        int col = 999;
        while(col == 999){
            try{
                col = sc.nextInt();
            }catch(InputMismatchException exception){
                System.out.println(exception);
                sc.nextLine();
            }
        }
        return col;
    }

    public char checkGameState(char[][] grid){
        boolean victoryDetected = false;
        boolean noMovesLeft = true;
        for(int i=0 ; i<grid.length ; i+=2){
            if(i==0 && grid[i][0] != ' ' && (grid[i][0] == grid[2][2]) && (grid[i][0] == grid[4][4])){
                victoryDetected = true;
                break;
            }
            if(i==4 && grid[i][0] != ' ' && (grid[i][0] == grid[2][2]) && (grid[i][0] == grid[0][4])){
                victoryDetected = true;
                break;
            }
            if(grid[i][0] != ' ' && (grid[i][0] == grid[i][2]) && (grid[i][0] == grid[i][4])){
                victoryDetected = true;
                break;
            }
            for(int j=0 ; j<grid.length ; j+=2){
                if(grid[i][j] != ' '){
                    if((grid[0][j] == grid[2][j]) && (grid[2][j] == grid[4][j])){
                        victoryDetected = true;
                        break;
                    }
                }else
                {
                    noMovesLeft = false;
                }
            }
        }
        if(victoryDetected){
            return 'w';
        }else if(noMovesLeft){
            return 'd';
        }else{
            return 'c';
        }
    }

    public char[][] initializeGrid(){
        char [][] grid = new char[][]{
            {' ','|',' ','|',' '},
            {'-','-','-','-','-'},
            {' ','|',' ','|',' '},
            {'-','-','-','-','-'},
            {' ','|',' ','|',' '}};
        return grid;
    }

    public boolean sameValues(char[][] gridA, char[][] gridB){
        boolean same = true;
        for(int i=0 ; i<gridA.length ; i++){
            for(int j=0 ; j<gridA.length ; j++){
                if(gridA[i][j] != gridB[i][j]){
                    same = false;
                }
            }
        }
        return same;
    }

    public char[][] placeToken(char[][] grid, char token, int row, int col){
        char[][] newGrid = new char[5][5];
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid.length ; j++){
                newGrid[i][j] = grid[i][j];
            }
        }
        try{
            if(grid[row*2][col*2] == ' '){
                newGrid[row*2][col*2] = token;
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        return newGrid;
    }

    public void printGrid(char[][] grid){
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
