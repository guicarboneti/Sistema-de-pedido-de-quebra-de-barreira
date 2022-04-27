# Sistema Pedido de quebra de barreira

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

- [ ] Classe Pedido de Quebra (armazenar os pedidos, para o aluno recuperar depois) (Cristiano)

- [ ] Classe Programa Principal

  - É o lugar que está a Main do projeto.

- [ ] Classe Histórico

  - ArrayList materiasCursadas<'materia'>;
  - Arraylist materiasMatriculado<'materia'>;
  - Arraylist materiasNaoCursadas<'materia'>;

  - [ ] Classe VerificaSituacaoAluno

    - classe irá verificar qual a possível situação do aluno com base em seu histórico e regras de quebra de barreira
    - retorna qual essa situação

  Historico {
  materiasCursadas = [ materia 1, materia2 ]
  materiasMatriculado = [ materia 1, materia2 ]
  materiasNaoCursadas = [ materia 1, materia2 ]
  \*Cada posição do arraylist é uma materia
  }

  Funções:

  - Get e Set materiasCursadas por semestre

## Cadastrar o pedido de quebra

- [ ] Leitura da Grade de BCC
- [ ] Importar arquivo .csv com o histórico do aluno

## Verificar a situação do Aluno

- [ ] Processar as principais informações dos arquivos
- [ ] Cálculo do desempenho do Aluno (semestre anterior)
- [ ] Cálculo das regras de desempenho
- [ ] Gera pdf do pedido de quebra

## Gerar um arquivo texto com os dados atuais da quebra do aluno para editar depois

## Fazer interface gráfica

- [x] Fazer a interface gráfica para o aluno preencher a solicitação
- [ ] Tirar da forma 'Absolut' e mudar para 'GridLayout'
- [ ] Criar interface para aluno ver o pedido que foi enviado e disciplinas que já fez/não fez
- [ ] Criar controlador para interfaces (controlar botões, caixas de seleção...)

## Outros

- [ ] Implementar algum padrão que aprendemos
