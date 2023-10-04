package com.closet.colours;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Repository
public interface ColoursRepository extends PagingAndSortingRepository<Colours, String> {

    Colours findById(@Param("id") Long id);

    @Query(
            value = "SELECT c " +
                    "FROM Colours c " +
                    "order by c.nombre"
    )
    List<Colours>obtenerColores();
}
