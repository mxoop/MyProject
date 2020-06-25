package com.imooc.form;

import lombok.Data;

/**
 * Created by Rain on 2020/5/25.
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
