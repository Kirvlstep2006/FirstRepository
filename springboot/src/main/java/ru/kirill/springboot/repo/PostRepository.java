package ru.kirill.springboot.repo;

import org.springframework.data.repository.CrudRepository;

import ru.kirill.springboot.models.Post;

public interface PostRepository extends CrudRepository<Post,Long> {

}
