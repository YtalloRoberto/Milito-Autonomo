
import java.util.Scanner;


public class AUT {
    int CONT;
    char PALAVRA [];
    public static void main(String args[]){
        // aqui temos, as funções para colocar a sentença no automato, alem de fazer que, como e um formato de: se der certo passe
        // se não der erro, e mais utilizado o array, para esse Automato.
        AUT AUTOMATO = new AUT();
        String SENTENCA;
        Scanner ENTRADA = new Scanner (System.in);
        System.out.println("Entre com a sentença: ");
        SENTENCA = ENTRADA.nextLine();
        AUTOMATO.PALAVRA = SENTENCA.toCharArray();
        AUTOMATO.Iniciar();
    }
    public void Iniciar(){
        // aqui inicia, a contagem para iniciar as letras do automato, que no caso começe a contagem, e passe para o q0 o inicial, no caso. 
        CONT = 0;
        q0();
    }
    public void q0(){
        if(CONT < PALAVRA.length){
            // aqui voce pode mudar o a pra 0 ou 1, no caso se estiver correto, passe, se não passe para o qerro.
            if (PALAVRA[CONT] == 'a'){
                CONT++;
                q1();
            }
            else if(PALAVRA[CONT] == 'c'){
                qf();
            }
            else {
                qerro();
            }
        }
    }
    public void q1(){
                if(CONT < PALAVRA.length){
            // aqui voce pode mudar o a pra 0 ou 1,no caso se estiver correto, passe, se não passe para o qerro.
            if (PALAVRA[CONT] == 'b'){
              CONT++;
              q2();
            }
            else {
              qerro();
            }
        }
    }
    public void q2(){
            if(CONT < PALAVRA.length){
            // aqui voce pode mudar o a pra 0 ou 1, no caso se estiver correto, passe, se não passe para o qerro.
            if (PALAVRA[CONT] == 'b'){
              CONT++;
              q0();
            }
            else {
              qerro();
            }
        }
    }
    public void qf(){
      System.out.println("PALAVRA ACEITA PELO AUTOMATO!!!");  
    }
    public void qerro(){
        System.out.println("PALAVRA REJEITADA PELO AUTOMATO!!!");
    }
}
