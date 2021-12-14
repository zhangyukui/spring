package com.zyk.springjpa.core;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;

public class CustomIDGenerator extends IdentityGenerator {

    // SnowflakeIdHelper  全局唯一ID 生成工具类

    // @Override
    // public Serializable generate(SharedSessionContractImplementor session, Object object) throws MappingException {
    //     Object id = SnowflakeIdHelper.getId();
    //     if (id != null) {
    //         return (Serializable) id;
    //     }
    //     return super.generate(session, object);
    // }


    @Override
    public Serializable generate(SharedSessionContractImplementor s, Object obj) {

        return (Serializable)2L;
    }
}
