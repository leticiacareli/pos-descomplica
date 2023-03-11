public class matriz {
    public static void main(String[] args){
        int[][] dados = new int[3][3];

        dados[0][0] = 0;
        dados[0][1] = 1;
        dados[0][2] = 2;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++ ){
                dados[i][j] = j;

                System.out.println(dados[i][j]);
            }
        }

        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 3; j++ ){
        //         System.out.println(dados[i][j]);
        //     }
        // }

        // prática

        int [][] matriz = {{9, 8, 7}, {5, 3, 2}, {6, 6, 7}};

        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

        for(int i = 0; i < 3; i++){
            maiorLinha[i] = 0;

            System.out.println("maiorLinha: " + maiorLinha[i]);
        }

        for(int i = 0; i < 3; i++){
            menorColuna[i] = 10;

            System.out.println("menorColuna: " + menorColuna[i]);
        }

        //maior elemento na linha 0
        for(int i = 0; i < 3; i++){
            if(matriz[0][i] > maiorLinha[0]){
                maiorLinha[0] = matriz[0][i];

                System.out.println("maiorLinha[0]: " + maiorLinha[i]);
            }
        }

        //maior elemento na linha 1
        for(int i = 0; i < 3; i++){
            if(matriz[1][i] > maiorLinha[1]){
                maiorLinha[1] = matriz[1][i];
            }
        }

        //maior elemento na linha 2
        for(int i = 0; i < 3; i++){
            if(matriz[2][i] > maiorLinha[2]){
                maiorLinha[2] = matriz[2][i];
            }
        }

        //menor elemento na coluna 0
        for(int i = 0; i < 3; i++){
            if(matriz[i][0] < menorColuna[0]){
                menorColuna[0] = matriz[i][0];
            }
        }
        //menor elemento na coluna 1
        for(int i = 0; i < 3; i++){
            if(matriz[i][1] < menorColuna[1]){
                menorColuna[1] = matriz[i][1];
            }
        }
        //menor elemento na coluna 2
        for(int i = 0; i < 3; i++){
            if(matriz[i][2] < menorColuna[2]){
                menorColuna[2] = matriz[i][2];
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(maiorLinha[i] == menorColuna[j]){
                    System.out.println("Ponto de sela: " + maiorLinha[i]);
                }
            }
        }

    }
}
