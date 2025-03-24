# avaliacaoBack

Documentação da Avaliação: Sistema de Biblioteca




A) Sistema back-end web para gerenciar empréstimos de livros, seguindo o padrão MVC. Permite controlar as aplicações feitas com endpoints como cadastro de clientes, livros e controle de prazos, sem uso de banco de dados(Apenas usando swagger)


B) Model:  Representa informações (clientes, livros, empréstimos).
Controller:  Processa as regras de negócio.
View: Estrutura das respostas da API(interação com o usuario).

D) Endpoints
Clientes: Criar, visualizar(post e get).

Livros: Criar, visualizar(post e get).

Empréstimos: Criar, atualizar, consultar e excluir(get, post, put , delete).


E) 
Singleton: Garante que a classe tenha só uma instância e fornece um ponto de acesso global a essa instância. 
Factory Method: Define uma interface para criar um objetoe e permite que as subclasses decidam qual classe instanciar.  
Observer: Faz com que todos os seus dependentes são notificados e atualizados. 
Adapter: Converte a interface de uma classe em outra interface que os clientes esperam. 


F) Padrões que Ajudariam

Observer: Notifica as mudanças nos empréstimos.

Decorator: Adiciona funcionalidades sem modificar código base.







