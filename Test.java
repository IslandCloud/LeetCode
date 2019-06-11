import NumberOfIslands;

public class Test {

    public static void main(String[] args){
        char[][] a = {{'1', '1', '1'},{'0', '1', '0'}, {'1', '1', '1'}};
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        NumberOfIslands test = new NumberOfIslands();
        System.out.println("Lands: " + test.numIslands(a));
    }

}
