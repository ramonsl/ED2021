public class Main {


    public static void main(String[] args) {
        Estatistica estatistica= new Estatistica();
        estatistica.lerMatriz();
        estatistica.ordenarVetor();
        estatistica.mostrarVetor();
        System.out.println("Media:");
        System.out.println(estatistica.media());
        System.out.println("Mediana:");
        System.out.println(estatistica.mediana());
        System.out.println("moda:");
        System.out.println(estatistica.moda());
    }
}
