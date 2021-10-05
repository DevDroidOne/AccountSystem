

CREATE sequence ACCOUNT_SEQ
    start with 50002
    increment by 1;

CREATE TABLE DEMO_ACCOUNT_TYPE(
    ACCOUNT_TYPE_ID BIGINT  NOT NULL,
    MNEMONIC        VARCHAR(100) NOT NULL UNIQUE,
    ACCOUNT_TYPE_NAME   VARCHAR(255) NOT NULL,
    CREATION_DATE  DATE    NOT NULL,
    PRIMARY KEY (ACCOUNT_TYPE_ID)
);

CREATE TABLE ACCOUNT_TX
(
    TX_ID BIGINT  NOT NULL,
    ACCOUNT_TYPE_ID BIGINT NOT NULL,
    MEMBER_ID BIGINT NOT NULL,
    AMOUNT BIGINT NOT NULL,
    TX_DATE DATE NOT NULL,
    PRIMARY KEY (TX_ID),
    CONSTRAINT FK_ACCOUNT_TYPE_IDL FOREIGN KEY (ACCOUNT_TYPE_ID) REFERENCES DEMO_ACCOUNT_TYPE (ACCOUNT_TYPE_ID)
);