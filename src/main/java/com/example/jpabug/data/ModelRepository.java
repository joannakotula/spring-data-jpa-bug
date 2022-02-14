package com.example.jpabug.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ModelRepository extends JpaRepository<Model, Long> {

    Model findTopByOtherIdAndNStatusInOrderByIdAsc(Long otherId, Collection<Status> nstatuses);

}
