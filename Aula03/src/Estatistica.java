import java.util.Scanner;

public class Estatistica {
    /*
   Escreva	 uma	 classe Estatística	 em	 Java	 que	 faça a leitura de uma Matriz 5x5, a classe deve ao final mostrar:
A moda	dos	elementos	no	array	(elemento	mais	freqüente).
A mediana	dos	elementos	no	array	(elemento	central).
 A média.

    * */

    public static int tam=3;
    public int matriz[][] = new int[tam][tam];
    public int vet[]= new int[tam*tam];

    public void lerMatriz(){
        Scanner tc = new Scanner(System.in);
        for (int i= 0;i <tam;i++){
            for(int j=0; j< tam; j++ ){
                System.out.print("valor de {"+i+"}");
                System.out.println("{"+j+"}");
                matriz[i][j]=tc.nextInt();
            }
        }
    }
    public  int moda(){
        int contador=0;
        int qtdModa=0;
        int moda=0;
        int modaProvavel=0;
        //     1 2 3 1 1 1
        ordenarVetor();

        for(int v=0;v<tam*tam;v++){
            modaProvavel=vet[v];
            for(int i=0; i<tam*tam; i++){
                if(modaProvavel==vet[i]){
                    contador++;
                }
            }
            if(contador> qtdModa){
                moda=modaProvavel;
                qtdModa=contador;
            }
            contador=0;
        }


        return moda;
    }
    public  int mediana(){
        ordenarVetor();
        return vet[(tam*tam)/2];
    }

    public  void copiarVetor(){
        int t=0;
        for (int i=0; i<tam; i++) {
            for (int j = 0; j < tam; j++) {
                vet[t]= matriz[i][j];
                t++;
            }
        }
    }

    public void ordenarVetor(){
        copiarVetor();

/*
        int n = vet.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(vet[j-1] > vet[j]){
                    //swap elements
                    temp = vet[j-1];
                    vet[j-1] = vet[j];
                    vet[j] = temp;
                }

            }
        }*/

        for(int i =0;i<tam*tam;i++){
         for(int j=i+1;j<tam*tam ;j++){
             if(vet[i]>vet[j]){
                 int temp= vet[j];
                 vet[j]=vet[i];
                 vet[i]=temp;
             }
         }
     }


    }
    public  double media(){
        int total=0;
        double media;

        for (int i= 0;i <tam;i++){
            for(int j=0; j< tam; j++ ){
                total+=matriz[i][j];
            }
        }
        media=total/(tam*tam);
        return media;
    }
    public void mostrarVetor(){
        // copiarVetor();
        for (int j = 0; j < tam*tam; j++) {
            System.out.print(vet[j] +" - ");
        }
    }


}
