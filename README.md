# Sistema Pedido de quebra de barreira

# RESTANTES

LETICIA

- [ ] Terminar a interface gráfica para o aluno preencher a solicitação (O sistema deverá possibilitar que o aluno selecione um
      conjunto de disciplinas que ele deseja cursar com informação sobre a prioridade delas)
- [ ] Interface gráfica do restante das telas

THIAGO

- [x] Cálculo do IRA do aluno com base no histórico
- [ ] O sistema deverá então apresentar uma tabela com as matérias cursadas por período e as
      matérias que faltam cursar para a barreira (TELA DE GRADE BCC DO ALUNO)

GUILHERME

- [ ] O sistema deverá calcular o número de disciplinas sugerido pelas regras aprovadas em colegiado e mostrar este resultado (TELA DE NÚMERO DE DISCIPLINAS SUGERIDAS)
- [ ] O sistema deverá mostra ao aluno o conjunto de disciplinas ofertadas neste semestre que não foram cursadas neste semestre por ordem de período
      (TELA DE DISCIPLINAS OFERTADAS)

CRISTIANO

- [ ] Gerar arquivo texto com os dados do pedido de quebra (Quando o aluno selecionar enviar, o sistema deverá gerar um arquivo texto contendo os dados do pedido.) - (TELA GERANDO ARQUIVO TEXTO)
- [ ] O sistema deve permitir salvar os dados do pedido em um arquivo de forma a permitir que o aluno os edite posteriormente.

OUTROS

- [ ] Implementar algum padrão visto em aula

TELAS

- TELA DE SOLICITAÇÃO
- TELA DE GRADE BCC DO ALUNO
- TELA DE NÚMERO DE DISCIPLINAS SUGERIDAS
- TELA DE DISCIPLINAS OFERTADAS (Perguntar pro Andrey)
- TELA GERANDO ARQUIVO TEXTO

FLUXO (REVER)

- TELA DA GRADE DE BCC DO ALUNO -> TELA DE DISCIPLINAS OFERTADAS -> TELA DE NÚMERO DE DISCIPLINAS SUGERIDAS -> TELA DE SOLICATAÇÃO -> TELA GERANDO ARQUIVO TEXTO

## Fazer a estrutura

- [x] Definir a organização dos arquivos
- [x] Criar o makefile
- [x] Classe Aluno (Leticia)

  - Matrícula
  - Nome
  - Período Atual
  - IRA
  - Histórico

  Aluno extends Historico{
  matricula:
  nome:
  periodo atual:
  }

  Funções:

  - Get e Set para cada atributo (cadastra aluno)
  - Get materiasCursadas por semestre

- [ ] Classe Matéria (Guilherme)

  - Codigo da Matéria
  - Nome da Matéria
  - Carga horária
  - Status (Reprovado por Nota, Reprovado por freq, Aprovado, Sem Status)
  - (olhar o header na planilha para os campos)

  Funções:

  - Get e Set para cada atributo (cadastra materia)

- [ ] Classe Grade | Lista com as matérias do curso (Thiago)

  - Array do período com uma lista de matérias (Grade)

  - Arraylist gradeBcc2019<'materia'>,
  - Arraylist gradeBcc2011<'materia'>,

  Funções: - Get e Set para cada atributo (cadastra grade) - Aqui vou chamar a função de cadastro de nova materia()

- [ ] Classe Leitor
      Funções:

  - Leitura de int,string,double... (Thiago)
  - Le arquivo csv e adiciona no arraylist da GradeBcc2019 ou GradeBcc2011 (Thiago)
  - Le o historico do aluno e chama funcao cadastra Aluno da classe Aluno

- [ ] Classe Pedido de Quebra (armazenar os pedidos, para o aluno recuperar depois) (Cristiano) (OK)

- [ ] Classe Programa Principal

  - É o lugar que está a Main do projeto.

- [ ] Classe Histórico

  - ArrayList materiasCursadas<'materia'>;
  - Arraylist materiasMatriculado<'materia'>;
  - Arraylist materiasNaoCursadas<'materia'>;

  Historico {
  materiasCursadas = [ materia 1, materia2 ]
  materiasMatriculado = [ materia 1, materia2 ]
  materiasNaoCursadas = [ materia 1, materia2 ]
  \*Cada posição do arraylist é uma materia
  }

  Funções:

  - Get e Set materiasCursadas por semestre

- [ ] Classe VerificaSituacaoAluno

  - classe irá verificar qual a possível situação do aluno com base em seu histórico e regras de quebra de barreira;
  - retorna qual essa situação;

## Cadastrar o pedido de quebra

- [ ] Leitura da Grade de BCC (OK)
- [ ] Importar arquivo .csv com o histórico do aluno (OK)

## Verificar a situação do Aluno

- [ ] Processar as principais informações dos arquivos (OK)

## Gerar um arquivo texto com os dados atuais da quebra do aluno para editar depois

## Fazer interface gráfica

- [x] Fazer a interface gráfica para o aluno preencher a solicitação
- [ ] Tirar da forma 'Absolut' e mudar para 'GridLayout'
- [ ] Criar interface para aluno ver o pedido que foi enviado e disciplinas que já fez/não fez
- [x] Criar controlador para interfaces (controlar botões, caixas de seleção...)

## Outros

- [ ] Implementar algum padrão que aprendemos
