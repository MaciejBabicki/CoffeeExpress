package CoffeeExpressProgramm.coffee.db.migrations;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

class V2__insert_example_todo extends BaseJavaMigration {
    @Override
    public void migrate(final Context context) {
        new JdbcTemplate(new SingleConnectionDataSource(context.getConnection(), true))
                .execute("insert into coffees (name, done) VALUES ('Obelix', true)");
    }
}