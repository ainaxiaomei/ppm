drop table if exists TEMPLATE_CONFIG;

/*==============================================================*/
/* Table: TEMPLATE_CONFIG                                       */
/*==============================================================*/
create table TEMPLATE_CONFIG
(
   TEMPLATE_ID          int                            not null,
   CONFIG__ID           int                            not null,
   CREATOR              varchar(128)                   null,
   MODIFIER             varchar(128)                   null,
   IS_DELETED           varchar(1)                     null,
   EXT1                 varchar(128)                   null,
   EXT2                 varchar(128)                   null,
   EXT3                 varchar(128)                   null,
   EXT4                 varchar(128)                   null,
   EXT5                 varchar(128)                   null,
   START_NODE           int                            not null,
   constraint PK_TEMPLATE_CONFIG primary key clustered (TEMPLATE_ID, CONFIG__ID)
);
   
drop table if exists TEMPLATE_NODE;

drop table if exists TEMPLATE_NODE;

/*==============================================================*/
/* Table: TEMPLATE_NODE                                         */
/*==============================================================*/
create table TEMPLATE_NODE
(
   TEMPLATE_ID          int                            not null,
   NODE_ID              int                            not null,
   CREATOR              varchar(128)                   null,
   MODIFIER             varchar(128)                   null,
   IS_DELETED           varchar(1)                     null,
   IS_DONE              varchar(1)                     null,
   IS_DELAY             varchar(1)                     null,
   PAGR_URL             varchar(128)                   null,
   NODE_TYPE            varchar(1)                     null,
   PRE_NODE             int                            null,
   CLASS_NAME           varchar(128)                   null,
   METHOD_NAME          varchar(128)                   null,
   NEXT_NODE            int                            null,
   PARENT_NODE          int                            null,
   EXT1                 varchar(128)                   null,
   EXT2                 varchar(128)                   null,
   EXT3                 varchar(128)                   null,
   EXT4                 varchar(128)                   null,
   EXT5                 varchar(128)                   null,
   constraint PK_TEMPLATE_NODE primary key clustered (TEMPLATE_ID, NODE_ID)
);
DROP TABLE IF EXISTS PROJECT;

/*==============================================================*/
/* Table: PROJECT                                               */
/*==============================================================*/
CREATE TABLE PROJECT 
(
   PROJECT_ID           INTEGER                        NOT NULL,
   TEMPLATE_ID          VARCHAR(128)                   NOT NULL,
   QA                   VARCHAR(64)                    NULL,
   PROJECT_TYPE         VARCHAR(64)                    NULL,
   PD                   VARCHAR(64)                    NULL,
   WORK_TARGET          VARCHAR(64)                    NULL,
   PRODUCT_LINE         VARCHAR(64)                    NULL,
   TECHNICAL_MANAGER    VARCHAR(64)                    NULL,
   PROJECT_MANAGER      VARCHAR(64)                    NULL,
   WORK_LOAD            INTEGER                        NULL,
   RELATED_SYSTEM       VARCHAR(64)                    NULL,
   DOC_URL              VARCHAR(64)                    NULL,
   AONE                 VARCHAR(64)                    NULL,
   FRD                  VARCHAR(64)                    NULL,
   PROJECT_NAME         VARCHAR(64)                    NULL,
   CREATOR              VARCHAR(128)                   NULL,
   `MODIFIER`           VARCHAR(128)                   NULL,
   IS_DELETED           VARCHAR(1)                     NULL,
   EXT1                 VARCHAR(128)                   NULL,
   EXT2                 VARCHAR(128)                   NULL,
   EXT3                 VARCHAR(128)                   NULL,
   EXT4                 VARCHAR(128)                   NULL,
   EXT5                 VARCHAR(128)                   NULL,
   KICKOFF_TIME         DATE                           NULL,
   PUBLICATION_DATE     DATE                           NULL,
   CONSTRAINT PK_PROJECT PRIMARY KEY clustered (PROJECT_ID)
);
DROP TABLE IF EXISTS PROJECT_PHASE;

/*==============================================================*/
/* Table: PROJECT_PHASE                                         */
/*==============================================================*/
CREATE TABLE PROJECT_PHASE 
(
   PROJECT_ID           VARCHAR(128)                   NOT NULL,
   TEMPLATE_ID          VARCHAR(128)                   NOT NULL,
   PHASE_NAME           VARCHAR(128)                   NULL,
   START_TIME           DATE                           NULL,
   FINISH_TIME          DATE                           NULL,
   ACTUAL_FINISHTIME    DATE                           NULL,
   EXT1                 VARCHAR(128)                   NULL,
   EXT2                 VARCHAR(128)                   NULL,
   EXT3                 VARCHAR(128)                   NULL,
   EXT4                 VARCHAR(128)                   NULL,
   EXT5                 VARCHAR(128)                   NULL,
   CONSTRAINT PK_PROJECT_PHASE PRIMARY KEY clustered (PROJECT_ID, TEMPLATE_ID)
);