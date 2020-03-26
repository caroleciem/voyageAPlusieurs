package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.GroupM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupM, Long> { }
