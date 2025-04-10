package com.example.springbootsample.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.example.springbootsample.dbflute.allcommon.*;
import com.example.springbootsample.dbflute.cbean.*;
import com.example.springbootsample.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of id_test.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsIdTestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsIdTestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "id_test";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_Equal(String id) {
        doSetId_Equal(fRES(id));
    }

    protected void doSetId_Equal(String id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotEqual(String id) {
        doSetId_NotEqual(fRES(id));
    }

    protected void doSetId_NotEqual(String id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_GreaterThan(String id) {
        regId(CK_GT, fRES(id));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_LessThan(String id) {
        regId(CK_LT, fRES(id));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(String id) {
        regId(CK_GE, fRES(id));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_LessEqual(String id) {
        regId(CK_LE, fRES(id));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<String> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<String> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<String> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<String> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param id The value of id as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setId_LikeSearch(String id, ConditionOptionCall<LikeSearchOption> opLambda) {
        setId_LikeSearch(id, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)} <br>
     * <pre>e.g. setId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param id The value of id as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setId_LikeSearch(String id, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(id), xgetCValueId(), "id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setId_NotLikeSearch(String id, ConditionOptionCall<LikeSearchOption> opLambda) {
        setId_NotLikeSearch(id, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     * @param id The value of id as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setId_NotLikeSearch(String id, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(id), xgetCValueId(), "id", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, NotNull, varchar(2147483647)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_Equal(String val) {
        doSetVal_Equal(fRES(val));
    }

    protected void doSetVal_Equal(String val) {
        regVal(CK_EQ, val);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_NotEqual(String val) {
        doSetVal_NotEqual(fRES(val));
    }

    protected void doSetVal_NotEqual(String val) {
        regVal(CK_NES, val);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_GreaterThan(String val) {
        regVal(CK_GT, fRES(val));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_LessThan(String val) {
        regVal(CK_LT, fRES(val));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_GreaterEqual(String val) {
        regVal(CK_GE, fRES(val));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_LessEqual(String val) {
        regVal(CK_LE, fRES(val));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * val: {varchar(2147483647)}
     * @param valList The collection of val as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_InScope(Collection<String> valList) {
        doSetVal_InScope(valList);
    }

    protected void doSetVal_InScope(Collection<String> valList) {
        regINS(CK_INS, cTL(valList), xgetCValueVal(), "val");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * val: {varchar(2147483647)}
     * @param valList The collection of val as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVal_NotInScope(Collection<String> valList) {
        doSetVal_NotInScope(valList);
    }

    protected void doSetVal_NotInScope(Collection<String> valList) {
        regINS(CK_NINS, cTL(valList), xgetCValueVal(), "val");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * val: {varchar(2147483647)} <br>
     * <pre>e.g. setVal_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param val The value of val as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVal_LikeSearch(String val, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVal_LikeSearch(val, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * val: {varchar(2147483647)} <br>
     * <pre>e.g. setVal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param val The value of val as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setVal_LikeSearch(String val, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(val), xgetCValueVal(), "val", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setVal_NotLikeSearch(String val, ConditionOptionCall<LikeSearchOption> opLambda) {
        setVal_NotLikeSearch(val, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * val: {varchar(2147483647)}
     * @param val The value of val as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setVal_NotLikeSearch(String val, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(val), xgetCValueVal(), "val", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     */
    public void setVal_IsNull() { regVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     */
    public void setVal_IsNullOrEmpty() { regVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * val: {varchar(2147483647)}
     */
    public void setVal_IsNotNull() { regVal(CK_ISNN, DOBJ); }

    protected void regVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVal(), "val"); }
    protected abstract ConditionValue xgetCValueVal();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<IdTestCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, IdTestCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<IdTestCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, IdTestCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<IdTestCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, IdTestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<IdTestCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, IdTestCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<IdTestCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, IdTestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;IdTestCB&gt;() {
     *     public void query(IdTestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<IdTestCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, IdTestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        IdTestCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(IdTestCQ sq);

    protected IdTestCB xcreateScalarConditionCB() {
        IdTestCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected IdTestCB xcreateScalarConditionPartitionByCB() {
        IdTestCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<IdTestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        IdTestCB cb = new IdTestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(IdTestCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<IdTestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(IdTestCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        IdTestCB cb = new IdTestCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(IdTestCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<IdTestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        IdTestCB cb = new IdTestCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(IdTestCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected IdTestCB newMyCB() {
        return new IdTestCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return IdTestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
