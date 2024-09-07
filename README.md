
<h1 align="center" style="font-weight: bold;">Dscommerce 💻</h1>

<p align='center'> 
    <img src="https://img.shields.io/badge/Spring_Boot  V2.7.3-F2F4F9?style=for-the-badge&logo=spring-boot"/>
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>  
    <img src="https://img.shields.io/badge/JWT-F2F4F9?style=for-the-badge&logo=JSON%20web%20tokens&logoColor=black"/>
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
    <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
   <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white"/>
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white"/>
</p> 


<p >
  <b>  
       O sistema deve manter um cadastro de usuários, produtos e suas respectivas categorias. Cada usuário possui os seguintes dados: nome, e-mail, telefone, data de nascimento e senha de acesso. As informações dos produtos incluem: nome, descrição, preço e imagem.

O sistema deve apresentar um catálogo de produtos, que pode ser filtrado pelo nome do produto. A partir desse catálogo, o usuário pode selecionar um produto para ver seus detalhes e decidir se deseja adicioná-lo ao carrinho de compras. O usuário pode incluir e remover itens do carrinho, bem como alterar as quantidades de cada item.

Uma vez que o usuário decida encerrar o pedido, o sistema deve salvar o pedido com o status "aguardando pagamento". Os dados de um pedido incluem: data e hora em que foi salvo, status, e uma lista de itens, onde cada item refere-se a um produto e sua quantidade no pedido. O status de um pedido pode ser: aguardando pagamento, pago, enviado, entregue ou cancelado. Quando o usuário efetua o pagamento, o sistema deve registrar o instante do pagamento.

Os usuários do sistema podem ser clientes ou administradores. Todo usuário cadastrado é, por padrão, um cliente. Usuários não cadastrados podem se registrar no sistema, navegar no catálogo de produtos e gerenciar o carrinho de compras. Clientes podem atualizar suas informações de cadastro, registrar pedidos e visualizar seus próprios pedidos.

Usuários administradores têm acesso à área administrativa, onde podem gerenciar cadastros de usuários, produtos e categorias.
  </b>
</p>

<h2 id="started">🚀 Começando</h2>

<h2>Modelo conceitual</h2>


![modelo conceitual](https://github.com/user-attachments/assets/624cb75d-01b0-419b-af6c-ad2115aa34bd)


<h2>Tecnologias utlizadas</h2>

- Java
- Springboot
- JPA
- Maven
- H2 Database
- Postman
- OAuth2
- JWT



<h2>Veja o projeto</h2>

Experimente live demo:

<p align='center'> <img src="https://i.imgur.com/r7Giga8.gif"/></p>

<h2>Como criar e executar o DSCommerce localmente</h2>

Criar e executar o projeto em seu ambiente de desenvolvimento local é muito fácil. Certifique-se de ter o Git e JDK17 instalados e siga as instruções abaixo. Precisa de informações adicionais? entre em contato no e-mail rodrigueswellington3@gmail.com 
(Estas instruções pressupõem que você esteja instalando como um usuário root.)

✅ Clone o código fonte

   ```bash
    git clone git@github.com:wellingtonrsdev/dscommerce.git
   ```

✅Em sua IDE de preferência(utilizei Intellij), importe a pasta **backend** e faça o update das dependências do **maven**.

✅ Ao executar o projeto, pode ser acessado um navegador da Web em http://localhost:8080/

✅ Collections do postman para fazer as requisições GET/PUT/DELETE E UPDATE para criação do usuário, lançar as pedidos e consultar todos os produtos. Obs: Será necessário configurar a variáveis de ambiente no postman.  

✅ Dados para login: maria@gmail.com (cliente) e alex@gmail.com (cliente e administrador).  

✅ senha: 123456
 
✅ Link da Collections do postman: https://www.getpostman.com/collections/2d18991dfa57a1f44592


<h2 id="routes">📍 API Endpoints</h2>

Principais endpoints da API, e respostas esperadas.
​
| Rotas               | descrição                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /products</kbd>     | retorna uma página com 12 produtos.
| <kbd>POST /products</kbd>     | Salva um novo produto passado no corpo da requisição
| <kbd>PUT /products/1</kbd>     | Atualiza o produto com as atualizções passadas no corpo da requisição
| <kbd>DELETE /products/1</kbd>     | Apaga o produto com id correspondente.
| <kbd>POST /products</kbd>     | Salva um novo produto passado no corpo da requisição
| <kbd>POST /products</kbd>     | Salva um novo produto passado no corpo da requisição


<h3 id="get-auth-detail">GET  /products</h3>

**RESPOSTA**
```json
{
    "content": [
        {
            "id": 10,
            "name": "PC Gamer Y",
            "price": 1700.0,
            "imgUrl": "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/10-big.jpg"
        },
        {
            "id": 11,
            "name": "PC Gamer Nitro",
            "price": 1450.0,
            "imgUrl": "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/11-big.jpg"
        },
        {
            "id": 12,
            "name": "PC Gamer Card",
            "price": 1850.0,
            "imgUrl": "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/12-big.jpg"
        }
    ]
```

<h3 id="post-auth-detail">POST /products</h3>

**REQUISIÇÃO**
```json
{
    "name": "Meu produto novo",
    "description": "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Qui ad, adipisci illum ipsam velit et odit eaque reprehenderit ex maxime delectus dolore labore, quisquam quae tempora natus esse aliquam veniam doloremque quam minima culpa alias maiores commodi. Perferendis enim",
    "imgUrl": "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/1-big.jpg",
    "price": 110.0,
    "categories": [
        {
           "id": 2 
        },
        {
            "id": 3
        }
    ]
}

```


## Autor:

  <div align="center">
   <h2>Wellington Rodrigues</h2>
      <img src="https://avatars.githubusercontent.com/u/99605930?v=4" width="100px;" alt="Wellington Rodrigues">
   </div>
   </br>

   <div align="center">
   <a href="mailto:rodrigueswellington3@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" alt="Enviar e-mail para o Gmail"></a>
  <a href="https://www.linkedin.com/in/wellington-rodrigues-rsdev" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
  <a href="https://www.dio.me/users/rodrigueswellington3" target="_blank"><img src="https://img.shields.io/badge/-Meu perfil na dio-%230077B5?style=for-the-badge&logo=dio&logoColor=white" target="_blank"></a>
</div>

<h2 id="contribute">📫 Contribua</h2>

Este é um projeto feito para a comunidade, então sinta-se livre para contribuir, você pode contribuir:
 
⚠️ Resolvendo, respondendo ou indicando **issues**

⭐ Adicionando aos favoritos (**star**) 
