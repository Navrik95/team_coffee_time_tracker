package teamcoffee.command.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamcoffee.command.entity.Team;

public interface TeamRepository extends JpaRepository<Team,Long> {
}
