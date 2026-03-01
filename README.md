# 📱 Desafio DIO --- Modelagem UML e Implementação do iPhone

## 📌 Sobre o Projeto

Este projeto foi desenvolvido como parte do desafio de Programação
Orientada a Objetos da **Digital Innovation One (DIO)**.

O objetivo foi modelar e implementar, utilizando **UML e Java**, as
principais funcionalidades apresentadas no lançamento do iPhone:

-   🎵 Reprodutor Musical\
-   📞 Aparelho Telefônico\
-   🌐 Navegador na Internet

O projeto aplica conceitos fundamentais de:

-   Programação Orientada a Objetos (POO)
-   Interfaces
-   Implementação de contratos
-   Organização por pacotes
-   Modelagem UML

------------------------------------------------------------------------

## 🧠 Conceito Arquitetural

O iPhone foi modelado como uma classe que implementa três interfaces
distintas, representando seus diferentes papéis:

-   `ReprodutorMusical`
-   `AparelhoTelefonico`
-   `NavegadorInternet`

Isso demonstra o princípio de **segregação de responsabilidades** e uso
de **contratos via interface**.

------------------------------------------------------------------------

## 🏗️ Estrutura do Projeto

    iphone-java-uml/
    │
    ├── src/
    │   └── br/
    │       └── com/
    │           └── dio/
    │               └── iphone/
    │                   ├── Main.java
    │                   ├── iPhone.java
    │                   └── interfaces/
    │                       ├── ReprodutorMusical.java
    │                       ├── AparelhoTelefonico.java
    │                       └── NavegadorInternet.java
    │
    └── README.md

------------------------------------------------------------------------

## 📊 Diagrama UML (Modelo Conceitual)

                <<interface>>
              ReprodutorMusical
              -------------------
              + tocar()
              + pausar()
              + selecionarMusica(String)

                <<interface>>
              AparelhoTelefonico
              -------------------
              + ligar(String)
              + atender()
              + iniciarCorreioVoz()

                <<interface>>
              NavegadorInternet
              -------------------
              + exibirPagina(String)
              + adicionarNovaAba()
              + atualizarPagina()

                        ▲
                        │
                     iPhone

A classe `iPhone` implementa as três interfaces, assumindo múltiplos
comportamentos.

------------------------------------------------------------------------

## 💻 Tecnologias Utilizadas

-   Java 17+
-   VS Code
-   Terminal (javac / java)
-   UML (modelagem conceitual)

------------------------------------------------------------------------

## ▶️ Como Executar o Projeto

### 1️⃣ Compilar

No terminal, na raiz do projeto:

``` bash
javac -d bin (Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object FullName)
```

### 2️⃣ Executar

``` bash
java -cp bin br.com.dio.iphone.Main
```

------------------------------------------------------------------------

## 🎯 Conceitos Aplicados

✔ Interfaces como contrato\
✔ Implementação múltipla\
✔ Organização em pacotes\
✔ Encapsulamento\
✔ Uso de construtor\
✔ Sobrescrita com `@Override`\
✔ Controle de estado interno

------------------------------------------------------------------------

## 🚀 Resultado

O sistema simula:

-   Reprodução de música
-   Realização de chamadas
-   Navegação entre páginas
-   Abertura de abas
-   Atualização de página

Tudo estruturado sob os princípios da POO.

------------------------------------------------------------------------

## 📌 Aprendizados

Este desafio reforçou:

-   A importância da modelagem antes da implementação
-   A diferença entre `interface` e `class`
-   Como o Java aplica contratos via `implements`
-   Organização profissional de código

------------------------------------------------------------------------

## 👩🏻‍💻 Autora

**Bianca Casemira**\
Desenvolvedora em formação \| Java \| Arquitetura de Software \|
Engenharia de Sistemas
