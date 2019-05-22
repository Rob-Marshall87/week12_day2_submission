package com.codeclan.filesystem.filesystem.projections;

import com.codeclan.filesystem.filesystem.models.Folder;
import com.codeclan.filesystem.filesystem.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    User getUser();
}
