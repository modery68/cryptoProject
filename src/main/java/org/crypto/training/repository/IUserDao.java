package org.crypto.training.repository;

import org.crypto.training.model.User;

import java.util.List;

public interface IUserDao {

    public List<User> getUsers();

}