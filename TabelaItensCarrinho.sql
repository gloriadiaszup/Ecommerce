CREATE TABLE [dbo].[Tabela_Itens_Carrinho](
	[C�DIGO DO CARRINHO] [int] NOT NULL,
	[C�DIGO DO PRODUTO] [int] NOT NULL,
	[QUANTIDADE] [int] NOT NULL,
	[PRE�O] [money] NOT NULL,
 CONSTRAINT [PK_Tabela_Itens_Carrinho_1] PRIMARY KEY CLUSTERED 
([C�DIGO DO CARRINHO])

ALTER TABLE [dbo].[Tabela_Itens_Carrinho]
ADD  CONSTRAINT [FK_Carrinho] 
FOREIGN KEY([C�DIGO DO CARRINHO]) REFERENCES [dbo].[Tabela_Carrinhos] ([C�DIGO DO CARRINHO])


ALTER TABLE [dbo].[Tabela_Itens_Carrinho]
ADD  CONSTRAINT [FK_Produto] 
FOREIGN KEY([C�DIGO DO PRODUTO]) REFERENCES [dbo].[Tabela_Produtos] ([C�DIGO DO PRODUTO])



