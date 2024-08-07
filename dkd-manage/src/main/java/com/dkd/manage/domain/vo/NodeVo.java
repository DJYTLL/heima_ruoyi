package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.Region;
import lombok.Data;

@Data
public class NodeVo extends Node {
    //合作商
    private Partner partner;
    //合作商名称
    private String partnerName;
    //所在区域
    private Region region;
    //所在区域名称
    private String regionName;
    //设备数量
    private Integer VMCount;


}
