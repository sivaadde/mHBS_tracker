package org.hisp.dhis.android.sdk.persistence.migrations.version13;

import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

import org.hisp.dhis.android.sdk.persistence.Dhis2Database;
import org.hisp.dhis.android.sdk.persistence.migrations.MigrationUtil;
import org.hisp.dhis.android.sdk.persistence.models.ProgramStage;
import org.hisp.dhis.android.sdk.persistence.models.ProgramStage$Table;

@Migration(version = 13, databaseName = Dhis2Database.NAME)
public class Version13MigrationProgramStage extends AlterTableMigration<ProgramStage> {

    public Version13MigrationProgramStage(Class<ProgramStage> table) {
        super(ProgramStage.class);
    }

    public Version13MigrationProgramStage() {
        super(ProgramStage.class);
    }

    @Override
    public void onPreMigrate() {
        super.onPreMigrate();
        if (!MigrationUtil.columnExists(ProgramStage.class, ProgramStage$Table.HIDEDUEDATE)) {
            addColumn(Boolean.class, ProgramStage$Table.HIDEDUEDATE);
        }
        if (!MigrationUtil.columnExists(ProgramStage.class, ProgramStage$Table.PERIODTYPE)) {
            addColumn(String.class, ProgramStage$Table.PERIODTYPE);
        }
    }
}
