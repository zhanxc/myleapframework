package zxcwebapp.controller;

import leap.core.exception.RecordNotSavedException;
import zxcwebapp.model.Post;

public class PostModelController {

	public Post create(String name,String descript) {
		
		Post post = new Post();
		post.setName(name);
		post.setDescript(descript);
		
		try {
            post.create();
            return post;
        } catch (RecordNotSavedException e) {
            e.printStackTrace();
            return null;
        }
	}
}
