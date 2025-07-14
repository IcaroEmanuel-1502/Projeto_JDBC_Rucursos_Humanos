
# PROJETO_JDBC

Este projeto Java demonstra a implementação de um sistema simples de cadastro de funcionários utilizando JDBC (Java Database Connectivity) para conexão com banco de dados MySQL.

## 📌 Funcionalidades

- ✅ Cadastro de funcionários
- 📋 Listagem de todos os funcionários
- ✏️ Atualização de dados dos funcionários
- 🗑️ Remoção de funcionários do sistema
- 🔍 Consulta de funcionário por ID ou CPF

## 🛠️ Tecnologias Utilizadas

- Java (JDK 17+)
- JDBC
- MySQL
- IDE recomendada: IntelliJ IDEA / Eclipse

## 📂 Estrutura do Projeto

```
PROJETO_JDBO/
├── conexao/            # Classe para conexão com o banco de dados
├── dao/                # Classes DAO (Data Access Object)
├── model/              # Classe Funcionario (modelo de dados)
├── view/               # Interface via terminal para interação
├── App.java            # Classe principal com menu interativo
└── script.sql          # Script SQL para criação da tabela no MySQL
```

## ⚙️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/PROJETO_JDBO.git
   ```

2. Importe o projeto em sua IDE Java (IntelliJ ou Eclipse).

3. Configure a conexão com o banco de dados MySQL no arquivo de conexão (`conexao/Conexao.java`):
   ```java
   String url = "jdbc:mysql://localhost:3306/nomedobanco";
   String user = "root";
   String password = "sua_senha";
   ```

4. Execute o script `script.sql` no seu banco de dados para criar a tabela `funcionarios`.

5. Execute a classe `App.java`.

## 🧾 Exemplo de Funcionamento

Menu interativo via terminal:
```
1 - Cadastrar funcionário
2 - Listar todos
3 - Buscar por CPF
4 - Atualizar funcionário
5 - Remover funcionário
6 - Sair
```

## 🧠 Aprendizados

- Manipulação de dados com JDBC
- Criação de DAOs para isolar lógica de persistência
- Boas práticas de organização de código Java
- Uso de SQL no contexto de aplicações Java


