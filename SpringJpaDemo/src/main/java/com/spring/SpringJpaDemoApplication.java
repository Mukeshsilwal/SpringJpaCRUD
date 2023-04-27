package com.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.Dao.UserRepository;
import com.spring.entites.User;
import com.spring.Dao.UserRepository;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJpaDemoApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
//	User user=new User();
//	user.setId(1);
//	user.setCustNo(100);
//	user.setName("Ram");
//	User user1=new User();
//	user1.setCustNo(200);
//	user1.setId(2);
//	user1.setName("shyam");
//	List<User> list=List.of(user,user1);
//	Iterable<User> result=userRepository.saveAll(list);
//	result.forEach(u->{
//		System.out.println(u);
//	});
//	Optional<User> optional=userRepository.findById(2);
//	User user=optional.get();
//	user.setName("Mukesh");
//	User user4=userRepository.save(user);
//	System.out.println(user4);
	Iterable<User> itr=userRepository.findAll();
	itr.forEach(i->System.out.println(i)
			);
	userRepository.deleteAll(itr);
}

}
