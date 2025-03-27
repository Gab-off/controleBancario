# Checklist de Implementação

## Classe `Conta`
- [ ] Método `depositar(valor)`
    - [ ] Somar valor ao saldo
    - [ ] Lançar exceção se valor ≤ 0
- [ ] Método `sacar(valor)`
    - [ ] Subtrair valor do saldo se suficiente
    - [ ] Lançar exceção se valor ≤ 0 ou saldo insuficiente
- [ ] Método `atualizarSaldo()`
    - [ ] Verificar saldo negativo
    - [ ] Calcular 8% sobre o excedente negativo e subtrair do saldo

## Classe `ContaCorrente` (herda `Conta`)
- [ ] Atributo `limiteEspecial`
- [ ] Sobrescrever `sacar(valor)`
    - [ ] Permitir saldo negativo até `limiteEspecial`
    - [ ] Lançar exceção se exceder limite ou valor ≤ 0
- [ ] Método `toString()`
    - [ ] Retornar string com detalhes da conta

## Classe `ContaPoupanca` (herda `Conta`)
- [ ] Atributo `reajusteMensal`
- [ ] Sobrecarregar `atualizarSaldo(porcentagem)`
    - [ ] Validar porcentagem > 0
    - [ ] Calcular rendimento e atualizar saldo
    - [ ] Armazenar porcentagem em `reajusteMensal`
- [ ] Método `toString()`
    - [ ] Retornar string com detalhes da conta

## Classe `MenuContas`
- [ ] Construtor
    - [ ] Instanciar `contaCC` (saldo 500, limite 1000)
    - [ ] Instanciar `contaCP` (saldo 5000, reajuste 1%)
- [ ] Método `executarMenu()`
    - [ ] Exibir menu principal (1-CC, 2-CP, 0-Sair)
    - [ ] Chamar `avaliarOpcaoEscolhida()`
- [ ] Método `avaliarOpcaoEscolhida()`
    - [ ] Redirecionar para `operarContaCC()` ou `operarContaCP()`
- [ ] Método `operarContaCC()`
    - [ ] Submenu CC (1-Consultar, 2-Depositar, 3-Sacar, 4-Atualizar, 0-Voltar)
    - [ ] Tratar entradas e exceções nas operações
- [ ] Método `operarContaCP()`
    - [ ] Submenu CP (1-Consultar, 2-Depositar, 3-Sacar, 4-Atualizar, 0-Voltar)
    - [ ] Solicitar reajuste para `atualizarSaldo()` na opção 4

## Classe `Principal`
- [ ] Método `main()`
    - [ ] Instanciar `MenuContas`
    - [ ] Executar `executarMenu()`
    - [ ] Tratar exceções com try-catch

## Validações Gerais
- [ ] Testar fluxos de exceção:
    - [ ] Depósitos/saques com valores inválidos
    - [ ] Saques além do limite especial (CC)
    - [ ] Reajustes inválidos na poupança
- [ ] Verificar formatação dos métodos `toString()`
- [ ] Garantir navegação correta entre menus