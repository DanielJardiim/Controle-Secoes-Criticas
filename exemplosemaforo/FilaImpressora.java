package exemplosemaforo;

import java.util.concurrent.Semaphore;

public class FilaImpressora {
    //MÉTODO QUE IMPRIME SEM SEMÁFORO - RECURSO CRÍTICO
    public void imprimirSemSemaforo(){
        System.out.println(Thread.currentThread().getName()
        + " está imprimindo!");
        System.out.println("Documento da "
        + Thread.currentThread().getName()
        + " impresso com sucesso!");
    }

    //CRIANDO O SEMAFORO
    //COM S = 1
    Semaphore semaforo = new Semaphore(1);

    //MÉTODO QUE IMPRIME COM SEMÁFORO - RECURSO CRÍTICO
    public void imprimirComSemaforo() {
        try {
            semaforo.acquire();  //wait() - ENTRAR
            System.out.println(Thread.currentThread().getName()
            + " está imprimindo!");
        } catch (InterruptedException ex) {}
        finally {
            System.out.println("Documento da "
            + Thread.currentThread().getName()
            + " impresso com sucesso!");
            semaforo.release();  //signal() - SAIR
        }
    }
}