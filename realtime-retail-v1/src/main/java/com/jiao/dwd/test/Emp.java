package com.jiao.dwd.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Package com.jiao.dwd.test.Emp
 * @Author xinyi.jiao
 * @Date 2025/4/11 9:33
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    Integer empno;
    String ename;
    Integer deptno;
    Long ts;
}
