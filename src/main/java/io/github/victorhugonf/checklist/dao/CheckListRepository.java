package io.github.victorhugonf.checklist.dao;

import io.github.victorhugonf.checklist.jpa.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CheckListRepository extends JpaRepository<CheckList, UUID> {
}
