package com.bit.demo.mapper;

import com.bit.common.mybatis.annotation.DataColumn;
import com.bit.common.mybatis.annotation.DataPermission;
import com.bit.common.mybatis.core.mapper.BaseMapperPlus;
import com.bit.demo.domain.TestTree;
import com.bit.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTree, TestTreeVo> {

}
