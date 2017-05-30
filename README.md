	- `Usuario.email`: email do usuáro. Tipo: **String**.
  	- `Usuario.administrador`: se é ou não não administrador. Tipo: **Boolean**.
  	- `Usuario.cpf`: CPF do usuário. Tipo: **String**.
 -	- `Usuário.nome_sujo_na_praça`: 
  
 -- `Evento`: Inclui os seguintes atributos:
 +- `Evento`: 
 +	
 +	Inclui os seguintes atributos:
  
  	- `Evento.id`:	Código único para o evento. Tipo: **Integer**.
  	- `Evento.nome`: Nome do evento. Tipo: **String**.
 @@ -26,19 +27,46 @@ Esta projeto foi desenvolvido em java, e inclui as seguintes classes:
  	- `Instituição`: Nome da instituição que está organizando o evento . Tipo: **String**.
  	- `Local`: Local onde o evento está sendo organizado / realizado. Tipo:	**String**.
  
 -- `Atividade`:  Inclui os seguintes atributos:
 +- `Atividade`:  
 +	
 +	Inclui os seguintes atributos:
  
 -	- `Atividade.id`: Código único para o evento. Tipo: **Integer**.
 +	- `Atividade.id`: Código único para a atividade. Tipo: **Integer**.
  	- `Atividade.nome`: Nome da atividade dentro do evento. Tipo: **String**.
  	- `Atividade.categoria`: Categoria da atividade dentro do evento. Tipo: **String**.
  	- `Atividade.evento_id`: ID do evento ao qual a atividade está ligada. Tipo: **Integer**.
  
 -- `Participante`
 -	- id	int(2)
 -	- nome	string
 -	- categoria	string
 -	- cadastrado	boolean
 +- `Participante`: 
  
 -- Certificado
 -- Pagamento
 -- banco_de_dados
 +	Inclui os seguintes atributos:
 +
 +	- `Participante.id`: Código único para a atividade. Tipo: **Integer**.
 +	- `Participante.nome`:	Nome do participante. Tipo: **String**.
 +	- `Participante.categoria`: Categoria do participante. Tipo: **String**.
 +	- `Participante.cadastro`: Situação do cadastro do usuário (cadastrado ou não). Tipo: **Boolean**.
 +
 +- `Certificado`: 
 +
 +	Inclui os seguintes atributos:
 +
 +	- `Certificado.id`: ID único do certificado. Tipo: **Integer**.
 +	- `Certificado.evento_id`: ID do evento de onde o certificado é derivado. Tipo: **Integer**.
 +	- `Certificado.categoria_id`: ID da categoria de onde o evento é derivado. Tipo: **Integer**. 
 +	- `Certificado.participante_id`: ID da participante que detêm este certificado. Tipo: **Integer**.
 +	- `Certificado.liberado`: Status de liberação do certificado (liberado ou não). Tipo: **Boolean**.
 +
 +- `Pagamento`: 
 +
 +	Inclui os seguintes atributos:
 +	
 +	- `Pagamento.id`: ID único do pagamento. Tipo: **Integer**.
 +	- `Pagamento.evento_id`: ID do evento. Tipo: **Integer**.
 +	- `Pagamento.valor`: valor do pagamento. Tipo: **Float**.
 +	- `Pagamento.status`: status do pagamento. Tipo: **Float**.
 +	- `Pagamento.data_cadastro`: data em que o evento foi cadastrado. Tipo: **Date**.
 +	- `Pagamento.data_pagamento`: data em que o pagamento foi feito. Tipo: **Date**.
 +	- `Pagamento.data_final`: data limite para o pagamento ser efetuado. Tipo: **Date**.
 +
 +- `Banco_de_dados`: Inclui os seguintes atributos: 
 +
 +	**Aqui vem a treta ...**
