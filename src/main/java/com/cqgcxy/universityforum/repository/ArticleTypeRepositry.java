package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.entity.ArticleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleTypeRepositry extends JpaRepository<ArticleType,Long> {

}
