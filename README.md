# clienteCredito
Projeto usando as tecnologias js angular java 8 e springboot
Pré Requisitos
-Instalar e ter configurado o banco de dados postgres na porta 5432 e usar os seguintes dados: login: postgres senha: admin 
  Para alterar estes valores pode editar o arquivo application. \src\main\resources\application 
-Ter Eclipse configurado com java 8 e Maven

Configurar e rodar a aplicação

-Importar o projeto como "maven project"
-Criar a configuração maven install do projeto e rodar
-Para rodar a aplicação usar a classe ClienteCreditoApplication.java para rodar como Java Aplication.

Como funciona a aplicação

-Acessar o link http://localhost:8080/
-Existe 2 menus
1-Cadastro
Todos os campos são obrigatórios, o campo Limite não possui formatação e deve usar o formato 9.99 para funcionar
2-Pesquisar cliente
-Realiza filtro, edita e exclui.

Classe de Teste

Foi adicionada a classe " AllTestes.java " para rodar teste como junit.
O teste tem como objetvo testar o metodo "obterTaxaClienteCredito".



