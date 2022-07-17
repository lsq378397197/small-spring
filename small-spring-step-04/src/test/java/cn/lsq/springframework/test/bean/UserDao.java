package cn.lsq.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "贾克斯");
        hashMap.put("10002", "易");
        hashMap.put("10003", "蛮族之王");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
