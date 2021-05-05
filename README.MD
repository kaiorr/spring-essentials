### Spring Essentials

### Icialmente será desenvolvido um CRUD e ir avançando para demais assuntos complexos 

- [x] ``@GetMapping`` nada mais é do que uma requisição ``GET`` que nesse cenário de uma lista de Animes, está utilizando o 
método ``list()`` para listar todos e método ``findById()`` que recebe o id do anime como parâmetro para consultar o mesmo.
  
- [x] ``@PostMapping`` nada mais é do que uma requisição ``POST`` que está utilizando anottation ``@RequestBody`` com a lista de anime.

- [x] ``@DeleteMapping`` para requisição delete onde é enviado somente o id como parâmetro para realizar a exclusão.

- [x] ``@PutMapping`` para realizar atualização de uma informação na api com o método ``replace()``