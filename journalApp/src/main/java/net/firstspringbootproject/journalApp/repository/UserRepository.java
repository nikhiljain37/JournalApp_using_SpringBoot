package net.firstspringbootproject.journalApp.repository;

import net.firstspringbootproject.journalApp.entity.JournalEntry;
import net.firstspringbootproject.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User, ObjectId>{

    User findByUserName(String username);

}
