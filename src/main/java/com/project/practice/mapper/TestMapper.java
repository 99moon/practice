package com.project.practice.mapper;

import com.project.practice.vo.TestVO;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface TestMapper {
  List<TestVO> selectList();

  TestVO selectUser(int id);

  int insertUser(TestVO testVO);

  int updateUser(TestVO testVO);

  int deleteUser(int id);
}
