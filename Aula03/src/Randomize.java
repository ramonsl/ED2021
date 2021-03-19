import java.util.Random;

public class Randomize {

    /*
    * Crie um vetor capaz de armazenar
    *  50 números inteiros. Em seguida faça
    * o seu preenchimento automático de forma randômica.
    *  Em seguida, exiba os valores deste vetor.
    * */

    public static int   vetor[]= new int[6];
    public static void main(String[] args) {
        randomize(60);
        ordenarVetor();
        mostrarVetor();
    }
    public static void randomize(int max){
       Random random = new Random();
       for (int i=0;i<vetor.length;i++){
           vetor[i]=random.nextInt(max);
       }

    }
    public static void mostrarVetor(){
        for (int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] +" - ");
        }
    }

    public static void ordenarVetor(){
        for(int i =0;i<vetor.length;i++){
            for(int j=i+1;j< vetor.length ;j++){
                if(vetor[i]>vetor[j]){
                    int temp= vetor[j];
                    vetor[j]=vetor[i];
                    vetor[i]=temp;
                }
            }
        }
    }

}
