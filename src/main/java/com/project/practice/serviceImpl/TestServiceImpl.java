package com.project.practice.serviceImpl;

import com.project.practice.mapper.TestMapper;
import com.project.practice.service.TestService;
import com.project.practice.vo.TestVO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

  private final SqlSession sqlSession;

  @Transactional(readOnly = true)
  public List<TestVO> selectList() {
    TestMapper tm = sqlSession.getMapper(TestMapper.class);
    return tm.selectList();
  }

  @Transactional(readOnly = true)
  public TestVO selectUser(int id) {
    TestMapper tm = sqlSession.getMapper(TestMapper.class);
    return tm.selectUser(id);
  }


  @Transactional
  public int insertUser(TestVO testVO) {
    TestMapper tm = sqlSession.getMapper(TestMapper.class);
    return tm.insertUser(testVO);
  }

  @Transactional
  public int updateUser(TestVO testVO) {
    TestMapper tm = sqlSession.getMapper(TestMapper.class);
    return tm.updateUser(testVO);
  }

  @Transactional
  public int deleteUser(int id) {
    TestMapper tm = sqlSession.getMapper(TestMapper.class);
    return tm.deleteUser(id);
  }
}
