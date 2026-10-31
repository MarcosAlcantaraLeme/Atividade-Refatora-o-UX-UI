# Atividade-Refatora-o-UX-UI

# Projeto Calculadora — Qualidade de Software

> Projeto acadêmico desenvolvido com foco em UX/UI, Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

---

## 1. Identificação do Projeto

**Projeto:** Calculadora Java  
**Aluno:** Marcos Paulo Alcantara Leme  
**RA:** 250866  
**Curso:** Análise e Desenvolvimento de Sistemas (ADS)  
**Disciplina:** UX/UI e Testes de Software  
**Professor:** Daniel Ohata
**Semestre:** 2026.2

---

# 2. Visão Geral

O projeto consiste no desenvolvimento e aprimoramento de uma calculadora utilizando a linguagem Java, com o objetivo de aplicar conceitos de qualidade de software, revisão de código, refatoração, testes automatizados e documentação técnica.

Inicialmente, a aplicação possuía uma estrutura simplificada usando if e else, na qual todas as operações matemáticas eram executadas dentro de um único método.

Durante a atividade, o código passou por um processo de refatoração, no qual as operações foram separadas em métodos específicos, tornando o código mais organizado, legível e fácil de manter, compreender e atualizar caso necessário.

Além do funcionamento das operações matemáticas, o projeto busca demonstrar a importância de boas práticas durante o desenvolvimento de aplicações.

---

# 3. Objetivo da Atividade

A atividade tem como objetivo analisar um código Java inicialmente desenvolvido sem uma estrutura adequada de organização e aplicar técnicas de melhoria por meio da refatoração.

Também busca demonstrar a importância dos testes de software para verificar o funcionamento das operações e identificar possíveis falhas.

Entre os principais pontos trabalhados estão:

- Análise e revisão do código original;
- Identificação de oportunidades de melhoria;
- Refatoração e organização dos métodos;
- Implementação de testes de software;
- Verificação do comportamento das operações;
- Documentação utilizando JavaDoc;
- Versionamento e organização do projeto com Git e GitHub.

---

# 4. Situação Inicial do Projeto

Na primeira versão, a calculadora possuía apenas um método responsável por realizar todas as operações matemáticas.

As principais características do código original eram:

- Todas as operações estavam concentradas em um único método;
- Utilização de estruturas condicionais `if` e `else if`;
- Resultado armazenado em uma variável de instância pública;
- Tratamento de divisão por zero dentro do próprio método;
- Ausência de documentação JavaDoc;
- Pouca separação de responsabilidades, ocasionando trechos sobrecarregados do código.

Embora o programa executasse as operações básicas, sua estrutura dificultava a manutenção, a reutilização dos métodos, a compreensão de terceiros e a realização de testes individuais.

---

# 5. Refatoração Aplicada

Após a análise do código original, foi realizada uma reorganização da classe calculadora.

A principal mudança foi separar cada operação matemática em um método independente.

Código Original:

<img width="1118" height="504" alt="print código original" src="https://github.com/user-attachments/assets/70588cb9-f3b9-4bc7-aebf-2cb820f61ec6" />

Problemas Encontrados:
Todas as operações em um único método;
Estrutura de condicionais `if/else` ocasionando em uma verificação de tentativa e erro com a operação;
Código pouco documentado;
Operações pouco reutilizáveis;
Falta de separação de cada operação;

Código Refatorado:

<img width="1134" height="726" alt="print refatoracao 1" src="https://github.com/user-attachments/assets/56f5b3d0-e7b7-4890-b3dd-2d39531c658b" />
<img width="1133" height="726" alt="print refatoracao 2" src="https://github.com/user-attachments/assets/00b0d27b-ce3e-414c-b253-4f6247cd1e57" />
<img width="1134" height="725" alt="print refatoracao 3" src="https://github.com/user-attachments/assets/8df41d23-8e08-435f-bf43-44cc4796f28c" />

Métodos específicos para cada operação;
Estrutura `switch/case`;
Comentários explicando as diversas partes do código;
Documentação JavaDoc;
Métodos independentes e reutilizáveis;
Código mais limpo e organizado;

A nova estrutura apresenta os seguintes métodos:

- `somar()`
- `subtrair()`
- `multiplicar()`
- `dividir()`
- `calc()`

A refatoração foi realizada buscando preservar o comportamento original da aplicação, melhorando sua organização interna e facilitando futuras alterações.

---

# 6. Funcionalidades e Operações

A calculadora disponibiliza quatro operações matemáticas básicas, além de um método responsável por identificar qual operação deverá ser executada.

| ID | Operação | Método | Descrição |
|---|---|---|---|
| RF01 | Soma | `somar()` | Realiza a adição de dois números inteiros. |
| RF02 | Subtração | `subtrair()` | Realiza a subtração entre dois números inteiros. |
| RF03 | Multiplicação | `multiplicar()` | Multiplica dois números inteiros. |
| RF04 | Divisão | `dividir()` | Divide o primeiro número pelo segundo. |
| RF05 | Validação | `dividir()` | Verifica se o divisor é diferente de zero. |
| RF06 | Seleção de operação | `calc()` | Identifica o operador informado e executa a operação correspondente. |
| RF07 | Operação inválida | `calc()` | Apresenta uma mensagem quando o operador não é suportado. |

