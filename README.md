# springapi-paginacao-security-swagger
Evolução do projeto basico de rest com spring boot, contendo agora paginação, cache, segurança com JWT e documentação da API com swagger.

Para acessar o swagger:
http://localhost:8080/swagger-ui.html

Para acessar o actuator:
http://localhost:8080/actuator

Para acessar os metodos que exigem autenticação seralizar a chamada para o metodo auth com o seguinte usuário e senha na pagina do swagger:

{
  "email": "aluno@email.com",
  "senha": "123456"
}

O método ira devolver o token JWT de acesso e o tipo dele que é Bearer.

Após isso, chamar os demais metodos que exisgem autenticação com o seguinte token Bearer no Header Authorization:

Ex: 

Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJBUEkgZG8gRsOzcnVtIGRhIEFsdXJhIiwic3ViIjoiMSIsImlhdCI6MTU4NTEzNjgyNSwiZXhwIjoxNTg1MjIzMjI1fQ.96GjQWQjatJNSG0LDjaecDjacxaF-zzWH7bDyyigDqE

