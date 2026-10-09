# Sistema de Pagamento de Motoristas — Tech UniDiasUp

Projeto acadêmico em Java para calcular o pagamento líquido de três categorias de motoristas.

## Requisitos

- JDK 17 ou superior.
- Maven (opcional, para importar o projeto como Maven no IntelliJ IDEA).

## Estrutura

```text
src/main/java/br/edu/unidiasup/motoristas/
├── Main.java
├── Motorista.java
├── MotoristaIniciante.java
├── MotoristaPremium.java
└── MotoristaParceiroFrotista.java
```

## Regras implementadas

- **MotoristaIniciante:** recebe 75% do bruto; se tiver menos de cinco corridas, é descontada a taxa de inatividade de R$ 50,00.
- **MotoristaPremium:** recebe 85% do bruto. Cada corrida acrescenta um bônus de R$ 2,00 ao valor bruto antes do cálculo da taxa.
- **MotoristaParceiroFrotista:** recebe 80% do bruto, menos R$ 800,00 de aluguel. O pagamento não fica abaixo de R$ 0,00.

Todos os atributos são `private`. A classe `Motorista` é abstrata, e cada categoria implementa `calcularPagamentoLiquido()` com sobrescrita. O projeto não usa interfaces nem classes auxiliares de cálculo.

## Como executar

### IntelliJ IDEA

1. Extraia o projeto e abra a pasta `projeto-motoristas-tech-unidiasup` no IntelliJ IDEA.
2. Aguarde o reconhecimento do projeto Maven.
3. Abra `src/main/java/br/edu/unidiasup/motoristas/Main.java`.
4. Execute o método `main`.

### Terminal com Java instalado

Na pasta raiz do projeto, compile e execute:

```bash
javac -d out src/main/java/br/edu/unidiasup/motoristas/*.java
java -cp out br.edu.unidiasup.motoristas.Main
```

## Observação sobre os valores

O exercício exige `double`, então os valores são armazenados nessa representação, conforme o enunciado. O formato de moeda brasileiro é aplicado apenas na impressão do extrato.

## Publicar em um repositório GitHub público

1. No GitHub, crie um repositório público chamado `motoristas-tech-unidiasup`. Crie-o vazio, sem adicionar README, `.gitignore` ou licença pela interface.
2. Extraia este ZIP e abra o terminal dentro da pasta `projeto-motoristas-tech-unidiasup`.
3. Execute os comandos abaixo, substituindo `SEU_USUARIO` pelo seu nome de usuário do GitHub:

```bash
git init
git add .
git commit -m "Criar sistema de pagamento de motoristas"
git branch -M main
git remote add origin https://github.com/SEU_USUARIO/motoristas-tech-unidiasup.git
git push -u origin main
```

4. O link a entregar será `https://github.com/SEU_USUARIO/motoristas-tech-unidiasup`.
