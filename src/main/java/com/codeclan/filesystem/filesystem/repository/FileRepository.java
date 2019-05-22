package com.codeclan.filesystem.filesystem.repository;


import com.codeclan.filesystem.filesystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
