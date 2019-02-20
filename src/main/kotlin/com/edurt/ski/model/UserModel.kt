package com.edurt.ski.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
//class UserModel(
//        @Id
//        @GeneratedValue
//        private var id: Long? = 0,
//        private var name: String
//)
class UserModel {

        @Id
        @GeneratedValue
        var id: Long? = 0
                get() = field
                set

        var name: String? = null
                get() = field
                set

}