## 6.1 Explicação das Operações

**Soma (+)**

Recebe dois números inteiros e retorna a soma entre eles.

**Subtração (-)**

Recebe dois números inteiros e retorna a diferença entre o primeiro e o segundo.

**Multiplicação (*)**

Recebe dois números inteiros e retorna o produto da multiplicação.

**Divisão (/)**

Realiza a divisão entre dois números inteiros. Caso o segundo número seja zero, apresenta uma mensagem de erro e retorna zero.

**Seleção de operação (calc)**

Recebe dois números e um operador matemático. Por meio da estrutura `switch/case`, identifica a operação solicitada e direciona a execução para o método correspondente.

---

# 7. Tecnologias Utilizadas

| Tecnologia | Utilização |
|---|---|
| Java | Linguagem utilizada no desenvolvimento da calculadora. |
| JDK | Ambiente necessário para compilação e execução do código Java. |
| JUnit | Biblioteca utilizada para desenvolver testes automatizados, caso utilizada no projeto. |
| JavaDoc | Geração da documentação técnica das classes e métodos. |
| Git | Controle de versão e acompanhamento das alterações. |
| GitHub | Hospedagem do código-fonte e versionamento remoto. |
| Eclipse | Ambiente utilizado para desenvolvimento e execução do projeto. |

---

# 8. Testes de Software

Os testes de software têm como finalidade verificar se as operações implementadas apresentam os resultados esperados.

A validação teve o intuito de contemplar tanto os cenários de funcionamento normal quanto situações que possam gerar erros durante a execução, como operações inválidas e divisão por zero.

## 8.1 Cenários de Teste

| ID | Cenário | Entrada | Resultado esperado |
|---|---|---|---|
| CT01 | Testar soma | 10 + 5 | 15 |
| CT02 | Testar subtração | 10 - 5 | 5 |
| CT03 | Testar multiplicação | 10 * 5 | 50 |
| CT04 | Testar divisão | 10 / 2 | 5 |
| CT05 | Divisão por zero | 10 / 0 | Mensagem de erro e retorno 0 |
| CT06 | Operação inválida | 10 % 5 | Mensagem de operação inválida e retorno 0 |

## 8.2 Evidências da Execução dos Testes

Os prints abaixo devem demonstrar a execução dos testes e os resultados obtidos durante a validação da calculadora.

**Print 01 — Execução dos testes automatizados**

<img width="494" height="310" alt="print console do teste atualizado" src="https://github.com/user-attachments/assets/73348ba1-821f-45fa-8f24-44bc209eb981" />


# 9. Documentação JavaDoc

A documentação JavaDoc foi adicionada à classe `Calculadora` e aos seus métodos.

O objetivo é explicar a finalidade de cada método, seus parâmetros e os valores retornados, facilitando a compreensão e a manutenção do código por outros desenvolvedores.

Foram documentados:

- Classe principal `Calculadora`;
- Método `somar()`;
- Método `subtrair()`;
- Método `multiplicar()`;
- Método `dividir()`;
- Método `calc()`.

## 9.1 Evidências da Documentação

**Print 01 — Documentação da classe Calculadora**
<img width="1129" height="390" alt="print javaDoc" src="https://github.com/user-attachments/assets/96fcd73e-99d3-444a-b73c-e561137da2c0" />
<img width="1534" height="732" alt="print javaDoc html" src="https://github.com/user-attachments/assets/e9a739e8-013a-4d26-918e-0716999bd980" />

---

# 10. Estrutura do Projeto

A estrutura abaixo representa uma sugestão de organização dos arquivos do projeto:

```bash
projeto-calculadora/
│
├── src/
│   └── calculadora/
│       └── Calculadora.java
│
├── test/
│   └── calculadora/
│       └── CalculadoraTest.java
│
├── docs/
│   └── calculadora
│   └── index-files
│   └── legal
│   └── resources
│   └── script-dir
│
├── images/
│   ├── testes/
│   └── javadoc/
|   └── refatoracao
│
├── README.md
```

---

# 11. Considerações Finais

O desenvolvimento desta atividade permitiu compreender na prática a importância da qualidade de software durante o processo de desenvolvimento.

A partir da análise do código original, foi possível identificar pontos que poderiam ser melhorados e aplicar técnicas de refatoração para tornar a aplicação mais organizada e facilitar sua manutenção.

A separação das operações em métodos independentes também contribuiu para melhorar a reutilização do código e possibilitar a realização de testes específicos.

Além disso, a utilização de JavaDoc permite que outros desenvolvedores compreendam melhor a estrutura e o funcionamento da aplicação.

Por fim, a atividade reforçou a importância dos testes de software, da documentação técnica e do versionamento como práticas fundamentais da Engenharia de Software.

---

# 12. Repositório GitHub

[**Link do repositório:** ](https://github.com/MarcosAlcantaraLeme/Atividade-Refatora-o-UX-UI)

---

<sub>Projeto acadêmico desenvolvido para a disciplina de UX/UI e Testes de Software — 2026.2.</sub>
