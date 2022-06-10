package trabalhopratico;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class FilaUsuarios {
    //MÉTODO SEM SEMÁFORO - RECURSO CRÍTICO
    public void usuarioSemSemaforo(){
        String name = Thread.currentThread().getName();
        int usuario = new Random().nextInt(10000);

        System.out.println(name + " está cadastrando usuário " + usuario);
        System.out.println("Usuário " + usuario + " da " + name + " cadastrado com sucesso!");
    }

    //CRIANDO O SEMAFORO
    //COM S = 1
    Semaphore semaforo = new Semaphore(1);

    //MÉTODO COM SEMÁFORO - RECURSO CRÍTICO
    public void usuarioComSemaforo() {
        String name = Thread.currentThread().getName();
        int usuario = new Random().nextInt(10000);

        try {
            semaforo.acquire();  //wait() - ENTRAR
            System.out.println(name + " está cadastrando usuário " + usuario);
        } catch (InterruptedException ex) {}
        finally {
            System.out.println("Usuário " + usuario + " da " + name + " cadastrado com sucesso!");
            semaforo.release();  //signal() - SAIR
        }
    }
}
