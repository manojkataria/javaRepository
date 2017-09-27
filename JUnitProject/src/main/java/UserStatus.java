package main.java;

import java.util.HashMap;
import java.util.Map;

public enum UserStatus { 

    BLOCKUSER("blockUser"), TERMINATED("deleteUser") ;

    private final String status;

    private static final Map<String, UserStatus > userStatusLookup = new HashMap<String, UserStatus> ();

    static {
        for (UserStatus d : UserStatus.values()) {
            userStatusLookup.put(d.getstatus(), d);
        }
    }

    private UserStatus(String status) {
        this.status = status;
    }

    public String getstatus() {
		return status;
	}

    public static UserStatus get(String status) {
        return userStatusLookup.get(status);
    }
    
}