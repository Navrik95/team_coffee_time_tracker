package teamcoffee.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamcoffee.command.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
