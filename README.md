Fork do projeto pos-backend com inclusão de chamadas utilizando o conhecimento ensinado.

1 - Crie um crud para entidade Clube contendo as seguintes informações.
    Id: integer
    Nome : String
    Estado: String
    Email: String 
    Cnpj: String 
    DataCriacao : Date

2 - Validação de campos 
- Validar se o e-mail, CNPJ são válidos. 
- Não permitir a inclusão de campos em branco.
- Criar um custon validator que não permita incluir no nome do clube a lista de palavras ( Flamengo, Palmeiras, Fluminense, Botafogo)

3 - Criar uma integração com um serviço externo da escolha do time utilizando Feing. Pode ser criado um micro serviço novo em outra porta.

4 - Incluir dtos para todas as entidades anotadas com Entity, ou seja, nos controllers o que é respondido response para o usuário é sempre um 

5 - Criar uma chamada no repository de clube uma listagem que ordene pelo nome do clube de forma ascendente.
