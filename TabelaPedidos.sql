CREATE TABLE [dbo].[Tabela_Pedidos](
	[Cliente] [varchar](11) NOT NULL,
	[Código do Pedido] [int] NOT NULL,
	[Frete] [money] NOT NULL,
	[Preço Total] [money] NOT NULL,
	[Código do Carrinho] [int] NOT NULL, )

ALTER TABLE [dbo].[Tabela_Pedidos]
ADD CONSTRAINT [PK_Pedido] 
PRIMARY KEY CLUSTERED ([Código do Pedido])

ALTER TABLE [dbo].[Tabela_Pedidos]
ADD  CONSTRAINT [FK_ClientePedido] FOREIGN KEY([Cliente]) REFERENCES [dbo].[Tabela_Clientes] ([CPF])

ALTER TABLE [dbo].[Tabela_Pedidos]
ADD  CONSTRAINT [FK_CodigoCarrinho] 
FOREIGN KEY([Código do Carrinho]) REFERENCES [dbo].[Tabela_Carrinhos] ([CÓDIGO DO CARRINHO])



