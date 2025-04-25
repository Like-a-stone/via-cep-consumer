# ViaCEP Consumer 📦

Aplicação Java simples para consulta de CEPs utilizando a API pública [ViaCEP](https://viacep.com.br/). Ao informar um CEP válido, a aplicação retorna os dados de endereço e os salva localmente em um arquivo `.json`.

## 🚀 Funcionalidades

- Consulta de CEPs usando HTTP GET
- Consumo de API REST e leitura do JSON com Gson
- Conversão automática da resposta para um `record`
- Salvamento dos dados em arquivos `.json`
- CLI simples (modo texto) com interação do usuário

## 📚 Conceitos Trabalhados

-  **Padrão de Projeto Singleton**: utilizado na classe `GsonSingleton` para garantir uma instância única do parser JSON.
-  **Leitura e Escrita de Arquivos**: para persistência local dos dados em formato `.json`.
-  **Requisição a APIs**: consumo da API ViaCEP utilizando o `HttpClient` do Java.
- ️**Tratamento de Erros**: controle de exceções para falhas de I/O e requisições mal-sucedidas.
-  **Maven**: usado para gerenciamento de dependências e organização do projeto.


## 🛠 Tecnologias

- Java 17+
- Maven
- Gson (Google)
- API HTTP Client (Java 11+)