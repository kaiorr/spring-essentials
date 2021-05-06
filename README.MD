### Spring Essentials

### Icialmente será desenvolvido um CRUD e ir avançando para demais assuntos complexos 

- [x] ``@GetMapping`` nada mais é do que uma requisição ``GET`` que nesse cenário de uma lista de Animes, está utilizando o 
método ``list()`` para listar todos e método ``findById()`` que recebe o id do anime como parâmetro para consultar o mesmo.
  
- [x] ``@PostMapping`` nada mais é do que uma requisição ``POST`` que está utilizando anottation ``@RequestBody`` com a lista de anime.

- [x] ``@DeleteMapping`` para requisição delete onde é enviado somente o id como parâmetro para realizar a exclusão.

- [x] ``@PutMapping`` para realizar atualização de uma informação na api com o método ``replace()``.

### Instalando banco de dados com Docker 

- [x] Docker possibilita maior controle e possibilidades ao se utilizar banco de dados, pois o mesmo cria um container
não sendo necessário assim instalação na máquina.
  
- [x] Primeira opção: Comando ``docker run -e MYSQL_ROOT_PASSWORD=root --name mysql -d -p 3309:3306 mysql:5.7``
    - `-e`: informar o environment, user root e password root.
    - `-name` informar o nome da imagem.
    - `-d` banco de dados a ser utilizado
    - `-p` porta-local:porta-container
  
- [x] Segunda opção: Criação do arquivo docker-compose, nessa opção o arquivo é criado com a configurações
necessárias para criar o container, com a versão 3.3, foi necessário verificar qual o IP do container para 
  possiblitar a conexão no mesmo. ``docker inspect mysql | grep IPAddress``, comando para verificar o ip do container.