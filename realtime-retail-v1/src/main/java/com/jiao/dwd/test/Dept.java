package com.jiao.dwd.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package com.jiao.dwd.test.Dept
 * @Author xinyi.jiao
 * @Date 2025/4/11 9:34
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    Integer deptno;
    String dname;
    Long ts;
}
