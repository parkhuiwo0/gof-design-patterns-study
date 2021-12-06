package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.decorator._01_before;

public class Client {

    private CommentService commentService;

    private boolean enabledSpamFilter;

    private boolean enabledTrimming;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        /**
         * Comment를 남길 때, Trimming을 해야한다. 필요없는 문자를 정리하고 싶다.
         * -> 가장 쉬운 방법은 CommentService를 확장한 다른 서비스를 만드는 것이다.
         * Client client = new Client(new TrimmingCommentService());
         *
         * http를 제거하는 스팸 필터링을 해야한다면?
         * 또, SpamFilteringCommentService를 만든다.
         * Client client = new Client(new SpamFilteringCommentService());
         *
         * 그럼 둘 다 필요한 상황에서는?
         */
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
