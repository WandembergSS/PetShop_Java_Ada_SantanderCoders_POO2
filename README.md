# PetShop - Ada_SantanderCoders - POO2
Projeto final do módulo PROGRAMAÇÃO ORIENTADA A OBJETOS II do Curso de Automação de Testes - Ada - Santander Coders

**Petshop 947**

- Registros:
  - Veterinário
  - Cliente Animal (dentro da classe colocar o dono)
  - Tosador
  - Atendentes
- Produtos e serviços
  - ResponseVO higienizar(Cliente cliente, List\<Animal\> animais, Higiene higiene, String observacao); // retornar o id do servico, o nome dele, o valor e a classe cliente
  - ResponseVO atendimentoClinico(Cliente cliente, List\<Animal\> animais, String observacao); // retornar resultado do atendimento no campo Observação do próprio animal além do id do servico, o nome dele, o valor e a classe cliente
  - ResponseVO vacinacao(Cliente cliente, List\<Animal\> animais, List\<Vacinas\> vacina, String observacao) //Só pode receber uma vacina por animal e deve retornar o id do servico, o nome dele, o valor e a classe cliente
  - void verRemedios() //imprimir todos os itens de remédios
  - void verAlimentos() //imprimir todos os itens de alimentos
- Centro financeiro
  - void pagamento(List\<int\> itens) //Imprime a nota fiscal, dar um sout no valor total da compra

Main -\> será a nossa classe de testes

Projeto final:

Após ter construído o nosso projeto se baseando no diagrama de classe feito em aula, é hora de testá-lo, na sua classe main, que aqui, utilizaremos ela para validar os retornos dos métodos, faça o seguinte:

- Crie o objeto Petshop
- Crie no mínimo dois cliente, com pelo menos um deles tendo mais do que um pet
- Testes com o cliente que tem apenas um pet:
  - Chame o método atendimentoClinico do petshop, e faça-o retornar no campo observações o pedido do médico para o pet tomar a vacina X
  - Valide se o retorno do método atendimentoClinico possui o id do serviço, o serviço prestado, o valor e valide principalmente, se há no campo observação do animal, o pedido do médico para a vacina
  - Chame o método vacinação do pet shop, e faça o pet tomar a vacina pedido no retorno do atendimentoClinico
  - Valide se o retorno do método vacinação possui o esquemaVacinal do pet preenchido com o vacina que foi pedida, o id, o serviço prestado e o valor
  - Chame o método higienizar do petshop, e faça-o retornar no campo estado do animal, um valor referente ao serviço prestado ex: se chamou o método apenas pedindo para dar banho, o animal deverá estar limpo no retorno do método
  - Valide se o retorno do método higienizar possui id, serviço, preço e se o estado do animal está equivalente ao serviço pedido
  - Chame os métodos verRemedio e verAlimentos
  - Por último, passe para o método pagamentos, a lista de todos os ids do serviços utilizados mais pelo menos 1 remédio e 1 alimento e valide se a soma dos valores do pedido do cliente está correta

- Testes com o cliente que tem dois ou mais pets:
  - repita o todos os fluxos feitos para o cliente com apenas um pet para o que tenha dois, fazendo a seguinte alterações:
  - no método atendimentoClinico coloque uma observação diferente para cada animal do cliente (cada animal do cliente deve receber uma vacina diferente para esse caso de testes)
  - no método vacinação, vc deve vacinar cada animal conforme pedido no atendimentoClinico e deve checar no retorno o esquemaVacinal de cada animal e constatar a vacina correta em cada um
  - Chame os métodos verRemedio e verAlimentos
  - Por último, faça a mesma validação para o método pagamentos ( a lista de todos os ids do serviços utilizados mais pelo menos 2 remédio e 2 alimento e valide se a soma dos valores do pedido do cliente está correta ) lembre se que se foi enviado dois animais para qualquer serviço, o valor será o dobro do serviço feito apenas para um animal

Problemas:

criação de listas dos produtos remedio e alimentos

padronização dos ids preços

—----------------------------------------------------------------------------------------------------

Entregar esse exercício junto:

Defina o que é cada princípio do S.O.L.I.D:

- Single Responsibility

- Open-Closed

- Liskov Substitution

- Interface Segregation

- Dependency Inversion
