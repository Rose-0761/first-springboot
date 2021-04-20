package com.zz.firstspringboot.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "aliyun")
@Component
@Data
public class AliyunProperties {
    private String xxxx;

    private String yyyy;

    private String aaaa;

    private String zzzz;

    private String bbbb;
    public String getXxxx(){return xxxx;}
    public void setXxxx(String xxxx){this.xxxx=xxxx;}
    public String getYyyy(){return yyyy;}
    public void setYyyy(String yyyy){this.yyyy=yyyy;}
    public String getZzzz(){return zzzz;}
    public void setZzzz(String zzzz){this.zzzz=zzzz;}
    public String getAaaa(){return aaaa;}
    public void setAaaa(String aaaa){this.aaaa=aaaa;}
    public String getBbbb(){return bbbb;}
    public void setBbbb(String bbbb){this.bbbb=bbbb;}
}
