package com.Simple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Batchrepo extends JpaRepository<Batch, Integer> {

}
