# language: pt
# encoding: utf-8

 Funcionalidade: Acessar o site Tricentis, preencher um formulario e ver uma mensagem de sucesso

Cenario: Acessar o site da Trincentis
	Dado que o usuario esta no site tricentis
	
Cenario: Preencher o formulario da aba enter vehicle data e pressione next
	Quando o usuario esta na aba um "Enter Vehicle Data"
	E o usuario preenche o campo make "Nissan"
	E o usuario preenche o campo model "Moped"
	E o usuario preenche o campo cylinder capacity "100"
	E o usuario preenche o campo engine performance "300"
	E o usuario preenche o campo date of manufacture "10/05/2015"
	E o usuario preenche o campo number of seats1 "7"
	E o usuario preenche o campo right hand drive "No"
	E o usuario preenche o campo number of seats2 "2"
	E o usuario preenche o campo fuel type "Gas"
	E o usuario preenche o campo payload "80"
	E o usuario preenche o campo total weight "400"
	E o usuario preenche o campo list price "80000"
	E o usuario preenche o campo license plate number "TQX7850"
	E o usuario preenche o campo annual mileage "3200"
	E clica no botao next aba um

Cenario: Preencher o formulario da aba enter insurant e pressione next
	Quando o usuario esta na aba dois "Enter Insurant Data"
	E o usuario preenche o campo first name "Dominic"
	E o usuario preenche o campo last name "Toretto"
	E o usuario preenche o campo date of birth "05/24/1985"
	E o usuario preenche o campo gender "Male"
	E o usuario preenche o campo street address "Rua Marciano"
	E o usuario preenche o campo country "Brazil"
	E o usuario preenche o campo zip code "06848218"
	E o usuario preenche o campo city "Sao Paulo"
	E o usuario preenche o campo occupation "Employee"
	E o usuario preenche o campo hobbies "Other"
	E o usuario preenche o campo website "https://en.wikipedia.org/wiki/Dominic_Toretto"
	E clica no botao next aba dois
	
Cenario: Preencher o formulario da aba enter product data e pressione next
	Quando o usuario esta na aba tres "Enter Product Data"
	E o usuario preenche o campo start date "10/24/2021"
	E o usuario preenche o campo insurance sum "10.000.000,00"
	E o usuario preenche o campo merit rating "Bonus 9"
	E o usuario preenche o campo damage insurance "Full Coverage"
	E o usuario preenche o campo optional products "Legal Defense Insurance"
	E o usuario preenche o campo courtesy car "No"
	E clica no botao next aba tres
	
Cenario: Selecionar a opcao de preco do seguro e pressione next
	Quando o usuario esta na aba quatro "Select Price Option"
	E escolhe o valor seguro "Ultimate"
	E clica no botao next aba quatro
	
Cenario: Preencher o formulario da aba send quote e pressione send
	Quando o usuario esta na aba cinco "Send Quote"
	E o usuario preenche o campo email "dominic@testando.com"
	E o usuario preenche o campo phone "11985456958"
	E o usuario preenche o campo username "domivim"
	E o usuario preenche o campo password "14256Dom"
	E o usuario preenche o campo confirm password "14256Dom"
	E o usuario preenche o campo comments "Aceito os termos citados."
	E clica no botao send
	Entao verifica a mensagem "Sending e-mail success!"