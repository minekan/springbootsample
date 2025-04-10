package com.example.springbootsample.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.example.springbootsample.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.springbootsample.dbflute.exentity.*;

/**
 * The entity of key_test as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsKeyTest extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, NotNull, varchar(2147483647)} */
    protected String _id;

    /** val: {varchar(2147483647)} */
    protected String _val;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "key_test";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
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
        if (obj instanceof BsKeyTest) {
            BsKeyTest other = (BsKeyTest)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_val));
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
    public KeyTest clone() {
        return (KeyTest)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, NotNull, varchar(2147483647)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public String getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, NotNull, varchar(2147483647)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(String id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] val: {varchar(2147483647)} <br>
     * @return The value of the column 'val'. (NullAllowed even if selected: for no constraint)
     */
    public String getVal() {
        checkSpecifiedProperty("val");
        return _val;
    }

    /**
     * [set] val: {varchar(2147483647)} <br>
     * @param val The value of the column 'val'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVal(String val) {
        registerModifiedProperty("val");
        _val = val;
    }
}
