CREATE TABLE [dbo].[Tabela_Itens_Carrinho](
	[C�DIGO DO PEDIDO] [int] NOT NULL,
	[C�DIGO DO PRODUTO] [int] NOT NULL,
	[QUANTIDADE] [int] NOT NULL,
	[PRE�O] [money] NOT NULL, )
 
 ALTER TABLE [dbo].[Tabela_Itens_Carrinho]
 ADD CONSTRAINT [PK_Tabela_Itens_Carrinho] 
 PRIMARY KEY CLUSTERED ([C�DIGO DO PRODUTO])

ALTER TABLE [dbo].[Tabela_Itens_Carrinho]  
ADD  CONSTRAINT [FK_Pedidos] 
FOREIGN KEY([C�DIGO DO PEDIDO])REFERENCES [dbo].[Tabela_Carrinhos] ([C�DIGO DO CARRINHO])

ALTER TABLE [dbo].[Tabela_Itens_Carrinho]  
ADD  CONSTRAINT [FK_Produto] 
FOREIGN KEY([C�DIGO DO PRODUTO]) REFERENCES [dbo].[Tabela_Produtos] ([C�DIGO DO PRODUTO])


