package com.sevenbits.jbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JBeans implements java.io.Serializable {
    private List<Map<String, String>> employee;
    private static boolean createFlag = false;
    private Map<String, String> map;

    public JBeans() {
        employee = new ArrayList<Map<String, String>>();
        map = new HashMap<String, String>();
        map.put("Jon", "Martin");
        map.put("Nick", "North");
        map.put("Micky", "Banson");
        map.put("Robert", "Watson");
        employee.add(map);
    }

    public List<Map<String, String >> getEmployee() {
        return employee;
    }

    public Map<String, String> getMap() {
        return map;
    }
}
