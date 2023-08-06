package com.backend.ufc.modal.response;

import lombok.Data;

@Data
public class FightCardResponse {
    private int cardPostion;
    private String fighterName1;
    private String aliasName1;
    private String fighterName2;
    private String aliasName2;
    private String image1;
    private String image2;

}
