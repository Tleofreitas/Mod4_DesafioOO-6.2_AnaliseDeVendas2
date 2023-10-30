# Projeto Análise de Vendas 2 - Capítulo: Programação funcional e expressões lambda
## Desafio proposto
Você deve ler um arquivo .csv contendo uma base de dados de registros de venda, e instanciar na memória uma lista de objetos do tipo Sale,
conforme projeto abaixo (Atenção: não use tipos primitivos int e double nos atributos e métodos! Use os tipos wrapper Integer e Double,
conforme mostrado no projeto).

![image](https://user-images.githubusercontent.com/88738577/210095673-379f3fa5-0e86-4431-ac7d-e2e636511c11.png)

Favor baixar a base de dados .csv daqui: https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379

Depois de ler os dados, seu programa deverá mostrar o total vendido por cada vendedor conforme exemplo (a ordem em que os vendedores são mostrados não importa).

Atenção: seu programa é que deve varrer toda a lista para encontrar os nomes dos vendedores.

Atenção: caso ocorra alguma falha na leitura do arquivo, a exceção deve ser tratada, e mostrada uma mensagem conforme exemplo.

Dicas:
1) Para resolver este problema, você deve primeiro varrer toda a lista gerando os nomes únicos de cada
vendedor. Para fazer isso de forma eficiente, use a coleção Set ou Map, pois estas não admitem repetição.
2) Uma vez que você tenha uma coleção com os nomes únicos de cada vendedor, use métodos Stream +
lambda para extrair o total vendido por cada um.

---
EXEMPLO 1 (CONSIDERANDO A BASE DE DADOS ACIMA): <br>
Entre o caminho do arquivo: c:\temp\in.csv <br>

*Resultado esperado:*

Total de vendas por vendedor: <br>
Logan - R$ 220443.05 <br>
Rachel Roth - R$ 502478.67 <br>
Padme Amidala - R$ 473104.63 <br>
Victor Von Doom - R$ 478657.40 <br>
Barry Allen - R$ 499946.28 <br>
Anakin - R$ 477153.54 <br>
Kal-El - R$ 444881.58 <br>
Wanda Maximoff - R$ 470741.34 <br>

---
EXEMPLO 2: <br>
Entre o caminho do arquivo: c:\temp\in <br>

*Resultado esperado:* 

Erro: c:\temp\in (O sistema não pode encontrar o arquivo especificado)

---
## *Realizando teste do código localmente* 
O Windows 10 já possui um programa padrão para visualizar arquivos compactados.

Caso seu sistema operacional seja anterior ao Windos 10, realize o passo abaixo:

Para visualizar o projeto você precisará extrair os arquivos através de um programa para arquivos compactados.

Recomendo Winrar, baixe a versão 32x ou 64x, de acordo com seu sistema.

Link para download:
https://www.win-rar.com/download.html

---
## 📦️ *Como Testar o Código*
Para executar este passo, você tera que ter uma IDE instalada em sua máquina. Utilizei o Eclipse.


Siga o passo a passo abaixo:
```bash
  # Clone o repositório
  ❯ Clique no botão Code, depois em Download ZIP e salve o arquivo.

  # Extrair arquivos sem Winrar
  > Abra a pasta onde o arquivo foi salvo.
  >> Clique com o botão direito sobre o arquivo e selecione
  Extrair Tudo.
  As informações foram extraídas para a pasta Mod4_DesafioOO-6.2_AnaliseDeVendas2-main.

  # Extrair arquivos com Winrar
  > Abra a pasta onde o arquivo foi salvo.
  >> Clique com o botão direito sobre o arquivo e selecione Extrair Aqui (Extract Here).
  As informações foram extraídas para a pasta Mod4_DesafioOO-6.2_AnaliseDeVendas2-main.
  
  # Abrir o projeto
  > No Eclipse, clique em *File* e após em *Open Projects from File System...*
  >> Selecione a pasta do projeto e depois clique em *Finish*
  Aguarde a IDE carregar os arquivos e então visualize o código fonte.
  
```

---
## ⚠️ *Erros comuns* ⚠️

No passo *Como Testar o Código*, se não houver a opção *Extrair Tudo*, significa que não há programa instalado para manipulação de arquivos compactados.
Neste cado, seguir com o passo *Realizando teste do código localmente*.

No passo *Abrir o projeto*, após os arquivos serem carregados, pode acontecer de aparecer um X ou um ! vermelho. Caso isso ocorra, tente as soluções deste
tutorial: https://www.youtube.com/watch?v=Je4JWWJcyo0

---
## *Contribuidores* 🔥👊
Este projeto foi desenvolvido durante o curso Formação Desenvolvedor Moderno da escola [@DevSuperior](https://devsuperior.com.br), sobe orientação do tutor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br).
