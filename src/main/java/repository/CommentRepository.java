package repository;

import com.example.org.generation.ItemsAPI.repository.entity.Comment;
import com.example.org.generation.ItemsAPI.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
