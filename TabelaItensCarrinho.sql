CREATE TABLE [dbo].[Tabela_Itens_Carrinho](
	[CÓDIGO DO CARRINHO] [int] NOT NULL,
	[CÓDIGO DO PRODUTO] [int] NOT NULL,
	[QUANTIDADE] [int] NOT NULL,
	[PREÇO] [money] NOT NULL,
 CONSTRAINT [PK_Tabela_Itens_Carrinho_1] PRIMARY KEY CLUSTERED 
([CÓDIGO DO CARRINHO])

ALTER TABLE [dbo].[Tabela_Itens_Carrinho]
ADD  CONSTRAINT [FK_Carrinho] 
FOREIGN KEY([CÓDIGO DO CARRINHO]) REFERENCES [dbo].[Tabela_Carrinhos] ([CÓDIGO DO CARRINHO])


ALTER TABLE [dbo].[Tabela_Itens_Carrinho]
ADD  CONSTRAINT [FK_Produto] 
FOREIGN KEY([CÓDIGO DO PRODUTO]) REFERENCES [dbo].[Tabela_Produtos] ([CÓDIGO DO PRODUTO])



