-- Gerado por Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   em:        2023-05-22 09:58:51 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE tab_certificacao (
    cd_certificacao NUMBER(3) NOT NULL,
    nm_certificacao VARCHAR2(30) NOT NULL
);

ALTER TABLE tab_certificacao ADD CONSTRAINT tab_certificacao_pk PRIMARY KEY ( cd_certificacao );

CREATE TABLE tab_fabrica (
    cd_fabrica      NUMBER(3) NOT NULL,
    nm_fabrica      VARCHAR2(30) NOT NULL,
    ds_cidade       VARCHAR2(40) NOT NULL,
    qt_ton_producao NUMBER(8, 2) NOT NULL
);

ALTER TABLE tab_fabrica ADD CONSTRAINT tab_fabrica_pk PRIMARY KEY ( cd_fabrica );

CREATE TABLE tab_fabrica_fornecedor (
    tab_fabrica_cd_fabrica   NUMBER(3) NOT NULL,
    tab_fornec_cd_fornecedor NUMBER(6) NOT NULL
);

ALTER TABLE tab_fabrica_fornecedor ADD CONSTRAINT tab_fabrica_fornecedor_pk PRIMARY KEY ( tab_fabrica_cd_fabrica );

CREATE TABLE tab_fornecedor (
    cd_fornecedor NUMBER(6) NOT NULL,
    nm_fornecedor VARCHAR2(40) NOT NULL
);

ALTER TABLE tab_fornecedor ADD CONSTRAINT tab_fornecedor_pk PRIMARY KEY ( cd_fornecedor );

CREATE TABLE tab_fornecedor_certificacao (
    t_fornec_cd_fornecedor   NUMBER(6) NOT NULL,
    t_certif_cd_certificacao NUMBER(3) NOT NULL,
    dt_validade              DATE NOT NULL
);

ALTER TABLE tab_fornecedor_certificacao ADD CONSTRAINT tab_fornecedor_certificacao_pk PRIMARY KEY ( t_fornec_cd_fornecedor );

CREATE TABLE tab_linha (
    cd_linha               NUMBER(4) NOT NULL,
    nm_linha               VARCHAR2(40) NOT NULL,
    tab_fabrica_cd_fabrica NUMBER(3) NOT NULL,
    tab_produto_cd_produto NUMBER(5) NOT NULL
);

ALTER TABLE tab_linha ADD CONSTRAINT tab_linha_pk PRIMARY KEY ( cd_linha );

CREATE TABLE tab_produto (
    cd_produto  NUMBER(5) NOT NULL,
    nm_produto  VARCHAR2(30) NOT NULL,
    gst_energia NUMBER(8, 2) NOT NULL,
    gst_agua    NUMBER(8, 2) NOT NULL,
    prc_perda   NUMBER(5, 2) NOT NULL
);

ALTER TABLE tab_produto ADD CONSTRAINT tab_produto_pk PRIMARY KEY ( cd_produto );

ALTER TABLE tab_fabrica_fornecedor
    ADD CONSTRAINT tab_fabr_fornec_tab_fabr_fk FOREIGN KEY ( tab_fabrica_cd_fabrica )
        REFERENCES tab_fabrica ( cd_fabrica );

ALTER TABLE tab_fabrica_fornecedor
    ADD CONSTRAINT tab_fabr_fornec_tab_fornec_fk FOREIGN KEY ( tab_fornec_cd_fornecedor )
        REFERENCES tab_fornecedor ( cd_fornecedor );

ALTER TABLE tab_fornecedor_certificacao
    ADD CONSTRAINT tab_forn_cert_tab_cert_fk FOREIGN KEY ( t_certif_cd_certificacao )
        REFERENCES tab_certificacao ( cd_certificacao );

ALTER TABLE tab_fornecedor_certificacao
    ADD CONSTRAINT tab_forn_cert_tab_forn_fk FOREIGN KEY ( t_fornec_cd_fornecedor )
        REFERENCES tab_fornecedor ( cd_fornecedor );

ALTER TABLE tab_linha
    ADD CONSTRAINT tab_linha_tab_fabrica_fk FOREIGN KEY ( tab_fabrica_cd_fabrica )
        REFERENCES tab_fabrica ( cd_fabrica );

ALTER TABLE tab_linha
    ADD CONSTRAINT tab_linha_tab_produto_fk FOREIGN KEY ( tab_produto_cd_produto )
        REFERENCES tab_produto ( cd_produto );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             0
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
