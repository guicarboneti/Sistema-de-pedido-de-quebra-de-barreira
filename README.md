# Sistema Pedido de quebra de barreira


# RESTANTES
LETICIA
- [ ] Terminar a interface gráfica para o aluno preencher a solicitação (O sistema deverá possibilitar que o aluno selecione um
conjunto de disciplinas que ele deseja cursar com informação sobre a prioridade delas) 
- [ ] Interface gráfica do restante das telas

THIAGO
- [ ] Cálculo do IRA do aluno com base no histórico 
- [ ] O sistema deverá então apresentar uma tabela com as matérias cursadas por período e as
matérias que faltam cursar para a barreira (TELA DE GRADE BCC DO ALUNO)

GUILHERME
- [ ] O sistema deverá calcular o número de disciplinas sugerido pelas regras aprovadas em colegiado e mostrar este resultado (TELA DE DISCIPLINAS SUGERIDAS)
- [ ] O sistema deverá mostra ao aluno o conjunto de disciplinas ofertadas neste semestre que não foram cursadas neste semestre por ordem de período 
(TELA DE DISCIPLINAS OFERTADAS)

CRISTIANO
- [ ] Gerar arquivo texto com os dados do pedido de quebra  (Quando o aluno selecionar enviar, o sistema deverá gerar um arquivo texto contendo os dados do pedido.)  - (TELA GERANDO ARQUIVO TEXTO)
- [ ] O sistema deve permitir salvar os dados do pedido em um arquivo de forma a permitir que o aluno os edite posteriormente.


OUTROS
- [ ] Implementar algum padrão visto em aula


TELAS
- TELA DE SOLICITAÇÃO
- TELA DE GRADE BCC DO ALUNO
- TELA DE DISCIPLINAS SUGERIDAS
- TELA DE DISCIPLINAS OFERTADAS
- TELA GERANDO ARQUIVO TEXTO

FLUXO
TELA DA GRADE DE BCC DO ALUNO -> TELA DE DISCIPLINAS OFERTADAS -> TELA DE DISCIPLINAS SUGERIDAS -> TELA DE SOLICATAÇÃO -> TELA GERANDO ARQUIVO TEXTO

## Fazer a estrutura

- [ ] Definir a organização dos arquivos (OK)
- [ ] Criar o makefile (OK)
- [ ] Classe Aluno (Leticia) (OK)
  - Matrícula
  - Nome
  - Período Atual
  - IRA
  - ArrayList materiasCursadas<'materia'>;
  - Arraylist materiasMatriculado<'materia'>;
  - Arraylist  materiasNaoCursadas<'materia'>;

  Aluno {
    matricula:
    nome:
    periodo atual:
    materiasCursadas = [ materia 1, materia2 ] 
    materiasMatriculado = [ materia 1, materia2 ] 
    materiasNaoCursadas = [ materia 1, materia2 ] 
    *Cada posição do arraylist é uma materia 
  }

  Funções:
  - Get e Set para cada atributo (cadastra aluno)
  - Get materiasCursadas por semestre

- [ ] Classe Matéria (Guilherme) (OK)
  - Codigo da Matéria 
  - Nome da Matéria
  - Carga horária
  - Status (Reprovado por Nota, Reprovado por freq, Aprovado, Sem Status)
  - (olhar o header na planilha para os campos)

  Funções:
  - Get e Set para cada atributo (cadastra materia)

- [ ] Classe Grade | Lista com as matérias do curso (Thiago) (OK)
    - Array do período com uma lista de matérias (Grade)
    
    - Arraylist gradeBcc2019<'materia'>,
    - Arraylist gradeBcc2011<'materia'>,
    
    Funções:
      - Get e Set para cada atributo (cadastra grade)
      - Aqui vou chamar a função de cadastro de nova materia()
    

- [ ] Classe Leitor (OK)
    Funções:
    - Leitura de int,string,double... (Thiago)
    - Le arquivo csv e adiciona no arraylist da GradeBcc2019 ou GradeBcc2011 (Thiago)
    - Le o historico do aluno e chama funcao cadastra Aluno da classe Aluno

- [ ] Classe Pedido de Quebra (armazenar os pedidos, para o aluno recuperar depois) (Cristiano) (OK)

- [ ] Classe Programa Principal (OK)
    - É o lugar que está a Main do projeto.
## Cadastrar o pedido de quebra

- [ ] Leitura da Grade de BCC (OK)
- [ ] Importar arquivo .csv com o histórico do aluno (OK)

## Verificar a situação do Aluno

- [ ] Processar as principais informações dos arquivos (OK)

## Gerar um arquivo texto com os dados atuais da quebra do aluno para editar depois

## Fazer interface gráfica

- [ ] Fazer a interface gráfica para o aluno preencher a solicitação
