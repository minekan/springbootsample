package com.xxx.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.xxx.dbflute.exbhv.*;
import com.xxx.dbflute.exentity.*;

/**
 * The referrer loader of id_test as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfIdTest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<IdTest> _selectedList;
    protected BehaviorSelector _selector;
    protected IdTestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfIdTest ready(List<IdTest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected IdTestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(IdTestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<IdTest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
