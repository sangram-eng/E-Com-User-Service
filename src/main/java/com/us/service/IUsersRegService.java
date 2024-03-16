package com.us.service;

import com.us.dto.UserRegDto;

public interface IUsersRegService {

    /**
     *
     * @param UserRegDto - UserRegDto Object
     */
    void createAccount(UserRegDto userDto);

    /**
     *
     * @param Id - Input User Id
     * @return Accounts Details based on a given Id
     */
    UserRegDto fetchAccount(String id);

    /**
     *
     * @param userRegDto - UserRegDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(UserRegDto userDto);

    /**
     *
     * @param id - Input user id
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String id);


}
