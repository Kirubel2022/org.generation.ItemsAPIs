package repository;

import com.example.org.generation.ItemsAPI.repository.entity.Comment;
import com.example.org.generation.ItemsAPI.repository.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
