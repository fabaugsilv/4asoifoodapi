# FASE 6 - CONTAINERIZATION STRATEGY - DE 19/07 ATÉ 22/08
Implementar um Microsserviço em Docker de uma aplicação presente no diagrama arquitetural proposto. O código do Microsserviço deve ser hospedado em um GitHub público e conter as camadas Domain, Repository, Service e Controller.

# Grupo 26 - Arquitetura de Soluções -
Turma 4ASOO - 2020/2021
 * Carlos Polachini Zanoveli Junior - RM339605 - [https://www.linkedin.com/in/cpzjunior/](https://www.linkedin.com/in/cpzjunior/)
 * Daniel de Paula Ferreira Nascimento - RM339297 - [https://www.linkedin.com/in/dpfnascimento/](https://www.linkedin.com/in/dpfnascimento/)
 * Fábio Augusto da Silva - RM 339717 - [https://www.linkedin.com/in/fabaugsilv/](https://www.linkedin.com/in/fabaugsilv/)
 * Ítalo Claudio Silva - RM 339344 - [https://www.linkedin.com/in/italosilva-is/](https://www.linkedin.com/in/italosilva-is/)

# Detalhes da API
 * Unicórnio Escolhido - IFood
 * API Referência - [https://developer.ifood.com.br/docs/references](https://developer.ifood.com.br/docs/references)

## Como usar?
 * mvn clean install
 * docker build -t fiap/4asoifoodapi .
 * docker run -p 8026:8026 fiap/4asoifoodapi
 * GET http://localhost:8026/ifood/merchant/v1.0/merchants
 * GET http://localhost:8026/ifood/merchant/v1.0/merchants/3
 