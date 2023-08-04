package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumerApplication {
	
	public static void main(String[] args) {
		
		List<User> userList=new ArrayList<User>();
		 userList.add(new User("1","Jaynam",30));
		 userList.add(new User("2","Sanghvi",30));
		 userList.add(new User("3","Pankaj",26));
		userList.add(new User("4","Snehal",23));
	//consumer accept() method .it is find and print all users
		Consumer<List<User>> consUser=s->System.out.println(s);
		consUser.accept(userList);
		
		//consumerforeach()
		Consumer<User> consForUser=s->System.out.println(s);
		userList.forEach(consForUser);
		
		//Then() method example
		Consumer<User> user1=y->System.out.println(y.getName().toLowerCase());
		Consumer<User> user2=x->System.out.println(x.getName().toUpperCase());
		
		Consumer<User> result=user1.andThen(user2);
		User user=new User("1","Jaynam",30);
		result.accept(user);
		result.accept(user);
		
	}

}
