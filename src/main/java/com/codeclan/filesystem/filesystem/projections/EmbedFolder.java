package com.codeclan.filesystem.filesystem.projections;

import com.codeclan.filesystem.filesystem.models.Folder;
import com.codeclan.filesystem.filesystem.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedFolder", types = User.class)
public interface EmbedFolder {
    String getName();
    ArrayList<Folder> getFolders();
}
