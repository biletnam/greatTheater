package bootsamples.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bootsamples.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer>{

	Genre findByName(String name);
	
}
