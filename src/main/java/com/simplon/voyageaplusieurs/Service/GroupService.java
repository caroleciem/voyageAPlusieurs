package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.GroupM;
import org.springframework.stereotype.Service;

@Service
public interface GroupService {
    /**
     * Group creation method.
     * @param groupToCreate the group to create
     * @return the createdGroup
     */
    GroupM createGroup(GroupM groupToCreate);
}
