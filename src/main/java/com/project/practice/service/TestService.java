package com.project.practice.service;

import com.project.practice.vo.TestVO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
  List<TestVO> selectList();

  TestVO selectUser(int id);

  int insertUser(TestVO testVO);

  int updateUser(TestVO testVO);

  int deleteUser(int id);
}
