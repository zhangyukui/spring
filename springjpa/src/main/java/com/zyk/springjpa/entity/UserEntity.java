package com.zyk.springjpa.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data
public class UserEntity {

    /**
     * 主键由程序控制 默认的  SnowflakeIdHelper 分布式可以使用雪花算法生成主键
     *
     * @GeneratedValue(strategy = GenerationType.AUTO,generator = "userId")
     * @GenericGenerator(name = "userId",strategy = "com.zyk.springjpa.core.CustomIDGenerator")
     * <p>
     * mysql 自增索引， 需要数据酷配置， 如果新增异常后， Id 不会回退，如：现有数据库序列为6 ， 新增7时报错， 再次新增时，Id为8
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * <p>
     * orcale 序列主键  allocationSize 的作用，次预先分配序列号的数目 放入缓存中
     * @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mseq")
     * @SequenceGenerator(name = "mseq",sequenceName = "xxx",allocationSize = 50)
     * <p>
     * 根据表来建立主键 allocationSize 的作用，次预先分配序列号的数目 放入缓存中   如果大于1  会导致， 每次项目重启， ID出现断层
     * @GeneratedValue(strategy = GenerationType.TABLE,generator = "tableId")
     * @TableGenerator(name="tableId", //name 属性表示该主键生成策略的名称,它被引用在@GeneratedValue中设置的generator 值中
     * table="JPA_ID_GENERATOR",//table 属性表示表生成策略所持久化的表名
     * pkColumnName="PK_NAME",//表示在持久化表中，该主键生成策略所对应键值的名称
     * pkColumnValue="CUSTOMER_ID", // CUSTOMER_ID 对应的 PK_VALUE存储的就是 Customer表最新的一条数据的主键
     * valueColumnName="PK_VALUE",//持久化表中，该主键当前所生成的值，它的值将会随着每次创建累加
     * allocationSize=50)
     */

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "tableId")
    @TableGenerator(name = "tableId", //name 属性表示该主键生成策略的名称,它被引用在@GeneratedValue中设置的generator 值中
            table = "JPA_ID_GENERATOR",//table 属性表示表生成策略所持久化的表名
            pkColumnName = "PK_NAME",//表示在持久化表中，该主键生成策略所对应键值的名称
            pkColumnValue = "CUSTOMER_ID", // CUSTOMER_ID 对应的 PK_VALUE存储的就是 Customer表最新的一条数据的主键
            valueColumnName = "PK_VALUE",//持久化表中，该主键当前所生成的值，它的值将会随着每次创建累加
            allocationSize = 10)
    private Long id;

    private String username;

    private String password;

    private String email;

}
