package com.parkhuiwo0.designpatterns.gofdesignpatterns.prototype.example;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.prototype.after.GithubIssue;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.prototype.after.GithubRepository;
//import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        /*
         Java Reflection을 활용
         담겨진 데이터를 타겟으로 삼고있는 클래스 정보를 리플렉션 사용해서 데이터를 매핑해준다.
         */
//        ModelMapper modelMapper = new ModelMapper();
//        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
//        System.out.println(githubIssueData);
    }
}
