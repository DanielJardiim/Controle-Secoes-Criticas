# Controle-Secoes-Criticas

<p>
  O Problema da Seção Crítica (Critical Section Problem) consiste em seguir um protocolo 
  para que processos possam cooperar entre si quando forem acessar um recurso compartilhado.
</p>

<p>
  Independente do rpotocolo a ser utilizado, para se controlar uma Seção Crítica (Critical Sectio, ou somente CS),
  o ideal é que o mesmo obedeça a 3 regras de ouro:
  Exclusão Mútua (Mutual Exclusion).
  Progresso (Progress).
  Espera Limitada (Bounded Waiting).
</p>

<p>
  O Peterson's Solution é uma solução em Software para o problema da Critical Section,
  por exemplo, para o caso de haver dois processos cooperantes.
</p>

## Semáforos

<p>
  Semáforo é uma ferramenta de sincronização, também de Software, composta por uma variável
  inteira, acessada somente (fora a inicialização) por duas operações atômicas: wait e signal.
</p>

## Monitores

<p>
  Semáforos puros, conforme a complexidade de um código cresce, podem gerar soluções confusas e mais
  susceptíveis a erros. Para evitar tais erros, pesquisadores desenvolveram uma construção em linguagem
  de alto nível para sincronização de processos e acesso a uma Seção Crítica. Tal construção é
  chamada MONITOR.
</p>
