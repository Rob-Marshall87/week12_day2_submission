package com.codeclan.filesystem.filesystem.repository;

import com.codeclan.filesystem.filesystem.models.Folder;
import com.codeclan.filesystem.filesystem.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
