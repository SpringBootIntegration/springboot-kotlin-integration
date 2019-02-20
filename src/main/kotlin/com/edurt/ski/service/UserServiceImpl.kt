package com.edurt.ski.service

import com.edurt.ski.model.UserModel
import com.edurt.ski.support.UserSupport
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service(value = "userService")
class UserServiceImpl(private val userSupport: UserSupport) : UserService {

    override fun getAll(page: Pageable): Page<UserModel> {
        return this.userSupport.findAll(page)
    }

    override fun save(model: UserModel): UserModel {
        return this.userSupport.save(model)
    }

}