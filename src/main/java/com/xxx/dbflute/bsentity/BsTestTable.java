package com.xxx.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.xxx.dbflute.allcommon.DBMetaInstanceHandler;
import com.xxx.dbflute.exentity.*;

/**
 * The entity of test_table as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTestTable extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** test_col: {PK, NotNull, varchar(2147483647)} */
    protected String _testCol;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "test_table";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_testCol == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsTestTable) {
            BsTestTable other = (BsTestTable)obj;
            if (!xSV(_testCol, other._testCol)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _testCol);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_testCol));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public TestTable clone() {
        return (TestTable)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] test_col: {PK, NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'test_col'. (basically NotNull if selected: for the constraint)
     */
    public String getTestCol() {
        checkSpecifiedProperty("testCol");
        return _testCol;
    }

    /**
     * [set] test_col: {PK, NotNull, varchar(2147483647)} <br>
     * @param testCol The value of the column 'test_col'. (basically NotNull if update: for the constraint)
     */
    public void setTestCol(String testCol) {
        registerModifiedProperty("testCol");
        _testCol = testCol;
    }
}
