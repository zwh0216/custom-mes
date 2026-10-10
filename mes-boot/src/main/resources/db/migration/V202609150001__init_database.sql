# 页面的菜单表
create table menu
(
    id          bigint unsigned                            not null comment '菜单id'
        primary key,
    name        varchar(255)                               not null comment '菜单路径名称',
    path        varchar(255)                               not null comment '菜单的路径',
    title       varchar(50)                                not null comment '菜单的标题',
    type        tinyint                                    null comment '菜单的类型',
    disabled    tinyint          default 0                 null comment '当前菜单是否禁用',
    icon        varchar(50)                                null comment '菜单的自定义icon',
    parent      varchar(255)                               null comment '当前菜单的父菜单',
    version     tinyint unsigned default '0'               null comment '数据的版本号',
    `group`     varchar(255)                               null comment '当前菜单的分组',
    create_time datetime         default CURRENT_TIMESTAMP null comment '当前菜单的创建时间',
    update_time datetime         default CURRENT_TIMESTAMP null comment '当前菜单的更新时间'
);

# 用户表
create table user
(
    id                bigint unsigned   not null comment 'id，数据主键'
        primary key,
    name              varchar(20)       not null comment '名称',
    password          varchar(50)       not null,
    nick_name         varchar(20)       null,
    profile_photo_url varchar(255)      null,
    disabled          tinyint default 0 not null comment '当前用户是否禁用',
    update_time       datetime          null,
    create_time       datetime          not null
);

