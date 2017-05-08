/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  KaioT
 * Created: 07/05/2017
 */

CREATE TABLE USUARIO
(
    USUARIOID int not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    NOME VARCHAR (100),
    SOBRENOME VARCHAR (100),
    LOCALMORADIA VARCHAR (100),
    ESPORTEFAVORITO VARCHAR (100),
    RECEBERHOSPEDE VARCHAR (100),
    QUANTIDADEHOSPEDE VARCHAR (100)
)

SELECT *
FROM USUARIO

DROP TABLE USUARIO

CREATE TABLE HOSPEDAGEM
(
   IDHOSPEDAGEM VARCHAR (100) not null primary key,
   IDANFITRIAO VARCHAR (100),
   IDHOSPEDE VARCHAR (100),
   IDNOTA VARCHAR (100)
   
)