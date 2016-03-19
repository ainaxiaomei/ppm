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
   CLASS                varchar(128)                   null,
   METHOD               varchar(128)                   null,
   NEXT_NODE            int                            null,
   PARENT_NODE          int                            null,
   EXT1                 varchar(128)                   null,
   EXT2                 varchar(128)                   null,
   EXT3                 varchar(128)                   null,
   EXT4                 varchar(128)                   null,
   EXT5                 varchar(128)                   null,
   constraint PK_TEMPLATE_NODE primary key clustered (TEMPLATE_ID, NODE_ID)
);