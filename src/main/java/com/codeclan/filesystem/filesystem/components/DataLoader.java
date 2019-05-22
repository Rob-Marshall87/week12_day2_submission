package com.codeclan.filesystem.filesystem.components;

import com.codeclan.filesystem.filesystem.models.File;
import com.codeclan.filesystem.filesystem.models.Folder;
import com.codeclan.filesystem.filesystem.models.User;
import com.codeclan.filesystem.filesystem.repository.FileRepository;
import com.codeclan.filesystem.filesystem.repository.FolderRepository;
import com.codeclan.filesystem.filesystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User user1 = new User("John");
        userRepository.save(user1);

        Folder folder1 = new Folder("stuff", user1);
        folderRepository.save(folder1);

        File file1 = new File("things", "txt", 6, folder1);
        fileRepository.save(file1);

        folder1.addFile(file1);
        folderRepository.save(folder1);
    }



}
