# 🏦 Sistema Bancário ETEC - POO

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-green)](https://opensource.org/licenses/MIT)

Projeto desenvolvido como parte do curso **Técnico em Desenvolvimento de Sistemas** da **ETEC**, demonstrando conceitos avançados de Programação Orientada a Objetos (POO) e tratamento de exceções em Java.

---

## 📋 Descrição do Projeto

### Objetivo
Implementar um sistema bancário simplificado com dois tipos de contas:
- **Conta Corrente**: Permite saques com limite especial
- **Conta Poupança**: Oferece rendimentos mensais ajustáveis

### Funcionalidades Principais
✅ **Operações Básicas**  
- Depósitos e saques validados  
- Consulta de saldo formatado  

⚡ **Recursos Especiais**  
- Limite especial para conta corrente  
- Reajuste de rendimento personalizado para poupança  
- Atualização automática de saldo negativo (multa de 8%)  

🛡️ **Tratamento de Erros**  
- Exceções personalizadas para valores inválidos e saldo insuficiente  
- Interface gráfica amigável com `JOptionPane`  

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **POO** (Herança, Polimorfismo, Encapsulamento)
- **Tratamento de Exceções** (`ValorMenorException`, `SaldoInsuficienteException`)
- **GUI Básica** com `JOptionPane`

---

## 🚀 Como Executar
1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/sistema-bancario-etec.git
javac -d ./bin ./src/principal/Principal.java
java -cp ./bin principal.Principal
