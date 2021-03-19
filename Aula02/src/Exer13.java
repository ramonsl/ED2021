import java.util.Scanner;

public class Exer13 {
    public static int tamanho=10;
    int numeros[] = new int [tamanho];
    int totalNumbers;
    public void obter() {
        Scanner tc = new Scanner(System.in);
        for (int i=0; i<tamanho;i++){
            System.out.println("digite o valor"+(i+1));
            numeros[i]=tc.nextInt();
        }
        System.out.println("Dados da semana coletados");
    }

    public void mostrar() {
        totalNumbers=0;
        Scanner tc = new Scanner(System.in);
        for (int i=0; i<tamanho;i++){
          if(numeros[i]>50){
              totalNumbers++;
          }
        }
        System.out.println("Quantidade de numero maiores "+totalNumbers);

    }

    public void mostraPosicao(){
        for (int i=0; i<tamanho;i++){
            if(numeros[i]>50){
                System.out.println("Posição "+i);
                System.out.println("Valor "+numeros[i]);
            }
    }
}

    public void exibirInfos(){
        mostrar();
        if(totalNumbers>0){
            mostraPosicao();
        }else{
            System.out.println("Não há o que mostrar");
        }
    }
}
