package com.rpg.entity;

public class RpgMenuImgInfo extends BaseEntity {

    private Long imgId;
    private String img_name;
    private String active_path;
    private String selected_path;
    private String desc;

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public String getImg_name() {
        return img_name;
    }

    public void setImg_name(String img_name) {
        this.img_name = img_name;
    }

    public String getActive_path() {
        return active_path;
    }

    public void setActive_path(String active_path) {
        this.active_path = active_path;
    }

    public String getSelected_path() {
        return selected_path;
    }

    public void setSelected_path(String selected_path) {
        this.selected_path = selected_path;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
