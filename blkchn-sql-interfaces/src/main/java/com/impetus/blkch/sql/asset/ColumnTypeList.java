package com.impetus.blkch.sql.asset;

import com.impetus.blkch.sql.parser.LogicalPlan;

public class ColumnTypeList extends LogicalPlan {
    
    public static final String DESCRIPTION = "COlUMN_TYPE_LIST";
    
    public ColumnTypeList() {
        super(DESCRIPTION);
    }

}