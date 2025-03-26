package com.sparen.income.domain.enums;

import java.util.Objects;

public enum AuthType {
    PASSWORD(1),GOOGLE(2);

    private final Integer idAuth;

    AuthType(Integer idAuth) {
        this.idAuth = idAuth;
    }
    public Integer getIdAuth(){
        return idAuth;
    }
    public static AuthType getType(Integer idAuth){
        for(AuthType authType : AuthType.values()){
            if(Objects.equals(authType.getIdAuth(), idAuth)){
                return authType;
            }
        }
        throw new IllegalArgumentException("ID doesnt exist");
    }
}
