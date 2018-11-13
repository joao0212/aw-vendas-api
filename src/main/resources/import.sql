insert into cliente (id, nome) values (1, 'João Victor');

insert into produto (id, nome, valor) values (1, 'Notebook Dell', 3000.0)
insert into produto (id, nome, valor) values (2, 'Desktop Sony', 4000.0)

insert into venda (id, cadastro, cliente_id, frete, total) values (1, sysdate(), 1, 15.0, 3015.0);

insert into item (id, venda_id, produto_id, quantidade) values (1, 1, 1, 1);