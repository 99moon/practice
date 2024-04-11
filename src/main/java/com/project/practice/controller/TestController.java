package com.project.practice.controller;

import com.project.practice.service.TestService;
import com.project.practice.vo.TestVO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final TestService testService;

  @GetMapping("/list")
  public List<TestVO> selectList() {
    return testService.selectList();
  }

  @GetMapping("/user")
  public TestVO selectUser(@RequestParam int id) {
    return testService.selectUser(id);
  }

  @PostMapping("/user")
  public int insertUser(@RequestBody TestVO testVO) {
    return testService.insertUser(testVO);
  }

  @PutMapping("/user")
  public int updateUser(@RequestBody TestVO testVO) {
    return testService.updateUser(testVO);
  }

  @DeleteMapping("/user")
  public int deleteUser(@RequestParam int id) {
    return testService.deleteUser(id);
  }

//  @PutMapping("selectTempById")
//  public ResponseEntity<TestVO> selectTemplateById(@Valid @RequestBody TemplateVO templateVO) {
//    TestVO result = testService.selectTempById(templateVO.getTemplateId());
//    return new ResponseEntity<>(result, HttpStatus.OK);
//  }


}
