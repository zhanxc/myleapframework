package zxcwebapp.model;

import leap.orm.model.Model;

public class UserModel extends Model {
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}