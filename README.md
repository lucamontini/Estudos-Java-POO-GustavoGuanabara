# Estudos Java POO - Curso Gustavo Guanabara

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Curso em Vídeo](https://img.shields.io/badge/Curso%20em%20V%C3%ADdeo-Gratuito-00A86B?style=for-the-badge&logo=youtube&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)

Repositório de estudos referente ao curso **Java POO [40 Horas]** do professor **Gustavo Guanabara**, fundador do projeto **Curso em Vídeo**.

## Sobre o Curso

O curso **Java POO** é gratuito e ensina Programação Orientada a Objetos com Java de forma prática e progressiva. Aborda os quatro pilares da POO (Abstração, Encapsulamento, Herança e Polimorfismo), além de conceitos como classes, objetos, métodos, construtores, interfaces, classes abstratas e muito mais.

- **Professor**: Gustavo Guanabara
- **Plataforma**: [Curso em Vídeo](https://www.cursoemvideo.com/)
- **Curso**: [Java POO - 40 Horas](https://www.cursoemvideo.com/curso/java-poo)
- **Playlist YouTube**: [Curso POO Java](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)
- **GitHub do Professor**: [gustavoguanabara](https://github.com/gustavoguanabara) | [cursoemvideo](https://github.com/cursoemvideo)

## Estrutura do Repositório

```
.
├── aula01/     # Classes e Objetos básicos
├── aula02/     # Visibilidade: public, private, protected
├── aula03/     # Construtores e Encapsulamento (Getters/Setters)
├── aula04/     # Exercício prático: ContaBanco
├── aula05/     # Interfaces e Polimorfismo (ControleRemoto)
├── aula-07/    # Herança e Polimorfismo (UltraEmojiCombat)
├── aula-10/    # Herança: Projeto Pessoas (Pessoa, Professor, Aluno, Funcionário)
├── aula-11/    # Herança avançada (Bolsista, Visitante, Técnico)
├── aula-12/    # Classes Abstratas e Polimorfismo (Animal, Mamífero, Ave, Réptil, Peixe)
├── aula-13/    # Mais Herança e Polimorfismo
├── aula14/     # Projeto final com Graphify
├── .gitignore
└── README.md
```

Cada pasta é um projeto Java independente com estrutura padrão do VS Code:
- `src/` - Código fonte
- `bin/` - Arquivos compilados (.class)
- `lib/` - Dependências
- `.vscode/` - Configurações do VS Code

## Resumo das Aulas

| Aula | Tema Principal | Conceitos Abordados |
|------|---------------|---------------------|
| **01** | Classes e Objetos | Criação de classes, instância, atributos, métodos |
| **02** | Visibilidade | `public`, `private`, `protected`, encapsulamento básico |
| **03** | Construtores | Construtores, `this`, Getters/Setters |
| **04** | Encapsulamento Prático | Classe `ContaBanco`, validação em setters |
| **05** | Interfaces | `ControleRemoto`, `Controlador`, polimorfismo de interface |
| **07** | Herança/Polimorfismo | `Lutador`, `Luta`, herança, sobrescrita |
| **10** | Projeto Pessoas | Hierarquia `Pessoa` → `Professor`/`Aluno`/`Funcionário` |
| **11** | Herança Avançada | `Bolsista`, `Visitante`, `Técnico`, `super` |
| **12** | Classes Abstratas | `Animal` abstrato, `Mamifero`, `Ave`, `Reptil`, `Peixe` |
| **13** | Polimorfismo Avançado | Mais exemplos de classes abstratas e polimorfismo |
| **14** | Projeto Final | Integração com Graphify, aplicação completa |

## Como Executar

### Pré-requisitos
- **Java JDK 17+** instalado
- **VS Code** com extensão "Extension Pack for Java" (recomendado)

### Via VS Code (Recomendado)
1. Abra a pasta da aula desejada no VS Code (`File > Open Folder`)
2. A extensão Java detectará o projeto automaticamente
3. Pressione `F5` ou clique em "Run" na classe principal (ex: `Aula01.java`)

### Via Linha de Comando
```bash
# Navegue até a pasta da aula
cd aula01

# Compile
javac -d bin src/aula01/*.java

# Execute
java -cp bin aula01.Aula01
```

## Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **IDE**: Visual Studio Code
- **Extensões**: Extension Pack for Java (Microsoft)

## Licença

Este projeto está licenciado sob a **Licença MIT** - veja o arquivo [LICENSE](LICENSE) para detalhes.

> **Nota**: Este repositório contém exercícios de estudo baseados no curso gratuito **Java POO** do **Curso em Vídeo**. O conteúdo original pertence ao professor **Gustavo Guanabara** e ao projeto **Curso em Vídeo**. Este repositório é apenas para fins educacionais e de portfólio pessoal.

---

⭐ Se este repositório foi útil para seus estudos, deixe uma estrela!

[![GitHub Repo](https://img.shields.io/badge/GitHub-lucamontini%2FEstudos--Java--POO--GustavoGuanabara-181717?style=for-the-badge&logo=github)](https://github.com/lucamontini/Estudos-Java-POO-GustavoGuanabara)