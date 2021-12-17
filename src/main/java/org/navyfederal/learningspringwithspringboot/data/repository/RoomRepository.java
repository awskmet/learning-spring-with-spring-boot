package org.navyfederal.learningspringwithspringboot.data.repository;

import org.navyfederal.learningspringwithspringboot.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository <Room, Long> {
}
