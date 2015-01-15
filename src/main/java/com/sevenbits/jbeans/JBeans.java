package com.sevenbits.jbeans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class JBeans implements java.io.Serializable {
    private List<Map<String, String>> employee;
    private Map<String, String> map;

    public JBeans() {
        employee = new ArrayList<Map<String, String>>();
        map = new HashMap<String, String>();
        map.put("firstName", "Jon");
        map.put("surName", "Martin");
        employee.add(map);
        map = new HashMap<String, String>();
        map.put("firstName", "Nick");
        map.put("surName", "North");
        employee.add(map);
        map = new HashMap<String, String>();
        map.put("firstName", "Micky");
        map.put("surName", "Banson");
        employee.add(map);
        map = new HashMap<String, String>();
        map.put("firstName", "Robert");
        map.put("surName", "Watson");
        employee.add(map);
    }

    public List<Map<String, String >> getEmployee() {
        return employee;
    }
}
