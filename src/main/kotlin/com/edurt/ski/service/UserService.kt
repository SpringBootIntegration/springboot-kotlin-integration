package com.edurt.ski.service

import com.edurt.ski.model.UserModel

interface UserService {

    /**
     * save model to db
     */
    fun save(model: UserModel): UserModel

}