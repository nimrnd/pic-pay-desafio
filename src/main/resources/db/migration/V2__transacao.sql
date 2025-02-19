CREATE TABLE transacao (
    id SERIAL PRIMARY KEY,
    valor NUMERIC(15,2) NOT NULL,
    pagador_id BIGINT NOT NULL,
    recebedor_id BIGINT NOT NULL,
    timestamp TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_pagador FOREIGN KEY (pagador_id) REFERENCES usuario(id),
    CONSTRAINT fk_recebedor FOREIGN KEY (recebedor_id) REFERENCES usuario(id)
);