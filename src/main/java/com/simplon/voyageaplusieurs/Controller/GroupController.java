package com.simplon.voyageaplusieurs.Controller;

import com.simplon.voyageaplusieurs.Model.GroupM;
import com.simplon.voyageaplusieurs.Service.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/group")
@CrossOrigin(origins = "http://localhost:4200")
public class GroupController {

    private GroupService groupService;
    public GroupController(GroupService groupService){
        this.groupService = groupService;
    }
    @PostMapping
    public ResponseEntity<GroupM> createGroup(@RequestBody GroupM groupToCreate) {
        System.out.println(groupToCreate);
        GroupM savedGroup = groupService.createGroup(groupToCreate);
        return ResponseEntity.ok(savedGroup);
    }
}
