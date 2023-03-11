import java.util.*;

public class Lista {
    public static void main(String[] args){
        ArrayList<String> estados = new ArrayList<>();

        estados.add("Ceará");
        estados.add("Espírito Santo");
        estados.add("Rio de Janeiro");
        estados.add("Pernambuco");

        System.out.println(estados);

        estados.remove("Rio de Janeiro");

        System.out.println(estados);

        System.out.println(estados.contains("São Paulo"));

        // PRATICA - DESCOMPLICA

        ArrayList<String> bandas = new ArrayList<>();

        bandas.add("Kiss");
        bandas.add("Beatles");
        bandas.add("Iron Maiden");

        System.out.println(bandas);

        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial");

        System.out.println(bandas);

        bandas.remove("Kiss");

        System.out.println(bandas);

        bandas.clear();

        System.out.println(bandas);

        // PRATICA - W3SCHOOLS

        ArrayList<String> cars = new ArrayList<>();

        // adicionando elementos ao array
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // acessando elemento do array
        System.out.println(cars.get(0));

        // alterando elementos do array
        cars.set(3, "Volks");
        System.out.println(cars);

        // quantidade de elemento do array
        System.out.println(cars.size());

        // removendo elemento do array
        cars.remove("BMW");
        System.out.println(cars);
        System.out.println(cars.size());

        // zerando o array
        cars.clear();

        System.out.println(cars);
        System.out.println(cars.size());

        // loop no array

        ArrayList<String> carros = new ArrayList<>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        
        // for
        for(int i = 0; i < carros.size(); i++){
            System.out.println("for ->" + carros.get(i));
        }

        //for-each
        for(String i : carros){
            System.out.println("for-each ->" +i);
        }

        Collections.sort(carros);
        for(String i : carros){
            System.out.println(i);
        }

        //outros tipos
        ArrayList<Integer> myNumbers = new ArrayList<>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);
        for(int i : myNumbers){
            System.out.println(i);
        }
    }
}
