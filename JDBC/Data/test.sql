-- 组织管理表
create table if not exists test.`t_organization`
(
    `id`         varchar(256) not null comment '主键' primary key,
    `o_name`     varchar(256) null comment '党组织名称',
    `o_code`     varchar(256) null comment '党组织代码',
    `o_category` varchar(256) null comment '党组织类别',
    `o_entered`  varchar(256) null comment '已录入人数',
    `o_username` varchar(256) null comment '联系人姓名',
    `o_phone`    varchar(256) not null comment '联系人联系方式',
    `is_deleted` varchar(256) not null comment '状态码'
) comment '组织管理表';

insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('chq5Y', '湖南科技大学', '156.227.166.214', 'OpenEdge ABL', '38', '李睿渊', '15584849034', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('yM', '西南师范大学', '19.33.126.207', 'Scheme', '68', '刘文博', '15393714513', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('T41T', '合肥工业大学', '199.245.196.194', 'PL/SQL', '11', '侯皓轩', '15817132514', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('ymWwi', '山西中医学院', '253.88.153.150', 'D', '7', '郭思远', '15185155927', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('cGodC', '广东工业大学', '97.178.141.163', 'ML', '57', '薛乐驹', '17723466318', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('zWh', '赤峰学院', '147.248.118.2', 'Bourne shell', '65', '韩鹤轩', '14781852584', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('ygKi', '广西中医学院', '70.77.208.4', 'Hack', '3', '阎浩宇', '15609085165', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('SAaNT', '华中师范大学', '116.129.165.210', 'Racket', '80', '龚昊强', '17610727536', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('3zL', '浙江大学', '23.117.43.237', 'J#', '32', '贺耀杰', '18181320313', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('9jewP', '北京中医药大学', '101.205.212.233', 'FoxPro', '2', '田俊驰', '13957468774', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('SBFL', '中国计量学院', '207.107.231.126', 'Scratch', '10', '覃鹏', '15365899779', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('LbW', '湘潭大学', '185.198.180.77', 'Logo', '54', '傅志泽', '17785571112', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('mMwjE', '清华大学', '152.148.191.125', 'PL/I', '49', '黎绍齐', '14596916397', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('WmjB', '福建医科大学', '153.128.28.214', 'Apex', '71', '戴彬', '17073274053', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('jo', '华北水利水电学院', '40.76.197.207', 'Snap!', '15', '韦琪', '17569826512', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('UyA1', '中北大学', '20.21.122.142', 'Fortran', '23', '于雨泽', '17846145664', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('aK', '安徽工程科技学院', '70.246.165.245', 'TypeScript', '34', '吕雨泽', '15290281630', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('RsrEY', '湛江海洋大学', '242.57.155.76', 'Hack', '25', '潘志强', '15079701962', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('f1y', '西南农业大学', '19.21.34.172', 'Go', '99', '熊晟睿', '17812669290', '0');
insert into test.`t_organization` (`id`, `o_name`, `o_code`, `o_category`, `o_entered`, `o_username`, `o_phone`,
                                   `is_deleted`)
values ('hfW', '对外经济贸易大学', '87.31.222.151', 'Icon', '15', '萧苑博', '15046041435', '0');