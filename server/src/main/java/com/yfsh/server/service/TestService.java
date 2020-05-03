package com.yfsh.server.service;

import com.yfsh.server.domain.Test;
import com.yfsh.server.domain.TestExample;
import com.yfsh.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("4");
        testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);
    }

}
