package trabalhopratico;

public class mainUsuarios {
    public static void main(String[] args) {
        //CRIANDO A FILA DOS USUÁRIOS
        FilaUsuarios filaUsuarios = new FilaUsuarios();
        
        //CRIANDO UM ARRAY DE 10 THREADS
        //COLOCANDO TODAS NA MESMA FILA
        Thread[] thread = new Thread[10];
        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(new ProcessoUsuarios(filaUsuarios));
        }

        //DANDO START NAS THREADS
        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
    }  
}
