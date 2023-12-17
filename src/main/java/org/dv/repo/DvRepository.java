package org.dv.repo;

import java.util.List;
import org.dv.data.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvRepository extends JpaRepository<Data, Long> {
  List<Data> findAll();
}
