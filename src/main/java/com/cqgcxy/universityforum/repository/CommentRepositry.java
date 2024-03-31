package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.entity.Comment;
import com.cqgcxy.universityforum.resultmap.ViewComAndUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepositry extends JpaRepository<Comment,Long> {

    @Query("select new com.cqgcxy.universityforum.resultmap.ViewComAndUser(c,u) from Comment c,User u where c.comUserId=u.userId and c.comArtId=:artId")
    Page<ViewComAndUser> findViewComAndUser(Pageable pageable,@Param("artId") Long artId);
}
