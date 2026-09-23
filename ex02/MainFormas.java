public class MainFormas {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo("Azul", 4.0, 3.0);
        Forma circulo = new Circulo("Vermelho", 2.5);

        retangulo.exibirCor();
        System.out.println("Área: " + retangulo.calcularArea());

        System.out.println();

        circulo.exibirCor();
        System.out.println("Área: " + circulo.calcularArea());
    }
}
