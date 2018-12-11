CREATE TABLE [dbo].[Tabela_Produtos](
	[NOME] [varchar](100) NOT NULL,
	[TAMANHO] [char](1) NOT NULL,
	[QUANTIDADE] [smallint] NOT NULL,
	[PRE�O] [money] NOT NULL,
	[C�DIGO DO PRODUTO] [int] NOT NULL)

ALTER TABLE [dbo].[Tabela_Produtos]
ADD CONSTRAINT [PK_Produtos] 
PRIMARY KEY CLUSTERED ([C�DIGO DO PRODUTO])


