package com.uob.splcache.service;

import com.uob.splcache.model.Manager;
import com.uob.splcache.repo.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("MangerService")
public class ManagerService{
    @Autowired
    private ManagerRepository managerRepository;

    @CachePut(value = "MANAGER_KEY3")
    public Map<String, Object> findAllManagers() {
        Map<String, Object> map = new HashMap<>();
        List<Manager> managers = managerRepository.findAll();
        map.put("MANAGER", managers);
        return map;
    }

    @CachePut(value = "MANAGER_SECOND_KEY")
    public Map<String, Object> findSecondAllManagers() {
        Map<String, Object> map = new HashMap<>();
        List<Manager> managers = managerRepository.findAll();
        map.put("MANAGER", managers);
        return map;
    }

}
