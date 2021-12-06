package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.decorator._01_before;

public class TrimmingCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
