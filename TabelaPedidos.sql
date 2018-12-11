CREATE TABLE [dbo].[Tabela_Pedidos](
	[Cliente] [varchar](11) NOT NULL,
	[C�digo do Pedido] [int] NOT NULL,
	[Frete] [money] NOT NULL,
	[Pre�o Total] [money] NOT NULL,
	[C�digo do Carrinho] [int] NOT NULL, )

ALTER TABLE [dbo].[Tabela_Pedidos]
ADD CONSTRAINT [PK_Pedido] 
PRIMARY KEY CLUSTERED ([C�digo do Pedido])

ALTER TABLE [dbo].[Tabela_Pedidos]
ADD  CONSTRAINT [FK_ClientePedido] FOREIGN KEY([Cliente]) REFERENCES [dbo].[Tabela_Clientes] ([CPF])

ALTER TABLE [dbo].[Tabela_Pedidos]
ADD  CONSTRAINT [FK_CodigoCarrinho] 
FOREIGN KEY([C�digo do Carrinho]) REFERENCES [dbo].[Tabela_Carrinhos] ([C�DIGO DO CARRINHO])



