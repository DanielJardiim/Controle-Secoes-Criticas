package exemplomonitores;

public class ThreadSoma implements Runnable {
    //ATRIBUTOS
    public String nome;
    public int[] numeros;
    //CALCULADORA COMPARTILHADA
    // (ps: veja o static)
    private static Calculadora calc = new Calculadora();

    public ThreadSoma(String name, int[] nums) {
        nome = name;
        numeros = nums;
    }

    @Override
    public void run() {
        System.out.println(nome + " iniciada...");
        int soma = calc.somaArray(numeros);
        System.out.println("Resultado da Soma para a "
        + nome + ": " + soma);
        System.out.println(nome + " ...finalizada!");
    }
}