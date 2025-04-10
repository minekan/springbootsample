package com.example.springbootsample.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.example.springbootsample.dbflute.allcommon.*;
import com.example.springbootsample.dbflute.exentity.*;

/**
 * The DB meta of id_test. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class IdTestDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final IdTestDbm _instance = new IdTestDbm();
    private IdTestDbm() {}
    public static IdTestDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((IdTest)et).getId(), (et, vl) -> ((IdTest)et).setId((String)vl), "id");
        setupEpg(_epgMap, et -> ((IdTest)et).getVal(), (et, vl) -> ((IdTest)et).setVal((String)vl), "val");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "id_test";
    protected final String _tableDispName = "id_test";
    protected final String _tablePropertyName = "idTest";
    protected final TableSqlName _tableSqlName = new TableSqlName("id_test", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, String.class, "id", null, true, false, true, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnVal = cci("val", "val", null, null, String.class, "val", null, false, false, false, "varchar", 2147483647, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, NotNull, varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * val: {varchar(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVal() { return _columnVal; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnVal());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.springbootsample.dbflute.exentity.IdTest"; }
    public String getConditionBeanTypeName() { return "com.example.springbootsample.dbflute.cbean.IdTestCB"; }
    public String getBehaviorTypeName() { return "com.example.springbootsample.dbflute.exbhv.IdTestBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<IdTest> getEntityType() { return IdTest.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public IdTest newEntity() { return new IdTest(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((IdTest)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((IdTest)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
