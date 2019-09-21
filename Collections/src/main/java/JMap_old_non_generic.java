
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class JMap_old_non_generic {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(101,"iPhone");
        map.put(100,"iPad");
        map.put(105,"iPod");
        map.put(102,"Apple Watch");
        map.put(103,"Apple TV");
        
        Set set = map.entrySet();
        Iterator i= set.iterator();
        while(i.hasNext()){
            Map.Entry entry = (Map.Entry)i.next();
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
       
    }
}
