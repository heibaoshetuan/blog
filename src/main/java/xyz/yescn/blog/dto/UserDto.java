package xyz.yescn.blog.dto;



public class UserDto extends BaseDto{
    private String desc;
    private String phone;

    public UserDto() {
        super();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
