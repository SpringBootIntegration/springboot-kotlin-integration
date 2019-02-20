package com.edurt.ski.service

import com.edurt.ski.model.UserModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface UserService {

    /**
     * save model to db
     */
    fun save(model: UserModel): UserModel

    /**
     * get all model
     */
    fun getAll(page: Pageable): Page<UserModel>

}