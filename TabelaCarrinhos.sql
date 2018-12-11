USE [E-commerce]
GO
CREATE TABLE [dbo].[Tabela_Carrinhos](
	[CÓDIGO DO CARRINHO] [int] NOT NULL,
	[CLIENTE] [varchar](11) NOT NULL,
	[PREÇO] [money] NOT NULL,
	[STATUS DO PEDIDO] [nchar](10) NOT NULL)


ALTER TABLE [dbo].[Tabela_Carrinhos]  
WITH CHECK ADD  CONSTRAINT [FK_Cliente] 
FOREIGN KEY([CLIENTE]) REFERENCES [dbo].[Tabela_Clientes] ([CPF])

ALTER TABLE [dbo].[Tabela_Carrinhos]
ADD CONSTRAINT PK_Tabela_Carrinhos
PRIMARY KEY CLUSTERED ([CÓDIGO DO CARRINHO])




