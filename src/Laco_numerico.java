public class Laco_numerico {
    public static void main(String [] args){

        // aqui faremos um for que irá percorrer os números de 1 a 10
        // e irá imprimir todos na tela
        for(int i = 1; i <= 10 ; i++){
            for (int j = 1; j <= 10; j++)
                System.out.println(j + "x" + j + " = " + j * i);
        }

        //caso você queira imprimir só os números impares é só alterar
        // i++ para i+=2 que ele irá percorrer todos os números impares do intervalo
        // definido no for

        //for(int i = 1; i <= 10 ; i+=2){
        //    System.out.println(i);
        //}

        // no ultimo i se defini a quantidade de intervalo para percorrer, caso queira de
        // 10 em 10 é somente colocar i+=10 que ele irá percorrer de 10 em 10
    }
}
