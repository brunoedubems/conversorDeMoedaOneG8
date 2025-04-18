
# Conversor de Moedas One da Turma G8!

Olá! 🎉 Bem-vindo(a) ao **Conversor de Moedas One**, um pequeno programa em Java que permite converter valores entre Dólar (USD), Peso Argentino (ARS), Real Brasileiro (BRL) e Peso Colombiano (COP) usando a API do [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 📋 Funcionalidades

- Converter de Dólar para Peso Argentino
- Converter de Peso Argentino para Dólar
- Converter de Dólar para Real Brasileiro
- Converter de Real Brasileiro para Dólar
- Converter de Dólar para Peso Colombiano
- Converter de Peso Colombiano para Dólar
- Menu interativo em linha de comando
- Tratamento de erros para entradas inválidas e exceções de conexão

---

## 🚀 Como usar

1. **Clone este repositório**  
   ```bash
   git clone https://github.com/seu-usuario/conversor-de-moeda-one.git
   cd conversor-de-moeda-one
   ```

2. **Obtenha sua chave de API**  
   - Acesse [ExchangeRate-API](https://www.exchangerate-api.com/) e crie uma conta gratuita.
   - Copie sua _API key_ e substitua o valor no código onde necessário (classe `ApiService.java`).

3. **Compile o código**  
   Certifique-se de estar na raiz do projeto e que o Gson está no classpath:

   ```bash
   javac -cp lib/gson-2.8.9.jar -d out src/main/java/br/com/brunoedubems/dto/MoedaDto.java src/main/java/br/com/brunoedubems/service/ApiService.java src/main/java/br/com/brunoedubems/service/Main.java
   ```

4. **Execute o programa**  
   ```bash
   java -cp "out:lib/gson-2.8.9.jar" br.com.brunoedubems.service.Main
   ```

   > 🪟 No Windows, troque `:` por `;` no classpath.

5. **Siga as instruções na tela**  
   - Escolha a opção de conversão (1 a 6) ou digite `7` para sair.
   - Informe o valor que deseja converter.
   - Veja o resultado formatado no console.

---

## 🛠️ Estrutura do Projeto

```
conversorDeMoeda/
├── src/
│   └── main/
│       ├── java/
│       │   └── br/
│       │       └── com/
│       │           └── brunoedubems/
│       │               ├── dto/
│       │               │   └── MoedaDto.java
│       │               └── service/
│       │                   ├── ApiService.java
│       │                   └── Main.java
│       └── resources/
├── lib/
│   └── gson-2.8.9.jar
├── target/
├── pom.xml
└── README.md
```

- **src/**: Código-fonte Java.
- **lib/**: Dependências externas (Gson).
- **target/**: Diretório de build.
- **pom.xml**: Arquivo de configuração do Maven (se estiver usando).
- **README.md**: Este arquivo.

---

## 💡 Dicas e Considerações

- **Tratamento de Erros**: Entradas inválidas (como letras ou símbolos) são tratadas com mensagens de aviso.
- **Timeout / Conexão**: Falhas de conexão ou chaves inválidas são tratadas com mensagens claras ao usuário.
- **Melhorias Futuras**:
  - Suporte a mais moedas.
  - Interface gráfica (Swing/JavaFX).
  - Cache de resultados para evitar múltiplas chamadas à API.
  - Internacionalização (idiomas).

---

## 🤝 Contribuições

Contribuições, sugestões de melhorias e correções são muito bem-vindas! Abra uma _issue_ ou envie um _pull request_.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Obrigado por usar o **Conversor de Moedas One**! Qualquer dúvida, fique à vontade para entrar em contato. 😊
