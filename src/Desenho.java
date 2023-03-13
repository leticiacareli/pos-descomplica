public class Desenho {
    
    //metodo sem parametro
    public void mostrar(){

        for(int i = 0; i < 10; i++){
            System.out.println("*");
        }
    }

    // metodo com 1 paramentro
    public void mostrar(char simbolo){
        
        for(int i = 0; i < 10; i++){
            System.out.println(simbolo);
        }
    }

    //metodo com 2 parametros
    public void mostrar(char simbolo, int n){

        for(int i = 0; i < n; i++){
            System.out.println(simbolo);
        }
    }
}
