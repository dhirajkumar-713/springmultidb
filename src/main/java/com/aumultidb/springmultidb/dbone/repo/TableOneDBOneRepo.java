package com.aumultidb.springmultidb.dbone.repo;

import com.aumultidb.springmultidb.dbone.entities.TableOneForDbOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableOneDBOneRepo extends JpaRepository<TableOneForDbOne,Integer> {
    TableOneForDbOne findById(int id);
}
