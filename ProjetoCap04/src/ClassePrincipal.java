import java.util.Random;
import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {

        //Introducao a Arrays
        // CAracteristicas importantes de um array
        // 1 tem tamanho definido
        // 2 guarda elementos homogeneos(do mesmo tipo)
        // eh declarado como um objeto

        // declarando o Array de primitivo (guarda valores)
        // duas partes
        // Parte 1  - criando como se fosse um objeto
        // Parte 2 - criando um ponteiro
  //      int[] numeros = new int[10];

        // Colocando elementos no array de primitivo
  //      numeros[0] = 15;
  //      numeros[8] = 20;

         /*
         for (int i = 0; i < numeros.length; i++){
             System.out.println(numeros[i]);
         }
        */

        // Criando um "Array de objetos"
   //     Conta[] contas = new Conta[10];
        // Array de objetos guardam referencias
        //Criando contas
   //     Conta c1 = new Conta();
   //     c1.numero = 77;

   //     Conta c2 = new Conta();
   //     c2.numero = 88;

        // pedidndo p/ que cada posicao do Array aponte p/ um onjeto diferente
   //     contas[0] = c1;
   //     contas[1] = c2;
   //     contas[2] = new Conta();
   //     contas[2].numero = 99;



/*
        // Guardam referencias
        for (Conta aux: contas) {
            System.out.println(aux);
        }
  */
        /*
        for(Conta aux : contas){
            if(aux != null){
                System.out.println(aux.numero);
            }
        }
        */

        //---------- Exercicio 1 Banda ---------------------------

      /*
        //Criando musicos
        Musico mu1 = new Musico();
        mu1.nome = "Joelma";
        mu1.funcao = "vocalista";

        Musico mu2 = new Musico();
        mu2.nome = "Chimbinha";
        mu2.funcao = "guitarra";

        Musico[] musicos = new Musico[50];
        musicos[0] = mu1;
        musicos[1] = mu2;

        // Criando 2 musicas
        Musica music1 = new Musica();
        music1.nome = "A lua me traiu";
        music1.tempo = "3:00";

        Musica music2 = new Musica();
        music2.nome = "Vendaval";
        music2.tempo = "3:30";

        Musica[] musicas = new Musica[50];
        musicas[0] = music1;
        musicas[1] = music2;

        // Criando a banda
        Banda banda1 = new Banda("Calypso", "Axe", null , musicos, musicas );

        banda1.mostraInfroBanda();


       */

        // ------- Exercicio campo minado -----

        /*

        int linha =  0;
        int coluna = 0;
        int pontos = 0;
        int [][] matriz = new int[3][3];

        // Selecionando aleatoriamente uma posicaoda matirz
        Random numAleatorio = new Random();
        linha = numAleatorio.nextInt(2);
        coluna = numAleatorio.nextInt(2);

        // posicao da matriz recebendo a bomba
        matriz[linha][coluna] = 1;

        System.out.println("Campo minado!! ");
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Entre com a linha");
            linha = teclado.nextInt();
            System.out.println("ENtre com a coluna");
            coluna = teclado.nextInt();

            if(matriz[linha][coluna] == 1){
                System.out.println("Game over");
            }
            else {
                pontos++;
                System.out.println("Great job, go ahead!");
            }



        }while (pontos < 8);



         */
        
    }
}
