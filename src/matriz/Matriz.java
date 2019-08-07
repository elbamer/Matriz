package matriz;

public class Matriz {

    public static void main(String[] args) {
        int salaNeto[][] = new int[3][3];
        //i = filas y j = ccolumnas          
        for (int i = 0; i < salaNeto.length; i++) {
            for (int j = 0; j < salaNeto[0].length; j++) {
                salaNeto[i][j] = (i * salaNeto.length) + (j + 1);
                System.out.print(salaNeto[i][j] + " ");
            }
            System.out.println("");

        }
    }
}
