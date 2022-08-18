public class Banda {

    // Construtor da classe
    Banda(String name, String gen, Empresario e, Musico[] m , Musica[] mu ){
        nome = name;
        genero  = gen;
        emp = e;
        musicos = m;
        musicas = mu;
    }

    // Atributos explicitos
    public String nome;
    public String genero;

    // Atributos implicitos
    public Empresario emp; // Nao eh array pq no diagrama diz que pode ter 0 ou apenas 1

    //Array p/ musico pq pode ter mais de um
    public Musico[] musicos;
    public Musica[] musicas;


    public void mostraInfroBanda(){
        System.out.println("Nome da banda: " + nome );
        System.out.println("Genero da banda: "+ genero);

        // Verificando se temos empresario
        if( emp != null){
            System.out.println("Empresario: ");
            System.out.println("NOme: "+emp.nome);
            System.out.println("CNPJ: "+emp.cnpj);
        }

        //MOstrando os musicos
        System.out.println("Musicos da banda: ");
        for (int i = 0; i < musicos.length; i++) {
            // Verificando a posicao de um Array
            if (musicos[i] != null){
                System.out.println("Musico: "+ musicos[i].nome);
                System.out.println("Funcao: "+ musicos[i].funcao);
                System.out.println("------------");
            }

        }
        System.out.println("Musicas da banda: ");
        //Mostrando as musicas
        for (int i = 0; i < musicas.length; i++) {
            // Verificando a posicao de um Array
            if (musicas[i] != null){
                System.out.println("Musico: "+ musicas[i].nome);
                System.out.println("Tempo: "+ musicas[i].tempo);
                System.out.println("------------");
            }

        }

    }


}
