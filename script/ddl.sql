CREATE TABLE TEMPLATE_CONFIG 
(
   CONFIG__ID           INT  PRIMARY KEY NOT NULL AUTO_INCREMENT ,
   TEMPLATE_ID          INT                   NOT NULL,
   CREATOR              VARCHAR(128)                   NULL,
   MODIFIER             VARCHAR(128)                   NULL,
   IS_DELETED           VARCHAR(1)                        NULL,
   EXT1                 VARCHAR(128)                   NULL,
   EXT2                 VARCHAR(128)                   NULL,
   EXT3                 VARCHAR(128)                   NULL,
   EXT4                 VARCHAR(128)                   NULL,
   EXT5                 VARCHAR(128)                   NULL
   );
   
DROP TABLE IF EXISTS TEMPLATE_NODE;

/*==============================================================*/
/* Table: TEMPLATE_NODE                                         */
/*==============================================================*/
CREATE TABLE TEMPLATE_NODE 
(
   NODE_ID              INT                            NOT NULL AUTO_INCREMENT,
   CREATOR              VARCHAR(128)                   NULL,
   MODIFIER             VARCHAR(128)                   NULL,
   IS_DELETED           VARCHAR(1)                       NULL,
   IS_DONE              VARCHAR(1)                        NULL,
   IS_DELAY             VARCHAR(1)                        NULL,
   PAGR_URL             VARCHAR(128)                   NULL,
   NODE_TYPE            VARCHAR(1)                        NULL,
   PRE_NODE             INT                            NULL,
   CLASS                VARCHAR(128)                   NULL,
   METHOD               VARCHAR(128)                   NULL,
   NEXT_NODE            INT                            NULL,
   PARENT_NODE          INT                            NULL,
   EXT1                 VARCHAR(128)                   NULL,
   EXT2                 VARCHAR(128)                   NULL,
   EXT3                 VARCHAR(128)                   NULL,
   EXT4                 VARCHAR(128)                   NULL,
   EXT5                 VARCHAR(128)                   NULL,
   CONSTRAINT PK_TEMPLATE_NODE PRIMARY KEY clustered (NODE_ID)
);