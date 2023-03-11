public class vetores{
    public static void main(String[] args){
        int[] dados = new int[10];

        dados[2] = 9;
        dados[3] = 7;
        dados[0] = 6;

        // print na posição desejada
        System.out.println(dados[2]);


        // prática

        int[] birdDay = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3 , 1};

        int totalBird = 0;
        int firstWeek = 0;
        int secondWeek = 0;

        for(int i = 0; i < 14; i++){
            totalBird = totalBird + birdDay[i];
        }

        System.out.println(totalBird);

        for(int i = 0; i < 7; i++){
            firstWeek = firstWeek + birdDay[i];
        }

        System.out.println(firstWeek);

        for(int i = 7; i < 14; i++){
            secondWeek = secondWeek + birdDay[i];
        }

        System.out.println(secondWeek);

    }
}
