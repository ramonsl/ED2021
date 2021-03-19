import java.util.Scanner;

public class Temperatura {
    public double media;
    public int maioresMedia;
    public static int dias=7;
    public double semana[] = new double[dias];

    public void obter() {
        Scanner tc = new Scanner(System.in);
        for (int i=0; i<dias;i++){
            System.out.println("digite a temperatura do dia "+(i+1));
            semana[i]=tc.nextDouble();
        }
        System.out.println("Dados da semana coletados");
        calcularMedia();
        System.out.println("Media da temperatura:"+media);
    }

    public void calcularMedia() {
        double valor=0;
        for (int i=0;i<dias;i++){
            valor=valor+semana[i];
        }
        media=valor/dias;
    }

    public void verificar() {
        maioresMedia=0;
        for (int i=0;i<dias;i++){
            if(media>semana[i]){
                maioresMedia++;
            }
        }
        System.out.println("Dias que a temperatura é maior que a media " +maioresMedia);
    }

    public void mostraTemperaturas(){

      StringBuilder stringBuilder = new StringBuilder();

      stringBuilder.append("{");

      for(int i=0;i<dias; i++){
          stringBuilder.append(semana[i]+",");

      }

      //semana
      stringBuilder.append("}");
      //  "{6,6,8,9,1,}"
        System.out.println(stringBuilder);
    }
}
