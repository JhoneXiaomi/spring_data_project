package com.jhone;

import org.junit.Test;
import util.JDBCUnit;

/**
 * @Author jhone
 * @Description:
 * @Date 15:05 2017/11/20
 * Modified by:
 */
public class JDBCUtilTest {

    @Test
    public void testJDBC() throws  Exception{
        System.out.println(JDBCUnit.getConnection());
    }
}
