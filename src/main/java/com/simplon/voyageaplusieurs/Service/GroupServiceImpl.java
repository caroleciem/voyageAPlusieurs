package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.GroupM;
import com.simplon.voyageaplusieurs.Repository.GroupRepository;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService{
    private GroupRepository groupRepository;


    //constructor
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;

    }
    @Override
    public GroupM createGroup(GroupM groupToCreate) {
        return groupRepository.save(groupToCreate);
    }
}
