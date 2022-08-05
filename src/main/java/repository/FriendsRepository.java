package repository;

import com.example.org.generation.ItemsAPI.repository.entity.Friends;
import com.example.org.generation.ItemsAPI.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<Friends, Integer> {
}
