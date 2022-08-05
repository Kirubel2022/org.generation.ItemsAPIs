package repository;

import com.example.org.generation.ItemsAPI.repository.entity.Comment;
import org.apache.coyote.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Integer> {
}
