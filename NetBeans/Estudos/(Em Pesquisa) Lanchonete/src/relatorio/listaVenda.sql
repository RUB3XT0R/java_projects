SELECT
     *,
     VENDAITEM.`numero` AS VENDAITEM_numero,
     VENDAITEM.`lanche` AS VENDAITEM_lanche,
     VENDAITEM.`quantidade` AS VENDAITEM_quantidade,
     VENDA.`dia` AS VENDA_dia,
     LANCHE.`descricao` AS LANCHE_descricao,
     LANCHE.`preco` AS LANCHE_preco
FROM
     `VENDAITEM` VENDAITEM INNER JOIN `LANCHE` LANCHE ON VENDAITEM.`lanche` = LANCHE.`codigo`
     INNER JOIN `VENDA` VENDA ON VENDAITEM.`numero` = VENDA.`numero`