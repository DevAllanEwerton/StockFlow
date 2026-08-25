-- V2: Migrations para adicionar a coluna de fornecedor a tabela de produto

ALTER TABLE tb_produto
ADD COLUMN fornecedor VARCHAR(255);