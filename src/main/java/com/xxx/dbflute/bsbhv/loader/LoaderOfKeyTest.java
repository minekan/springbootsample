package com.xxx.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.xxx.dbflute.exbhv.*;
import com.xxx.dbflute.exentity.*;

/**
 * The referrer loader of key_test as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfKeyTest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<KeyTest> _selectedList;
    protected BehaviorSelector _selector;
    protected KeyTestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfKeyTest ready(List<KeyTest> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected KeyTestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(KeyTestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<KeyTest> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
