CREATE TABLE [dbo].[Tabela_Itens_Carrinho](
	[CÓDIGO DO PEDIDO] [int] NOT NULL,
	[CÓDIGO DO PRODUTO] [int] NOT NULL,
	[QUANTIDADE] [int] NOT NULL,
	[PREÇO] [money] NOT NULL, )
 
 ALTER TABLE [dbo].[Tabela_Itens_Carrinho]
 ADD CONSTRAINT [PK_Tabela_Itens_Carrinho] 
 PRIMARY KEY CLUSTERED ([CÓDIGO DO PRODUTO])

ALTER TABLE [dbo].[Tabela_Itens_Carrinho]  
ADD  CONSTRAINT [FK_Pedidos] 
FOREIGN KEY([CÓDIGO DO PEDIDO])REFERENCES [dbo].[Tabela_Carrinhos] ([CÓDIGO DO CARRINHO])

ALTER TABLE [dbo].[Tabela_Itens_Carrinho]  
ADD  CONSTRAINT [FK_Produto] 
FOREIGN KEY([CÓDIGO DO PRODUTO]) REFERENCES [dbo].[Tabela_Produtos] ([CÓDIGO DO PRODUTO])


