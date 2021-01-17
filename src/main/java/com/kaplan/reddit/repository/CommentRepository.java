package com.kaplan.reddit.repository;

import com.kaplan.reddit.model.Comment;
import com.kaplan.reddit.model.Post;
import com.kaplan.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
