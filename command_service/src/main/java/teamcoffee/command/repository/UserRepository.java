package teamcoffee.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamcoffee.command.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
