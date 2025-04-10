package com.xxx.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.xxx.dbflute.exbhv.*;
import com.xxx.dbflute.exentity.*;

/**
 * The referrer loader of test_table as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTestTable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TestTable> _selectedList;
    protected BehaviorSelector _selector;
    protected TestTableBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTestTable ready(List<TestTable> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TestTableBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TestTableBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TestTable> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
