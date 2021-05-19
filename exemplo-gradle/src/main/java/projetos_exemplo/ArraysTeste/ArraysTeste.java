package projetos_exemplo.ArraysTeste;

public class ArraysTeste {

    public static void main(String[] args) {

        // Exemplo 01
        int[] meuArray = new int[7];
        meuArray[0] = 10;
        int[] meuArray2 = {12,32,54,6,8,89,64};

        for (int k : meuArray) {
            System.out.println(k);
        }

        meuArray2[2] = 10;
        System.out.println(meuArray2[2]);

        System.out.println(meuArray.length);
        System.out.println("\n");

        // Exemplo 02
        int[][] meuArrayMulti = {{1, 2, 3, 4}, {53, 63, 73}};

        for (int i = 0; i < meuArrayMulti.length; ++i) {
            for (int j = 0; j < meuArrayMulti[i].length; ++j) {
                System.out.println(meuArrayMulti[i][j]);
            }
        }
    }
}
