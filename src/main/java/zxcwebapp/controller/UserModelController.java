package zxcwebapp.controller;

import java.util.List;

import leap.core.exception.RecordNotSavedException;
import leap.orm.query.CriteriaQuery;
import zxcwebapp.model.User;

public class UserModelController {
    public User create(String name, Integer age, String loginId, String password){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setLoginId(loginId);
        user.setPassword(password);
        try {
            user.create();
            return user;
        } catch (RecordNotSavedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<User> query(String name, Integer age, String loginId){
    	if(name == null && age == null && loginId == null){
    		return User.all();
    	}
    	if(name == null){
    		name = "";
    	}
    	if(loginId == null){
    		loginId = "";
    	}
    	CriteriaQuery<User> cq = User.<User>query();
    	cq.where("name like ? and age like ? and loginId like ?", 
    			"%"+name+"%",age==null?"%%":"%"+age+"%","%"+loginId+"%");
    	return cq.list();
    }
    
    public List<User> userPost(){
    	return User.<User>query("user-post-list")
    			.orderBy("name").list();
    }
    
}
