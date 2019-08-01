package io.github.victorhugonf.checklist.jpa.type;

import org.hibernate.dialect.PostgreSQL95Dialect;

import java.sql.Types;

public class PostgreSQLDialect extends PostgreSQL95Dialect {

    public PostgreSQLDialect(){
        this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
    }

}
