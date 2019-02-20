package com.edurt.ski.support

import com.edurt.ski.model.UserModel
import org.springframework.data.repository.PagingAndSortingRepository

interface UserSupport : PagingAndSortingRepository<UserModel, Long> {

}