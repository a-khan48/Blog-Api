package com.restapi.blogplatformhw.repository;


import com.restapi.blogplatformhw.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
