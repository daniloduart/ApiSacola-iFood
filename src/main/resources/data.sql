INSERT INTO restaurante (id, cep, complemento, nome) VALUES
(1L, '52060-210', 'Estr. do Encanamento, 361 - Parnamirim', 'Famiglia Lucco'),
(2L, '52291-000', 'Av. da Recuperação, 7343 - Dois Irmãos', 'CocoBambu');

INSERT INTO cliente (id, cep, complemento, nome) VALUES
(1L, '50920-525', 'Condominio Monte Ville', 'Danilo Duarte');

INSERT INTO produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1L, true, 'nhoque a bolonhesa', 25.0, 1L),
(2L, true, 'maminha completa', 86.0, 1L),
(3L, true, 'Picanha Argentina completa', 117.0, 2L);

INSERT INTO sacola (id, forma_pagamento, fechada, valor_total, cliente_id) VALUES
(1L, 0, false, 0.0, 1L);