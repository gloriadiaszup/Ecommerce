CREATE TABLE [dbo].[Tabela_Clientes](
	[NOME] [varchar](100) NOT NULL,
	[TELEFONE] [varchar](20) NOT NULL,
	[EMAIL] [varchar](50) NOT NULL,
	[RUA] [varchar](50) NOT NULL,
	[BAIRRO] [varchar](30) NOT NULL,
	[ESTADO] [varchar](2) NOT NULL,
	[CIDADE] [varchar](20) NOT NULL,
	[CEP] [varchar](8) NOT NULL,
	[NÚMERO] [int] NOT NULL,
	[CPF] [varchar](11) NOT NULL, )


ALTER TABLE [dbo].[Tabela_Clientes]
ADD CONSTRAINT PK_Cliente
PRIMARY KEY CLUSTERED ([CPF])




