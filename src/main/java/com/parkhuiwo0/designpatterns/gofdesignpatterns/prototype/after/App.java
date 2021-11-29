package com.parkhuiwo0.designpatterns.gofdesignpatterns.prototype.after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        // 바꾸고자 하는 데이터는 아래 두 개이다.
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        /**
         * Shallow Copy
         * GithubIssue가 가지고 있는 repository는 어떻게 될까?
         * 기본적으로 자바는 shallow copy이다. (repository가 같다)
         *
         * repository의 이름이 바뀐다면? clone에도 영향을 준다.
         * clone()을 임의로 구성해서 depp copy로 구현할 수 있다.
         *
         */
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());
        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());
    }

}
