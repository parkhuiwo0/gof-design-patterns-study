package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.decorator.after;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String commment) {
        commentService.addComment(commment);
    }
}
